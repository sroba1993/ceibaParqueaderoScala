name := """play-scala-ParqueaderoCeiba"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.0"

libraryDependencies += guice
libraryDependencies += evolutions
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test

libraryDependencies += "com.typesafe.play" %% "play-slick" % "3.0.0"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "3.0.0"
libraryDependencies += "com.h2database" % "h2" % "1.4.196"
libraryDependencies += "org.typelevel" %% "cats-core"   % "1.4.0"
libraryDependencies += "org.typelevel" %% "cats-kernel" % "1.4.0"
libraryDependencies += "org.typelevel" %% "cats-macros" % "1.4.0"
libraryDependencies += "ch.qos.logback"      % "logback-classic" % "1.1.2"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-Xfatal-warnings"
)

routesGenerator := InjectedRoutesGenerator
