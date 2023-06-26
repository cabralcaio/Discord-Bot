plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("dev.kord", "kord-core", "0.9.0")
    implementation("org.slf4j:slf4j-api:2.0.7") // SLF4J API
    implementation("ch.qos.logback:logback-classic:1.3.6") // Logback implementation
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1") //dotenv to run environment variables
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}