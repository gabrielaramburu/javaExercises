package analyzera;

import apiservice.Analyzer;

public class AnalyzerImpl implements Analyzer{

	@Override
	public String getName() {
		return "analyzerA";
	}

	@Override
	public int analyze() {
		return 10;
	}

}
