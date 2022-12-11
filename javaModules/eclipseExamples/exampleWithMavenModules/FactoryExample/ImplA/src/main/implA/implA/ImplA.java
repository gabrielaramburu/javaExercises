package implA;

import api.MyApi;

public class ImplA implements MyApi{
	
	public static final String NAME = "ImplA";
	
	@Override
	public void doSomething() {
		System.out.println("doing something according to ImplA");
	}

}
