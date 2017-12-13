name := "introduction"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= {
  Seq(
    // For Akka 2.4.x or 2.5.x
    "com.typesafe.akka" %% "akka-http" % "10.0.10",
    "com.typesafe.akka" %% "akka-http-core" % "10.0.10",
    "com.typesafe.akka" %% "akka-http-testkit" % "10.0.10",
    "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.10",
    // Only when running against Akka 2.5 explicitly depend on akka-streams in same version as akka-actor
    "com.typesafe.akka" %% "akka-stream" % "2.4.19", // or whatever the latest version is
    "com.typesafe.akka" %% "akka-actor"  % "2.4.19", // or whatever the latest version is
    "com.typesafe.akka" %% "akka-testkit" % "2.4.19" % "test",
    "org.scalactic" %% "scalactic" % "3.0.1",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "junit" % "junit" % "4.11" % "test",
    "org.specs2" % "specs2-core_2.12" % "3.8.9" % "test",
    "org.specs2" % "specs2-mock_2.12" % "3.8.9",
    "com.byteslounge" %% "slick-repo" % "1.4.3",
    "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.11.0",
    "ch.megard" %% "akka-http-cors" % "0.2.1",
    "com.typesafe.slick" %% "slick" % "3.2.1",
    "com.typesafe.slick" %% "slick-hikaricp" % "3.2.1",
    "mysql" % "mysql-connector-java" % "5.1.16",
    "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "com.zaxxer" % "HikariCP" % "2.4.5",
    "org.slf4j" % "slf4j-nop" % "1.6.4"
  )
}