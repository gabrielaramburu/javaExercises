package apiservice.factory;

import java.util.ServiceLoader;

public interface Analyzer2 {
	String getName();
	
	//in this case the responsibility of creating instances belongs to the Api, 
	//not the client
	//Notice how the module-info needs to use the uses declaration.
	public static Iterable<Analyzer2> getAnalizers() {
		return ServiceLoader.load(Analyzer2.class);
	}
}
