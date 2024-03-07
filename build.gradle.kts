plugins {
    kotlin("jvm") version "1.9.21"
    id("org.jetbrains.compose")
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.lavish"
            artifactId = "test"
            version = "1.0"

            from(components["java"])
        }
    }
}

group = "com.lavish"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    implementation(compose.desktop.currentOs)
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}