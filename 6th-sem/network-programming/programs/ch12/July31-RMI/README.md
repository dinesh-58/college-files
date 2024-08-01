# Running instructions 

1) Open terminal (cmd) & cd into src/
2) run `start rmiregistry` (**must be run from src/**). Opens a cmd window, let it be.
3) `cd july31/rmi`
4) compile all 4 files using `javac *.java`
	- NOTE: Use `dir` to ensure that .class files are generated in the same folder. 
	- IDEs will place these elsewhere, which causes issues.
5) Run ServerSide.java, then ClientSide.java

## If running inside your IDE fails
- Do not run ServerSide.java from your IDE. 
- In the previous terminal window, cd back to src with `cd ../../` 
	- then run `start java -classpath . -Djava.rmi.server.codebase=file:./ july31.rmi.ServerSide`
    - This should open a window saying "Server ready"
- ClientSide can be run from the IDE or terminal using `java july31.rmi.ClientSide`

(see [Oracle RMI docs](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/hello/hello-world.html#start) for more info) 