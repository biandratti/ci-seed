lazy val commonSettings = Seq(
  organization := "biandratti",
  scalaVersion := "2.13.8",
  scalacOptions += "-Xsource:3",
  ThisBuild / scapegoatVersion := "1.4.15",
  wartremoverErrors ++= Warts.unsafe.diff(Seq(Wart.Any)),
  coverageFailOnMinimum := true,
  coverageMinimumStmtTotal := 100,
  coverageMinimumBranchTotal := 100,
  semanticdbEnabled := true,
  semanticdbVersion := scalafixSemanticdb.revision,
  scalacOptions ++= List(
    "-Wunused"
  )
)

lazy val queue =
  project
    .in(file("queue"))
    .settings(commonSettings)
    .settings(
      name := "queue",
      libraryDependencies ++= Seq(
        "org.typelevel" %% "cats-effect" % "3.3.12",
        "org.scalameta" %% "munit" % "0.7.29" % Test,
        "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test
      )
    )

addCommandAlias("checkFormat", ";scalafmtSbtCheck ;scalafmtCheckAll")
addCommandAlias("scapegoatLint", ";compile ;scapegoat")
addCommandAlias("scalafixLint", ";compile ;scalafix")
addCommandAlias("testCoverage", ";coverage ;test ;coverageAggregate")
addCommandAlias(
  "verify",
  ";checkFormat ;scapegoatLint ;scalafixLint ;testCoverage"
)
