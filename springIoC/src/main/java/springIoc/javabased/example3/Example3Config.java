package springIoc.javabased.example3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example3Config {

	@Bean
	@Qualifier("implA")
	public MyInterface3 implA() {
		return new MyInterfaceImplA();
	}
	
	@Bean
	@Qualifier("implB")
	public MyInterface3 implB() {
		return new MyInterfaceImplB();
	}
	
	@Bean
	public Example3 example3() {
		return new Example3();
	}
}


