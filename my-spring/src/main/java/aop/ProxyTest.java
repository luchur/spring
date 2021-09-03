package aop;

/**
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
