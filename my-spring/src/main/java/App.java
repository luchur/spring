import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author luchuang
 * @date 2020-11-07
 */
public class App {

	public static void main(String[] args) {

		//将配置文件封装为Resource类型
		ClassPathResource resource = new ClassPathResource("application.xml");

		BeanFactory beanFactory = new XmlBeanFactory(resource);

		HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");

		System.out.println(helloWorld.getTestStr());

	}
}
