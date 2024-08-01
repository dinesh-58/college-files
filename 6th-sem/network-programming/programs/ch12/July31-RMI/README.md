# Running instructions 

1) Open terminal (cmd)
& cd into src/
2) run `start rmiregistry` (must be run from src/). Opens a cmd window, let it be.
3) Run ServerSide.java, then ClientSide.java

## If running inside your IDE fails
1) Open terminal (for windows, use cmd instead of Powershell)
& cd into src/july31/rmi
2) compile all 4 files using `javac *.java`
Use `dir` to ensure that .class files are generated in the same folder 
3) **IMPORTANT:** cd back to src with `cd ../..` 
4) `start rmiregistry` (must be run from src/)
5) Do not run ServerSide.java from your IDE. Use `start java -classpath . -Djava.rmi.server.codebase=file:./ july31.rmi.ServerSide`.
This should open a window saying "Server ready"
6) ClientSide can be run from the IDE or terminal using `java july31.rmi.ClientSide`

(see [Oracle RMI docs](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html#start) for more info) 