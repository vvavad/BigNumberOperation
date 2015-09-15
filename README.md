# BigNumberOperation
Addition and multiplication operation of Big Number with hundreds or thousands of digits 

Library to add big numbers

This interface has a single method: compute (String, String) which all of its implementers will 

define. Any new implementation can be added to this library by simply adding a new class 

These classes hold some common things which will be used by all or some of the concrete 

a. AbstractOperation holds default logger instantiation. 

b. AbstractAddition class has common methods which will be used by addition and 

I have kept these two classes separate as any future implementation may or may not need the 

Implements Operation and extends AbstractAddition and are concrete implementation of 

It is a factory implementation to get different Operation implementations at one place. This can 

NumberLibrary interface and its implementation BigNumberLibrary class gives a user friendly 

interface for the end users of the library to call available operations directly. 

The BigNumberLibrary internally uses Operation factory to call appropriate operations. 

6. NumberLibraryException: is the main exception class that BigNumberLibrary classes throw. This 

is further sub classed to following specific exception classes. 

Logger interface defines a simple log method which accepts the level and string message to be 

SystemLogger is a concrete implementation of Logger which logs to console. 

Different such implementation can be added to the library and easily used by the library

OperationFactory and BigNumberLibrary both the classes can be used by the end user.

1. BigNumberLibrary provides a user friendly way by giving specific set of operations.

2.  OperationFactory will need some understanding of the class to call appropriate operation and 

then call the compute method, however considering extensibility of the library, it will be the 

only class that will require modification while adding a new operation.
