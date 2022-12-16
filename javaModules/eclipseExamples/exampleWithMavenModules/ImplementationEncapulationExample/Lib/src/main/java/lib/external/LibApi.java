package lib.external;

import lib.impls.LibApiImpl;

public interface LibApi {
	public void testMethod();
	
	static LibApi createMethod() {
		return new LibApiImpl();
	}
}
