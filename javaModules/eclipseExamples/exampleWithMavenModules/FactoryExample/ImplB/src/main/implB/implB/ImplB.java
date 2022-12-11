package implB;

import api.MyApi;

public class ImplB implements MyApi{
	public static final String NAME = "ImplB";
	
	@Override
	public void doSomething() {
		System.out.println("Doing something according to ImplB. ");
	}

}
