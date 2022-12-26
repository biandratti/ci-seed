# ci-seed [![Build Status](https://github.com/biandratti/ci-seed/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/biandratti/ci-seed/actions/workflows/ci.yml) 
[![Coverage Status][coveralls-badge]][coveralls-status]

### Tasks
| Task             | Description                                                                                                                                | Command                     |
|:-----------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----------------------------|
| checkFormat      | Runs scalafmt is primarily designed to operate on entire text files—formatting selected ranges of code may produce undesirable results.    | ```$ sbt checkFormat```     |
| scalafixLint     | Runs scalafix, a refactoring and linting tool for Scala.                                                                                   | ```$ sbt scalafixLint```    |
| scapegoatLint    | Runs scapegoat, a refactoring and linting tool for Scala.                                                                                  | ```$ sbt scapegoatLint```   |
| testCoverage     | Runs the statement Coverage, a traditional code coverage tools.                                                                            | ```$ sbt testCoverage```    |
| dependencyCheck  | Runs dependency-check against the current project, its aggregates and dependencies and generates a report for each project.                | ```$ sbt dependencyCheck``` |