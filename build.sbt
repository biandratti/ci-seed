Global / dependencyCheckFormats := Seq("HTML", "JSON")

scalaVersion := "2.13.8"

lazy val commonSettings = Seq(
  organization := "biandratti",
  scalaVersion := "2.13.8",
  scalacOptions += "-Xsource:3",
  ThisBuild / scapegoatVersion := "1.4.17",
  wartremoverErrors ++= Warts.unsafe.diff(Seq(Wart.Any)),
  coverageFailOnMinimum := true,
  coverageMinimumStmtTotal := 80,
  coverageMinimumBranchTotal := 80,
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
        "org.typelevel" %% "cats-effect" % "3.4.6",
        "org.scalameta" %% "munit" % "0.7.29" % Test,
        "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test
        // "commons-beanutils" % "commons-beanutils" % "1.9.1" // with vulnerability
      )
    )

addCommandAlias("checkFormat", ";scalafmtSbtCheck ;scalafmtCheckAll")
addCommandAlias("scapegoatLint", ";compile ;scapegoat")
addCommandAlias("scalafixLint", ";compile ;scalafix")
addCommandAlias(
  "testCoverage",
  ";coverage ;test ;coverageAggregate; coverageReport"
)
addCommandAlias(
  "verify",
  ";checkFormat ;scapegoatLint ;scalafixLint ;testCoverage; dependencyCheck"
)
