package lib.external;

import lib.impls.LibApiImpl;

public interface LibApi {
	public void testMethod();
	
	static LibApi createMethod() {
		//any argument can be passed here to decide which impld to return. 
		return new LibApiImpl();
	}
}
