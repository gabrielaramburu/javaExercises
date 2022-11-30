package springIoc.annotationbased.example2;

import org.springframework.stereotype.Component;

@Component("implA")
public class MyInterfaceImplA implements MyInterface2 {
	@Override
	public void doSomething() {
		System.out.println("Executing ImplA");
	}

}
