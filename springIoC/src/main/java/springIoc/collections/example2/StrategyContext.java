package springIoc.collections.example2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import springIoc.collections.MyTestInterface;

public class StrategyContext {
	private Map<String, MyTestInterface> implementations;
	
	public StrategyContext(Map<String, MyTestInterface> impls) {
		this.implementations = impls;	
	}
	
	public void executeSomething() {
		this.implementations.forEach((id, impl) -> System.out.println(id + " " + impl));
	}

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						ConfigurationExample2.class);
		
		StrategyContext strategy = context.getBean(StrategyContext.class);
		strategy.executeSomething();
	}
}
