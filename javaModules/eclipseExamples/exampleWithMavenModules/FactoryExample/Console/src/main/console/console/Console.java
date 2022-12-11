package console;

import java.util.List;

import api.MyApi;
import factory.MyFactory;

public class Console {

	public static void main(String[] args) {
		System.out.println("Console");
		List<String> impls = MyFactory.getSupportedImplementations();
		System.out.println(impls.toString());
		
		MyApi impl = MyFactory.getImpl(impls.get(1));
		impl.doSomething();
	}

}
