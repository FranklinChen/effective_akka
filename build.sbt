scalaVersion := "2.10.3"

name := "Effective Akka"

//seq(ScctPlugin.instrumentSettings : _*)

libraryDependencies ++= Seq(
          "com.typesafe.akka" %% "akka-actor" % "2.2.3",
          "com.typesafe.akka" %% "akka-slf4j" % "2.2.3",
          "com.typesafe.akka" %% "akka-testkit" % "2.2.3" % "test",
          "ch.qos.logback" % "logback-classic" % "1.0.13",
	  "org.scalatest" %% "scalatest" % "2.0.1-SNAP4" % "test"
)
