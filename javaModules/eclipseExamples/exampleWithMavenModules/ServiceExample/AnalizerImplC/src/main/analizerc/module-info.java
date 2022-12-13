import analizerc.AnalizerC;

module analizerImplC {

	requires apiServiceWithFactory;
	provides apiservice.factory.Analyzer2 with analizerc.AnalizerC;
}