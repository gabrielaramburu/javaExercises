module console {
	//requires api; I can declare explicity this dependency or to declare in factory module
	//that this also exports the api interface with the line: requires transitive api; 
	requires factory;
}