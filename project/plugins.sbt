scalacOptions ++= Seq( "-unchecked", "-deprecation" )

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.bintrayRepo("sbt-scalajs-plugin", "maven")

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.0-M3")

// Dependency Resolution
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.2")

// Publishing
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.3")

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0") // scalastyle

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4") // dependencyUpdates

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2") // scalariformFormat
