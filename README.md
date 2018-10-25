# GeoIP2 Java API #

## Description ##

This is a fork of the 2.12.1 Java API for GeoIP2
It uses jackson 2.6.5 for compatability with Spark 2.2.0

see https://github.com/maxmind/GeoIP2-java for the 
original project the fork has been taken from

## Installation ##

### Maven ###

Installation is currently via building from source and adding
the jar file to the local maven installation

The following dependency can then be added to your pom.xml:

```xml
    <dependency>
        <groupId>uk.nominet</groupId>
        <artifactId>geoip2</artifactId>
        <version>2.12.1-jackson-2.6.5</version>
    </dependency>
```

## Copyright and License ##

Original software is Copyright (c) 2013-2018 by MaxMind, Inc.

This is free software, licensed under the Apache License, Version 2.0.
