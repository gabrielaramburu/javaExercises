module analizerImplB {

	requires apiService;
	provides  apiservice.Analyzer with analyzerb.AnalyzerImplB;
}