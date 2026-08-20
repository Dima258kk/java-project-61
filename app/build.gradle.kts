plugins {
    id("com.github.ben-manes.versions") version "0.53.0"
    id("application")
    id("org.sonarqube") version "7.2.3.7755"
    id("com.diffplug.spotless") version "6.25.0"
}

sonar {
    properties {
        property("sonar.projectKey", "Dima258kk_java-project-61")
        property("sonar.organization", "dima258kk")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
    }
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
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