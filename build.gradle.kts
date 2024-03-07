plugins {
    kotlin("jvm") version "1.9.21"
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "in.lavish.java-library-test"
            artifactId = "test"
            version = "1.0"

            from(components["java"])
        }
    }
}

group = "in.lavish.java-library-test"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}