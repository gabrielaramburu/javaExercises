package springIoc.annotationbased.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Example1 {
	@Autowired
	@Qualifier("myImplA") 
	//Without this line the container can not inject the bean because of the ambiguity problem:
	//there are two possible implementations available
	private MyInterface1 myInterface;
	
	public void doSomething() {
		myInterface.doSomething();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationbased/user-bean-config.xml");
		Example1 example1 = context.getBean(Example1.class);
		example1.doSomething();
		
	}

}
