module factory {
	exports factory;

	
	requires transitive api; //this also export de api to client of this module
	//the alternative is just do use requires api; and to explicity to declare in each
	//factory's client that they need the api module.
	
	//this is a problem: each new implementation forces a change in this file.
	requires implA;
	requires implB;
}