package springIoc.collections.example2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springIoc.collections.MyTestImplementationA;
import springIoc.collections.MyTestImplementationB;
import springIoc.collections.MyTestImplementationC;
import springIoc.collections.MyTestInterface;

@Configuration
public class ConfigurationExample2 {
	//here is the point of this example: Spring initialize this attribute with all available implementations.
	//then we must to pass the map to the constructor of the StrategyContext class.
	@Autowired
	private Map<String, MyTestInterface> implementations;
	
	@Bean
	public StrategyContext strategy() {
		return new StrategyContext(implementations);
	}

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
