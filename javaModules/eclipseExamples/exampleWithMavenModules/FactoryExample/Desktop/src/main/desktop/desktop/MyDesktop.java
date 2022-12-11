package desktop;

import java.util.List;

import api.MyApi;
import factory.MyFactory;

public class MyDesktop {

	public static void main(String[] args) {
		System.out.println("Desktop");
		List<String> impls = MyFactory.getSupportedImplementations();
		System.out.println(impls.toString());
		
		MyApi impl = MyFactory.getImpl(impls.get(0));
		impl.doSomething();
	}

}
