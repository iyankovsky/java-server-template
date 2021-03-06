# Template of a server-side Java project
[![project: alpha](https://oss.aoapps.com/ao-badges/project-alpha.svg)](https://aoindustries.com/life-cycle#project-alpha)
[![management: preview](https://oss.aoapps.com/ao-badges/management-preview.svg)](https://aoindustries.com/life-cycle#management-preview)
[![packaging: developmental](https://oss.aoapps.com/ao-badges/packaging-developmental.svg)](https://aoindustries.com/life-cycle#packaging-developmental)

![Build](https://github.com/iyankovsky/java-server-template/workflows/Build/badge.svg)
[![Coverage](.github/badges/jacoco.svg)](https://github.com/iyankovsky/java-server-template/actions/workflows/build.yaml)
[![Branches](.github/badges/branches.svg)](https://github.com/iyankovsky/java-server-template/actions/workflows/build.yaml)
[![Mutation tested with PIT](https://img.shields.io/badge/-Mutation%20tested%20with%20PIT-blue.svg)](http://pitest.org/)

[![Gradle 7.4](https://img.shields.io/badge/gradle-7.4-brightgreen.svg)](https://gradle.org)
[![Java 17](https://img.shields.io/badge/java-17-brightgreen.svg)](https://adoptium.net)

![License: MIT](https://img.shields.io/github/license/iyankovsky/java-server-template)

This template provides a reference implementation of a typical task management system,
which can be examined and converted into a base for developing a real-world enterprise project.

## Development

### Build system
[Gradle] `7.4` is used as a build and task execution system.

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
  * Mutation testing setup.
* Small modules
  * Easy to compose and replace.
  * Best for parallel task execution and execution plan optimization.
  * Friendly for [the build cache].

### Java
Java 17 is used as the main language.

Implementation features:
* Java Platform Module System (JPMS) is used for all non-test modules.

### Version control system
[Git] `2.35.1` is used to manage the codebase and releases. Release versions adheres to [calendar versioning].

## Testing

This project demonstrates the use of several types of automated tests:
* **Microtests** for the main logic
  * Heavily involved in the main cycle of **test driven development**.
  * Mostly use **detached datasets** shared across the team.
* Basic **environment tests** to verify development process
  * Intended to be launched either at the beginning of work on a project or after changing the system configuration.
* **Code coverage** reporting
  * Per module and aggregated.
* **Mutation testing** to check tests quality
  * Only for core modules with critical business logic.

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
[the build cache]: https://docs.gradle.org/current/userguide/build_cache.html
[MIT]: https://choosealicense.com/licenses/mit
