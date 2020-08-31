package haifeng.cong.annotation;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/7/30 9:42
 *
 * @author conghaifeng
 */
public class ActionDefination {

    //该方法所对应的类
    private Class<?> klass;

    //该执行方法的对象
    private Object object;

    //该方法
    private Method method;

    //该方法的所有参数
    private List<Parameter> paramerterList;

    protected ActionDefination(Class<?> klass, Object object, Method method, List<Parameter> parameterList) {
        this.klass = klass;
        this.object = object;
        this.method = method;
        this.paramerterList = paramerterList;
    }

    protected Class<?> getKlass() {
        return klass;
    }

    protected Object getObject() {
        return object;
    }

    protected Method getMethod() {
        return method;
    }

    protected List<Parameter> getParamerterList() {
        return paramerterList;
    }
}
