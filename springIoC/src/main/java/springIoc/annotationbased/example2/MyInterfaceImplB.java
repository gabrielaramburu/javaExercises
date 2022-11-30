package springIoc.annotationbased.example2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("implB")
public class MyInterfaceImplB implements MyInterface2 {
	@Override
	public void doSomething() {
		System.out.println("Executing ImplB");
	}

}
