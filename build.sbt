name := "scala-rJava"
organization := "testing.scala-R-rJava"
version := "0.0.1.SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

//could not find rJava in mavencentral
//libraryDependencies ++= Seq()

mainClass := Some("stats.JavaStuff")
//unmanagedJars in Compile += file("lib/rscala_2.11-1.0.9.jar")
unmanagedJars in Compile += file("lib/JRI.jar")
//unmanagedJars in Compile += file("externalLib/jri/JRIEngine.jar")
//unmanagedJars in Compile += file("externalLib/jri/REngine.jar")
