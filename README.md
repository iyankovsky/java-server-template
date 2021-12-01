# Template of a server-side Java project
[![project: alpha](https://oss.aoapps.com/ao-badges/project-alpha.svg)](https://aoindustries.com/life-cycle#project-alpha)
[![management: preview](https://oss.aoapps.com/ao-badges/management-preview.svg)](https://aoindustries.com/life-cycle#management-preview)
[![packaging: developmental](https://oss.aoapps.com/ao-badges/packaging-developmental.svg)](https://aoindustries.com/life-cycle#packaging-developmental)

![Build](https://github.com/iyankovsky/java-server-template/workflows/Build/badge.svg)
[![Coverage](.github/badges/jacoco.svg)](https://github.com/iyankovsky/java-server-template/actions/workflows/build.yaml)
[![Branches](.github/badges/branches.svg)](https://github.com/iyankovsky/java-server-template/actions/workflows/build.yaml)
[![Mutation tested with PIT](https://img.shields.io/badge/-Mutation%20tested%20with%20PIT-blue.svg)](http://pitest.org/)

[![java: &gt;= 16](https://oss.aoapps.com/ao-badges/java-16.svg)](https://adoptium.net)
![License: MIT](https://img.shields.io/github/license/iyankovsky/java-server-template)

This template provides a reference implementation of a typical task tracker system,
which can be examined and converted into a base for developing a real-world enterprise project.

## Development

### Build system
[Gradle] `7.3` is used as a build and task execution system.

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

### Java
Java 16 is used as the main language.

Implementation features:
* Java Platform Module System (JPMS) is used for all non-test modules.

### Version control system
[Git] `2.34.1` is used to manage the codebase and releases. Release versions adheres to [calendar versioning].

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




One of the drawbacks of the microservice concept is that it is difficult to design a distributed microservice architecture right at the start of a project, and mistakes made at this stage can be very expensive. For this reason, the most common advice is to start with the monolith and then divide it into target microservices.

Overall Concept

task management system for a hypothetical support team

task management system

- User Management
Access to the system functionality should be possible only for logged in users. That is why we will need a module enabling user management and an authentication system.

- Task Management
We will implement the basic functionality of the ticketing system, i.e. creating tasks with a name and description and changing the status of the task to "completed."

- Knowledge Base
It is worth to make the knowledge base available to users - as articles available after logging into the system.

- REST API
All functionalities listed above should be available via the REST API.
Thanks to this, it will be possible to create dedicated applications facilitating the use of the system. It can be a web application available through a browser or a dedicated mobile application.

- Web Application
Our system should be available through a web browser, so we will add an element that is a simple web application.

- Sending Notifications of New Tasks
Creating a new task should cause sending a notification to all users. We will use for this purpose the API made available by Slack.


Thanks to these features, the prototype building process can be limited to the coding of the task module and web app, while the remaining functionalities will be implemented using ready-made Cricket modules. This will significantly reduce the time it takes to create a prototype, and that is what we are looking for.

The overall architecture of the monolithic application is based on the hexagonal architecture of the Cricket platform. The assumed functionalities are implemented by dedicated adapters.

The target system will consist of a set of separate microservices, each of which will be responsible for a specific functionality.
