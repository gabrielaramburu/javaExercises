package clientusingfactory;

import apiservice.factory.Analyzer2;

public class Main {

	public static void main(String[] args) {
		Iterable<Analyzer2> analyzers = Analyzer2.getAnalizers();
		for (Analyzer2 analyzer: analyzers) {
			System.out.println(analyzer.getName());
		}
	}

}
