package springIoc.annotationbased.example1;

import org.springframework.stereotype.Component;

@Component("myImplA")
public class MyInterfaceImplA implements MyInterface1 {
	
	@Override
	public void doSomething() {
		System.out.println("Executing ImplA");
	}

}
