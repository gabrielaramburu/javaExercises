This example show a very simple pattern: API with factory.

One module contains an API a its implementations.
Also contain an static factory method.
The module only export the API and the factory.

The client module use the factory to instantiate an implementation.

The client module only know about the API. (at compile time of course)
