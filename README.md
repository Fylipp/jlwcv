#Java Lightweight Immutable Collections (JLWIC)

##General
The JLWIC library consists of a set of wrappers for  the `java.util.Collection` and `java.util.Map` interfaces, as well as most of their sub-interfaces.

##Usage
This library has no further dependencies and you only need to download the latest build from the `Releases` tab in Github or clone the repository and build it yourself. As soon as the JAR-file is in your `CLASSPATH` you should be ready to use JLWIC. All wrappers can be found in the `com.fylipp.jlwic` package. If you try to modify an immutable wrapper it throws an unchecked `com.fylipp.jlwic.ImmutableException`.

##License
This library uses the MIT license. In short this means:
- You MAY use this product commercially
- You MAY distribute this product
- You MAY modify this product
- You MAY use this product privately
- You MUST include a copy of the license and copyright notice in your code
- The creator of this product CANNOT be held liable for any damage caused by this product (it comes with no warranty)
Please note this summary does NOT replace the license and may not be up-to-date. Please refer to the license file for the complete license.
