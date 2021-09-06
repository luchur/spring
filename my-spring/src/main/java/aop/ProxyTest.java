package aop;

/**
 * AOP的简单实现,在目标对象的方法执行之前和之后时行了增强,Spring的AOP实现其实也是用了Proxy和InvocationHandler这两个东西
 *
 * @author luchuang
 * @date 2021-09-03 18:09:33
 */
public class ProxyTest {


	public static void main(String[] args) {
		//实例化目标对象
		UserService userService = new UserServiceImpl();

		//实例化invocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		//根据目标生成代理对象
		UserService proxy = (UserService)invocationHandler.getProxy();
		//调用代理对象的方法
		proxy.add();
	}

}
