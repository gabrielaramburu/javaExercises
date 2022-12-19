This example shows how to use Service for a better decoupling.
![imagen](https://user-images.githubusercontent.com/63823685/207307900-48f136c1-2dba-4817-b1b6-7e56c5bb6921.png)

On the left side, the example shows the case where the Client has the responsability of iterate over the implementations (it has a dependency on ServiceLoader)

On the right side, the example shows a better option in which the API offers a method that return the instance. In this case the API has a dependency on ServiceLoader)
