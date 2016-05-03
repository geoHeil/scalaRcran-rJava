#problem rJava library not found on classpath

rJava seems to be not found by the JVM even though it is in the dependencies.
What is wrong with the setup?

```
Cannot find JRI native library!
Please make sure that the JRI native library is in a directory listed in java.library.path.

java.lang.UnsatisfiedLinkError: no jri in java.library.path
        at java.lang.ClassLoader.loadLibrary(ClassLoader.java:1864)
        at java.lang.Runtime.loadLibrary0(Runtime.java:870)

```
