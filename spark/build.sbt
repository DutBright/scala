lazy val root = (project in file(".")).
  settings(
    name := "spark",
    version := "1.0",
    scalaVersion := "2.11.7"
  )
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
