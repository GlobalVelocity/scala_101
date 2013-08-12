
name := "scala_101"

version := "1.0"

scalaVersion := "2.10.2"

resolvers ++= Seq("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/", "Maven Central Server" at "http://repo1.maven.org/maven2")

resolvers += "MavenRepo" at "http://mvnrepository.com/artifact/"

libraryDependencies ++=  Seq("com.typesafe.akka" %% "akka-actor" % "2.2.0","com.typesafe.akka" %% "akka-contrib" % "2.2.0")

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-remote" % "2.2.0","com.typesafe.akka" %% "akka-slf4j" % "2.2.0")

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-testkit" % "2.2.0","com.typesafe.akka" %% "akka-kernel" % "2.2.0")

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-cluster" % "2.2.0","com.typesafe.akka" % "akka-multi-node-testkit_2.10" % "2.2.0")

libraryDependencies ++= Seq("ch.qos.logback" % "logback-core" % "1.0.6", "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime","org.scalatest" %% "scalatest" % "1.9.1" % "test")

libraryDependencies ++= Seq("com.escalatesoft.subcut" %% "subcut" % "2.0","net.liftweb" % "lift-json_2.10" % "2.5")

libraryDependencies ++= Seq("commons-io" % "commons-io" % "2.0.1","com.google.guava" % "guava" % "12.0")

libraryDependencies ++= Seq("org.ektorp" % "org.ektorp" % "1.4.0", "com.fasterxml.jackson.core" % "jackson-core" % "2.2.0")

libraryDependencies ++= Seq("joda-time" % "joda-time" % "2.1", "org.joda" % "joda-convert" % "1.2", "jcifs" % "jcifs" % "1.3.17")

seq(ScctPlugin.instrumentSettings : _*)

scalacOptions ++= Seq("-deprecation", "-feature", "-language:postfixOps", "-language:implicitConversions")
