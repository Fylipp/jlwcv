#Java Lightweight Immutable Collections (JLWIC)

##General
The JLWIC library consists of a set of wrappers for  the `java.util.Collection` and `java.util.Map` interfaces, as well as most of their sub-interfaces.

##Usage
This library has no further dependencies and you only need to download the latest build from the `latest-build` directory or clone the repository and build it yourself. As soon as the JAR-file is in your `CLASSPATH` you should be ready to use JLWIC. All wrappers can be found in the `com.fylipp.jlwic` package. If you try to modify an immutable wrapper it throws an unchecked `com.fylipp.jlwic.ImmutableException`.