
This project shows an example of a factory using modules. The example is inspired from the book Java 9 Modules.

To generate de dependency tree I use 
mvn com.github.ferstl:depgraph-maven-plugin:3.0.1:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=factoryexample*:*"

![Captura de pantalla de 2022-12-11 13-48-53](https://user-images.githubusercontent.com/63823685/206917106-345bdd7b-ceca-4f22-a1ec-e23313ece7b0.png)

See this note: https://www.evernote.com/shard/s319/sh/3c7e4980-c127-40cb-5032-5527a156aaf7/21c3005f2c5242c3467dda5e6ea05eed
