package springIoc.annotationbased.example1;

import org.springframework.stereotype.Component;

@Component("myImplB")
public class MyInterfaceImplB implements MyInterface1 {

	@Override
	public void doSomething() {
		System.out.println("Executing ImplB");
	}

}
