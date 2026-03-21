plugins {
    id("com.github.ben-manes.versions") version "0.52.0"
    id("application")
    id("org.sonarqube") version "7.2.3.7755"
}

sonar {
    properties {
        property("sonar.projectKey", "Dima258kk_java-project-61")
        property("sonar.organization", "dima258kk")
    }
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

application {
    // Входная точка
    mainClass.set("hexlet.code.App")
}
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
