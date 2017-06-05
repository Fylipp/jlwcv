# Java Lightweight Collection Views (JLWCV)

The JLWCV library consists of a set of wrappers for  the `java.util.Collection` and `java.util.Map` interfaces, as well as most of their sub-interfaces. These wrappers delegate
any non-modifying method calls to the underlying collection. When a modification is attempted a `ViewMutationAttemptException` is thrown. The underlying collection can still be
modified with the original instance and the view will reflect any changes.

## Usage
```java
// Populate a normal Java list
List<String> mutableList = new ArrayList<>();
mutableList.add("Test #1");
mutableList.add("Test #2");

// Create a view
ListView<String> listView = new ListView<>(mutableList);

// This prints the first two entries
System.out.println(listView.get(0));
System.out.println(listView.get(1));

// Trying to modify the list results in a ViewMutationAttemptException
listView.add("This won't work");
```

## Installation
You can obtain pre-built JARs in the Releases tab or clone the repository and compile it yourself.

Alternatively you can add it as a Maven dependency. Note: The Maven dependency is a 'fake' dependency which uses JitPack to fetch the git repository and use it. Because of this 
you have to add a custom repository to your POM.

```xml
<dependency>
    <groupId>com.github.Fylipp</groupId>
    <artifactId>jlwcv</artifactId>
    <version>v2.0.0</version>
</dependency>
```

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

## License
**jlwcv** is published under the MIT License. The license can be found in the `LICENSE` file.
