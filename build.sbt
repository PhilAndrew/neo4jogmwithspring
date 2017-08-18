import Dependencies._

name := "neo4jogmwithspring"

version := "1.0"

scalaVersion := "2.12.3"


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.myorg",
      scalaVersion := "2.12.2",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "neo4jogmwithspring",
    libraryDependencies += scalaTest % Test,

    // Addition of these two lines for Neo4J OGM causes Spring at TestSpring2 class to go crazy and say
    // java.lang.NoClassDefFoundError: org/springframework/data/neo4j/transaction/Neo4jTransactionManage
    // but I want to use normal Neo4J OGM in my other code, Spring shouldn't be upset about me bring in these
    // dependencies to the project.
    libraryDependencies += "org.neo4j" % "neo4j-ogm-core" % "3.0.0-RC1",
    libraryDependencies += "org.neo4j" % "neo4j-ogm-bolt-driver" % "3.0.0-RC1",


    libraryDependencies += "junit" % "junit" % "4.12" % "test",

    //spring
    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-parent" % "1.5.6.RELEASE",
    libraryDependencies += "org.springframework.cloud" % "spring-cloud-starter-eureka" % "1.3.2.RELEASE",
    libraryDependencies += "org.springframework.cloud" % "spring-cloud-starter-ribbon" % "1.3.2.RELEASE",
    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "1.5.6.RELEASE",
    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-actuator" % "1.5.6.RELEASE",
    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-data-redis" % "1.5.6.RELEASE",
    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-test" % "1.5.6.RELEASE" % "test",
    libraryDependencies += "com.googlecode.json-simple" % "json-simple" % "1.1.1",
    libraryDependencies += "javax.servlet" % "jstl" % "1.2",
    libraryDependencies += "org.springframework.boot" % "spring-boot-test" % "1.5.6.RELEASE",
    libraryDependencies += "com.fasterxml.jackson.module" % "jackson-module-parameter-names" % "2.9.0",
    libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.0",
    libraryDependencies += "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % "2.9.0",
    libraryDependencies += "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.9.0",
    libraryDependencies += "org.springframework.cloud" % "spring-cloud-dependencies" % "Camden.SR6",
    libraryDependencies += "org.springframework.boot" % "spring-boot-maven-plugin" % "1.5.6.RELEASE",
    libraryDependencies += "org.springframework" % "spring-test" % "4.3.10.RELEASE" % "test",
    //    libraryDependencies += "org.springframework.data" % "spring-data-neo4j" % "5.0.0.RC2"
    libraryDependencies += "org.springframework" % "spring-test" % "4.3.10.RELEASE" % "test"
  )


