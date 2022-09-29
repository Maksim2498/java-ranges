# Java Ranges

![Logo](/images/logo.png)

## Index

- [Index](#index);
- [About](#about);
- [Installation](#installation);
- [Building](#building);
- [Documentation](#documentation).

## About

This library provides the most basic ranges classes and interfaces.
All ranges are inclusive.

Interfaces:
- (`Range`)[/src/main/java/space/moontalk/ranges/Range.java].

Classes:
- (`ByteRange`)[/src/main/java/space/moontalk/ranges/ByteRange.java];
- (`ShortRange`)[/src/main/java/space/moontalk/ranges/ShortRange.java];
- (`IntegerRange`)[/src/main/java/space/moontalk/ranges/IntegerRange.java];
- (`LongRange`)[/src/main/java/space/moontalk/ranges/LongRange.java];
- (`FloatRange`)[/src/main/java/space/moontalk/ranges/FloatRange.java];
- (`DoubleRange`)[/src/main/java/space/moontalk/ranges/DoubleRange.java].

## Installation

First, add MoonTalk repository to your pom.xml:

```xml
<repository>
    <id>moontalk</id>
    <url>httsp://repo.moontalk.space/repository/maven-releases/</url>
</repository>
```

Second, add library as dependency:

```xml
<dependency>
    <groupId>space.moontalk</groupId>
    <artifactId>ranges</artifactId>
    <version>1.0.1</version>
</dependency>
```

Done.

## Building

Just execute the following Maven command in your terminal:

```bash
mvn install
```

## Documentation

Will be added soon...
