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

# steps 

  - set `-Djava.library.path=externalLib/jri` in your IDE results in the following error
  
  ```
  # A fatal error has been detected by the Java Runtime Environment:
  #
  #  SIGSEGV (0xb) at pc=0x000000012c3ecf42, pid=33480, tid=5891
  #
  # JRE version: Java(TM) SE Runtime Environment (8.0_74-b02) (build 1.8.0_74-b02)
  # Java VM: Java HotSpot(TM) 64-Bit Server VM (25.74-b02 mixed mode bsd-amd64 compressed oops)
  # Problematic frame:
  # C  [libR.dylib+0x134f42]  GetNewPage+0x1a2
  #
  # Failed to write core dump. Core dumps have been disabled. To enable core dumping, try "ulimit -c unlimited" before starting Java again
  #
  # An error report file with more information is saved as:
  # /Users/geoHeil/Downloads/rjaav/hs_err_pid33480.log
  #
  # If you would like to submit a bug report, please visit:
  #   http://bugreport.java.com/bugreport/crash.jsp
  # The crash happened outside the Java Virtual Machine in native code.
  # See problematic frame for where to report the bug.
  
  - trying to set it in sbt fails 
  ```
