import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
  lazy val embeddedRedis = "com.github.kstyrc" % "embedded-redis" % "0.6"
  lazy val redisScala = "com.github.etaty" %% "rediscala" % "1.9.0"
  lazy val akka = "com.typesafe.akka" %% "akka-actor" % "2.5.26"
}
