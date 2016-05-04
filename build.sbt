name := "scala-rJava"
organization := "testing.scala-R-rJava"
version := "0.0.1.SNAPSHOT"

scalaVersion := "2.10.6"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

//libraryDependencies ++= Seq(
//  "org.rosuda.REngine" %% "REngine" % "2.1.0"
//)

mainClass := Some("stats.JavaStuff")
unmanagedJars in Compile += file("lib/JRI.jar")
unmanagedJars in Compile += file("lib/JRIEngine.jar")
unmanagedJars in Compile += file("lib/REngine.jar")

javaOptions in run += "-Djava.library.path= externalLib/jri/"
