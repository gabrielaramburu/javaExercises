package factory;

import java.util.List;

import api.MyApi;
import implA.ImplA;
import implB.ImplB;

public class MyFactory {
	public static List<String> getSupportedImplementations() {
		return List.of(ImplA.NAME, ImplB.NAME);
	}
	
	public static MyApi getImpl(String implName) {
		switch (implName) {
		case ImplA.NAME: return new ImplA();
		case ImplB.NAME: return new ImplB();
		default: throw new IllegalArgumentException("No such implementation");
		}
	}
}
