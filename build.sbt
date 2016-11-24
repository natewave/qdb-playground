name := """qdb-playground"""
organization := "com.zengularity"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

resolvers += "qdb releases" at "https://maven.quasardb.net"

libraryDependencies ++= Seq(
  jdbc,
  filters,

  "com.typesafe.play" %% "anorm" % "2.5.2",

  // quasardb
  "net.quasardb" % "qdb" % "2.0.0rc5",

  // metrics
  "nl.grons" %% "metrics-scala" % "3.5.5",

  // test
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.zengularity.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.zengularity.binders._"
