package haifeng.cong.DynamicProxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description: InvocationHandler实现类
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/5 23:38
 *
 * @author conghaifeng
 */
public class MyInvokationHandler implements InvocationHandler {

    //需要被代理的对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /*proxy代表动态代理对象*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtil.method1();
        Object invoke = method.invoke(target, args);
        DogUtil.method2();
        return invoke;
    }
}
