module analizerImplA {

	requires apiService;
	//apiservice.Analyer is the interface 
	//and analysera.AnalyserImpl is the implementation.
	//The difference with the previous example (factoryExample) is that in this case
	//the implementation module dones't exports the package, only the implementation
	provides apiservice.Analyzer with analyzera.AnalyzerImpl; 
}