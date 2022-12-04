ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val commonSettings = Seq(
  organization := "biandratti",
  scalaVersion := "2.13.10",
  scalacOptions += "-Xsource:3"
  /*ThisBuild / scapegoatVersion := "1.4.15",
  wartremoverErrors ++= Warts.unsafe,
  coverageFailOnMinimum := true,
  coverageMinimumStmtTotal := 100,
  coverageMinimumBranchTotal := 100*/
)

lazy val root = (project in file("."))
  // .settings(commonSettings)
  .settings(
    name := "ci-seed"
  )

addCommandAlias("checkFormat", ";scalafmtSbtCheck ;scalafmtCheckAll")
addCommandAlias("lint", ";compile ;scapegoat")
addCommandAlias("testCoverage", ";coverage ;test ;coverageReport")
addCommandAlias("verify", ";checkFormat ;lint ;testCoverage")
