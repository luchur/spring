package aware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luchuang
 * @date 2020-11-20
 *
 * Spring中提供一些Aware相关接口，比如BeanFactoryAware、ApplicationContextAware、ResourceLoaderAware、ServletContextAware等，
 * 实现这些Aware接口的bean在被初始之后，可以取得一些相对应的资源，例如实现BeanFactoryAware的bean在初始后，Spring容器将会注入BeanFactory的实例，
 * 而实现ApplicationContextAware的bean，在bean被初始后，将会被注入ApplicationContext的实例等
 */
public class AwareTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"application-aware.xml");
		Test test = (Test) classPathXmlApplicationContext.getBean("test");
		test.testAware();
	}
}
