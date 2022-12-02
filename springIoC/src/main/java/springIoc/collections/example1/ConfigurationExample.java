package springIoc.collections.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springIoc.collections.MyTestImplementationA;
import springIoc.collections.MyTestImplementationB;
import springIoc.collections.MyTestImplementationC;
import springIoc.collections.MyTestInterface;

@Configuration
@ComponentScan("springIoc.collections")
public class ConfigurationExample {
	
	@Bean
	public MyTestInterface implA() {
		return new MyTestImplementationA();
	}
	
	@Bean
	public MyTestInterface implB() {
		return new MyTestImplementationB();
	}
	
	@Bean
	public MyTestInterface implC() {
		return new MyTestImplementationC();
	}
}
