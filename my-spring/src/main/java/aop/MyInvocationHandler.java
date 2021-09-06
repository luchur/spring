package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建自定义的InvocationHandler,用于对接口提供的方法时行增强
 * @author luchuang
 * @date 2021-09-03 17:59:49
 *
 * 1)构造函数,将代理的对象传入
 * 2)invoke方法,此方法实现了AOP增强的所有逻辑
 * 3)getProxy方法,此方法千篇一律,但必不可少
 */
public class MyInvocationHandler implements InvocationHandler {


	//目标对象
	private Object target;

	/**
	 * 构造方法
	 * @param target 目标对象
	 */
	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//在目标对象的方法执行之前简单的打印一下
		System.out.println("-----------before---------");

		//执行目标对象的方法
		Object result = method.invoke(target, args);

		//在目标对象的方法执行之后简单的打印一下
		System.out.println("----------after--------");
		return result;
	}

	/**
	 * 获取目标对象的代理对象
	 * @return 代理对象
	 */
	public Object getProxy(){
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces(),this);
	}
}
