plugins {
    id("java")
}

group = "ru.zmaev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

dependencies {
    implementation("org.keycloak:keycloak-server-spi:21.1.2")
    implementation("org.keycloak:keycloak-server-spi-private:21.1.2")
    implementation("org.keycloak:keycloak-core:21.1.2")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    sourceCompatibility = JavaVersion.VERSION_11.toString()
    targetCompatibility = JavaVersion.VERSION_11.toString()
}

tasks.test {
    useJUnitPlatform()
}