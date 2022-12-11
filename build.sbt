lazy val commonSettings = Seq(
  organization := "biandratti",
  scalaVersion := "2.13.8",
  scalacOptions += "-Xsource:3",
  ThisBuild / scapegoatVersion := "1.4.15",
  wartremoverErrors ++= Warts.unsafe.diff(Seq(Wart.Any)),
  coverageFailOnMinimum := true,
  coverageMinimumStmtTotal := 100,
  coverageMinimumBranchTotal := 100
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "ci-seed"
  )

addCommandAlias("checkFormat", ";scalafmtSbtCheck ;scalafmtCheckAll")
addCommandAlias("lint", ";compile ;scapegoat")
addCommandAlias("testCoverage", ";coverage ;test ;coverageAggregate")
addCommandAlias("verify", ";checkFormat ;lint ;testCoverage")
