package springIoc.javabased.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
	/* Qualifier works the same in annotation-based and java-based annotation */

	@Autowired
	@Qualifier("implA")
	private MyInterface3 myInterface;
	
	
	@Autowired
	private MyInterface3 implB;
	
	public void doSomething() {
		myInterface.doSomething();
		implB.doSomething();
	}
	
	public static void main(String[] args) {
		//I don't understand why this class is not called JavaBasedConfigApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(Example3Config.class);
		
		Example3 example3 = context.getBean(Example3.class);
		example3.doSomething();
		
	}
	
	

}
