package tkpz_lab2_spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(
				"factory.xml"));
		Student student = (Student) beanFactory.getBean("student");
		student.study();

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"app_context.xml");
		Person person = (Person) appContext.getBean("person");
		person.getPersonAge();
	}

}
