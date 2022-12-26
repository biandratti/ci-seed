# ci-seed [![Build Status](https://github.com/biandratti/ci-seed/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/biandratti/ci-seed/actions/workflows/ci.yml) [![codecov](https://codecov.io/gh/biandratti/ci-seed/branch/master/graph/badge.svg?token=ID4WYFMJ5A)](https://codecov.io/gh/biandratti/ci-seed)

Continuous Integration as example to be used for scala projects

### Tasks
| Task             | Description                                                                                                                                                                                                                                                                                                                               | Command                     |
|:-----------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----------------------------|
| checkFormat      | Runs scalafmt is primarily designed to operate on entire text files—formatting selected ranges of code may produce undesirable results.                                                                                                                                                                                                   | ```$ sbt checkFormat```     |
| scalafixLint     | Runs scalafix, a refactoring and linting tool for Scala.                                                                                                                                                                                                                                                                                  | ```$ sbt scalafixLint```    |
| scapegoatLint    | Runs scapegoat, a refactoring and linting tool for Scala.                                                                                                                                                                                                                                                                                 | ```$ sbt scapegoatLint```   |
| testCoverage     | Runs the statement Coverage, a traditional code coverage tools.   https://app.codecov.io/                                                                                                                                                                                                                                                 | ```$ sbt testCoverage```    |
| dependencyCheck  | Software Composition Analysis (SCA) tool that attempts to detect publicly disclosed vulnerabilities contained within a project's dependencies. It does this by determining if there is a Common Platform Enumeration (CPE) identifier for a given dependency. If found, it will generate a report linking to the associated CVE entries.  | ```$ sbt dependencyCheck``` |

### Github Workflows
| Task             | Description                                                                                                  |
|:-----------------|:-------------------------------------------------------------------------------------------------------------|
| ci               | Runs all the CI, where it Checks the format, runs Lints, and then builds the tests with the coverage report. |
| dependency-check | Check for vulnerabilities.                                                                                   |
| dependency-graph | Check for vulnerabilities and builds a report.                                                               |
| scala-steward    | Runs a bot that helps you keep your library dependencies. https://github.com/scala-steward-org/scala-steward |

### Github secrets actions
| Task                       | Description                                                |
|:---------------------------|:-----------------------------------------------------------|
| APP_ID and APP_PRIVATE_KEY | https://github.com/scala-steward-org/scala-steward-action  |
| CODECOV_TOKEN              | https://app.codecov.io                                     |