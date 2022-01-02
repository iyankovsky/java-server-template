# Changelog

## [Unreleased]
### Changed
- Java version to '17'.

## [2021.12] - 2021-12-01
### Changed
- Gradle version to `7.3`.

## [2021.11] - 2021-11-01
### Added
- [Pitest] tool for mutation testing.

## [2021.10] - 2021-10-01
### Added
- [Custom Gradle plugin] for test-driven development.
- [Jacoco] code coverage tool with appropriate Github action.
- [Checkstyle] tool.

### Changed
- [Gradle Doctor] version to `0.7.3`.
- [JUnit] version to `5.8.1`.

## [2021.9] - 2021-09-01
### Added
- [JUnit] `5.7.2` testing library.
- `Task` class.
- [Gradle test logger plugin] `3.0.0`.
- Github action to build project on push.

### Changed
- `Issue` interface.
- Gradle version to `7.2`.
- Distribution of JDK from OpenJDK to Adoptium.

## [2021.8] - 2021-08-01
### Added
- Java Toolchain setup.
- Inferring modules path for JPMS.
- Module for common entities.
- Empty `Issue` interface.
- FAQ.

### Changed
- Gradle version to `7.1.1`.
- [Gradle Doctor] version to `0.7.1`.

## [2021.6] - 2021-07-01
### Added
- Gradle plugin to check for dependency updates.

### Changed
- Gradle version to `7.1`.
- Git version to `2.32.0`.

## [2021.5] - 2021-06-01
### Added
- Top-level project structure.
- Basic documentation.
- Minimal Gradle setup.
- [Gradle Doctor] plugin.
- Heap size limit for Gradle Daemon.
- MIT license.

[Unreleased]: https://github.com/iyankovsky/java-server-template/compare/v2021.12...HEAD
[2021.12]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.12
[2021.11]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.11
[2021.10]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.10
[2021.9]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.9
[2021.8]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.8
[2021.6]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.6
[2021.5]: https://github.com/iyankovsky/java-server-template/releases/tag/v2021.5

[Pitest]: https://pitest.org
[JUnit]: https://junit.org/junit5
[Gradle test logger plugin]: https://github.com/radarsh/gradle-test-logger-plugin
[Jacoco]: https://www.eclemma.org/jacoco
[Gradle Doctor]: https://runningcode.github.io/gradle-doctor
[Custom Gradle plugin]: https://docs.gradle.org/current/userguide/custom_plugins.html
[Checkstyle]: https://checkstyle.sourceforge.io
