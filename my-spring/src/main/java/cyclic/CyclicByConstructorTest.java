package cyclic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luchuang
 * @date 2020-11-12
 *
 *
 * 表示通过构造器注入构成的循环依赖，此依赖是无法解决的，只能抛出BeanCurrentlyInCreationException异常表示循环依赖。
 *
 * 如在创建TestA类时，构造器需要TestB类，那将去创建TestB，在创建TestB类时又发现需要TestC类，则又去创建TestC，
 * 最终在创建TestC时发现又需要TestA，从而形成一个环
 *
 * Spring容器将每一个正在创建的bean标识符放在一个“当前创建bean池”中，bean标识符在创建过程中将一直保持在这个池中，
 * 因此如果在创建bean过程中发现自己已经在“当前创建bean池”里时，将抛出BeanCurrentlyInCreationException异常表
 * 示循环依赖；而对于创建完毕的bean将从“当前创建bean池”中清除掉
 *
 * ● Spring容器创建“testA”bean，首先去“当前创建bean池”查找是否当前bean正在创建，如果没发现，
 *   则继续准备其需要的构造器参数“testB”，并将“testA”标识符放到“当前创建bean池”。
 * ● Spring容器创建“testB”bean，首先去“当前创建bean池”查找是否当前bean正在创建，如果没发现，
 *   则继续准备其需要的构造器参数“testC”，并将“testB”标识符放到“当前创建bean池”。
 * ● Spring容器创建“testC”bean，首先去“当前创建bean池”查找是否当前bean正在创建，如果没发现，
 *   则继续准备其需要的构造器参数“testA”，并将“testC”标识符放到“当前创建Bean池”。
 * ● 到此为止Spring容器要去创建“testA”bean，发现该bean标识符在“当前创建bean池”中，
 *   因为表示循环依赖，抛出BeanCurrentlyInCreationException。
 */
public class CyclicByConstructorTest {

	public static void main(String[] args) {

		try{
			new ClassPathXmlApplicationContext("application-constructor.xml");
		}catch (Exception e){
			Throwable e1 = e.getCause().getCause().getCause();
			System.out.println(e1);
		}

	}

}
