name := "TheBoard"

version := "1.0"

lazy val `theboard` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

libraryDependencies ++= Seq( jdbc , cache , ws ,   "org.postgresql" % "postgresql" % "9.4-1206-jdbc42", specs2 % Test )

libraryDependencies += "org.webjars.bower" % "bootstrap-sass" % "3.3.6"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  