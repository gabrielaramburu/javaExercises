module desktop {
	requires api; //actually this is not necessary because the factory has 
	//an requires transtitive api; declareation
	requires factory;
}