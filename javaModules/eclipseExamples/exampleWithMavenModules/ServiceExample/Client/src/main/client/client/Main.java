package client;

import java.util.ServiceLoader;

import apiservice.Analyzer;

public class Main {

	public static void main(String[] args) {
		//if at runtime there are not Analzer implementations at the classpath 
		// this list will be empty
		Iterable<Analyzer> myAnalizersFirst = ServiceLoader.load(Analyzer.class);
		for (Analyzer analizer: myAnalizersFirst) {
			System.out.println(analizer.getName() + " " + analizer.hashCode());
		}

		ServiceLoader<Analyzer>myAnalizersSecond = ServiceLoader.load(Analyzer.class);
		for (Analyzer analizer: myAnalizersSecond) {
			System.out.println(analizer.getName() + " " + analizer.hashCode());
		}
		
		myAnalizersSecond.reload();
		for (Analyzer analizer: myAnalizersSecond) {
			System.out.println(analizer.getName() + " " + analizer.hashCode());
		}
	}

}
