import Keys._

import bintray.Keys._

lazy val commonSettings = Seq(
  version in ThisBuild := "0.0.1",
  organization in ThisBuild := "me.rschatz",
  libraryDependencies in ThisBuild ++= Seq(
    "com.glassdoor.planout4j" % "planout4j-core" % "1.1",
    "com.glassdoor.planout4j" % "planout4j-compiler" % "1.1",
    "ch.qos.logback" % "logback-classic" % "1.1.3"
  )
)

lazy val root = (project in file(".")).
  settings(commonSettings ++ bintrayPublishSettings: _*).
  settings(
    sbtPlugin := true,
    name := "sbt-planout4j",
    description := "Compiles Planout4j yaml files to Planout language files",
    licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    publishMavenStyle := false,
    repository in bintray := "sbt-plugins",
    bintrayOrganization in bintray := None
  )