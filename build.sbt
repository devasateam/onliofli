name := "api"

version := "1.0"


lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "java-net" at "http://download.java.net/maven/2"

resolvers += "maven-repo" at "https://github.com/Redmart/maven-repo/raw/master/"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  cache,
  javaWs,
  "com.google.code.gson" % "gson" % "2.2.4",
  "redis.clients" % "jedis" % "2.0.0" exclude("org.slf4j", "slf4j-log4j12"),
  "commons-pool" % "commons-pool" % "1.5.5" exclude("org.slf4j", "slf4j-log4j12"),
  "net.vz.mongodb.jackson" % "play-mongo-jackson-mapper_2.10" % "1.1.0"
)
