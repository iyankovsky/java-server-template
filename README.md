# Template of a server-side Java project
![Build](https://github.com/iyankovsky/java-server-template/workflows/Build/badge.svg) [![Coverage](.github/badges/jacoco.svg)](https://github.com/iyankovsky/java-server-template/actions/workflows/build.yaml) [![Branches](.github/badges/branches.svg)](https://github.com/iyankovsky/java-server-template/actions/workflows/build.yaml) ![License: MIT](https://img.shields.io/github/license/iyankovsky/java-server-template)

This template provides a reference implementation of a typical task tracker system,
which can be examined and converted into a base for developing a real-world enterprise project.

## Development

### Build system
[Gradle] `7.2` is used as a build and task execution system.

Key features:
* [Gradle Wrapper]
  * The recommended way to version the build system itself.
* [Kotlin] language for build scripts
  * Advanced editing experience.
* [Java Toolchains]
  * Control of used JDK vendors and distributions.
  * Binding tasks to specific Java version.
* Special [custom plugins]
  * Optimized test-driven development.

### Java
Java 16 is used as the main language.

Implementation features:
* Java Platform Module System (JPMS) is used for all non-test modules.

### Version control system
[Git] `2.33.0` is used to manage the codebase and releases. Release versions adheres to [calendar versioning].

## FAQ
See the [FAQ](documentation/faq.md) for the answers to commonly asked questions.

## Changelog
All notable changes to this project are documented in [CHANGELOG](CHANGELOG.md) using the format suggested by the [keep a changelog] project.

## License
[MIT]

[Gradle]: https://gradle.org
[Gradle Wrapper]: https://docs.gradle.org/current/userguide/gradle_wrapper.html
[Kotlin]: https://gradle.org/kotlin
[Git]: https://git-scm.com
[calendar versioning]: https://calver.org
[keep a changelog]: https://keepachangelog.com/en/1.0.0
[Java Toolchains]: https://blog.gradle.org/java-toolchains
[custom plugins]: https://docs.gradle.org/current/userguide/custom_plugins.html
[MIT]: https://choosealicense.com/licenses/mit
