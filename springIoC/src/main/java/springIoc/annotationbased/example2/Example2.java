package springIoc.annotationbased.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Example2 {
	@Autowired
	@Qualifier("implB")
	private MyInterface2 myInterface;
	
	@Autowired
	private MyInterface2 implA; //notice how in this case Spring resolves the dependency because the name of the
	//attribute (implA) is the same as the declared in the @Component
	
	
	
	public void doSomething() {
		myInterface.doSomething();
		implA.doSomething();
		
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotationbased/user-bean-config.xml");
		Example2 example = context.getBean(Example2.class);
		example.doSomething();
		
	}

}
