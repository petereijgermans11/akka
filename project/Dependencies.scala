import sbt._

object Version {
  val akkaVer         = "2.4.14"
  val logbackVer      = "1.1.3"
  val scalaVer        = "2.12.1"
  val scalaParsersVer = "1.0.4"
  val scalaTestVer    = "3.0.1"

}

object Dependencies {
  val dependencies = Seq(
    "com.typesafe.akka"       %% "akka-actor"                 % Version.akkaVer,
    "com.typesafe.akka"       %% "akka-slf4j"                 % Version.akkaVer,
    "ch.qos.logback"           % "logback-classic"            % Version.logbackVer,
    "org.scala-lang.modules"  %% "scala-parser-combinators"   % Version.scalaParsersVer,
    "com.typesafe.akka"       %% "akka-testkit"               % Version.akkaVer % "test",
    "org.scalatest"           %% "scalatest"                  % Version.scalaTestVer % "test"
  )
}
