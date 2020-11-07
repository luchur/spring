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

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));

		HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");
		System.out.println(helloWorld.getTestStr());

	}
}
