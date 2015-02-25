resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

// web plugins

// Comment to get more information during initialization
logLevel := Level.Warn

// Cloudbees
resolvers += "Sonatype OSS Snasphots" at "http://oss.sonatype.org/content/repositories/snapshots"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0-RC2")

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0-RC3")