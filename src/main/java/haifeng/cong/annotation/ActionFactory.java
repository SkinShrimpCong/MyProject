package haifeng.cong.annotation;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/7/30 9:51
 *
 * @author conghaifeng
 */
public class ActionFactory {

    private static final Map<String, ActionDefination> ACTION_DEFINATION_MAP = new HashMap<>();

    //单例模式
    private ActionFactory() {

    }

    public static ActionFactory newInstance() {
        return CreateNewInstance.ACTION_FACTORY;
    }

    private static class CreateNewInstance {
        private static final ActionFactory ACTION_FACTORY = new ActionFactory();
    }

    //     通过类，扫描其所在包下的所有文件
    public void scanAction(Class<?> klass) {
        scanAction(klass.getPackage().getName());
    }

    // 通过包名称，扫描其下所有文件
    public void scanAction(String packageName) {
        //包扫描
        new PackageScanner() {

            @Override
            public void dealClass(Class<?> klass) {
                if (!klass.isAnnotationPresent(Service.class)) {
                    return;
                }
                try {
                    // 直接由反射机制产生一个对象，将其注入
                    Object object = klass.newInstance();
                    // 扫描该类下的所有方法
                    scanPackage(klass);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.scanPackage(packageName);
    }

    public void scanAction(Object object) {
        try {
            scanMethod(object.getClass(), object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void scanMethod(Class<?> klass, Object object) throws Exception {
        //得到所有方法
        Method[] declaredMethods = klass.getDeclaredMethods();

        //遍历所有方法，找到带有Actioner注解的方法
        for (Method method : declaredMethods) {
            if (!method.isAnnotationPresent(Actioner.class)) {
                continue;
            }
            Actioner actioner = method.getAnnotation(Actioner.class);
            String action = actioner.action();
            //判断action方法是否已经定义
            if (ACTION_DEFINATION_MAP.get(action) != null) {
                throw new Exception("方法" + action + "已定义");
            }

            //得到所有参数，并判断参数是否满足要求
            Parameter[] parameters = method.getParameters();
            List<Parameter> parameterList = new ArrayList<>();
            for (int i = 0; i < parameters.length; i++) {
                Parameter parameter = parameters[i];
                if (!parameters[i].isAnnotationPresent(Aparameter.class)) {
                    throw new Exception("第" + (i + 1) + "个参数未定义！");
                }

                parameterList.add(parameter);
            }

            //将得到的结果添加到map中
            addActionDefination(action, klass, object, method, parameterList);
        }

    }

    private void addActionDefination(String action, Class<?> klass, Object object, Method method, List<Parameter> parameterList) {

        ActionDefination actionDefination = new ActionDefination(klass, object, method, parameterList);
        ACTION_DEFINATION_MAP.put(action, actionDefination);

    }

    protected ActionDefination getActionDefination(String action) {
        return ACTION_DEFINATION_MAP.get(action);
    }

}



