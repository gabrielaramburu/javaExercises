package analyzerb;

import apiservice.Analyzer;

public class AnalyzerImplB implements Analyzer {

	@Override
	public String getName() {
		return "analyzer b";
	}

	@Override
	public int analyze() {
		return 20;
	}

}
