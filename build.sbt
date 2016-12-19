name := "etc-client"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scorexfoundation" %% "scorex-core" % "2.0.0-M3",
  "com.madgag.spongycastle" % "core" % "1.54.0.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)