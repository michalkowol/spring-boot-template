plugins {
    java
    id("eu.codeloop.java") version "2.2.6.0"
    id("eu.codeloop.springboot") version "2.2.6.0"
}

dependencies {
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    implementation("com.github.spotbugs:spotbugs-annotations")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation("org.postgresql:postgresql:42.2.12")
    implementation("org.testcontainers:postgresql:1.13.0")
    implementation("com.vladmihalcea:hibernate-types-52")
    implementation("org.liquibase:liquibase-core")

    implementation("org.springdoc:springdoc-openapi-ui")

    implementation("org.mapstruct:mapstruct")
    annotationProcessor("org.mapstruct:mapstruct-processor")

    integrationTestImplementation( "org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.codehaus.groovy:groovy-all")
    testImplementation("org.spockframework:spock-spring")
    testImplementation("net.javacrumbs.json-unit:json-unit-assertj")
    integrationTestImplementation("net.javacrumbs.json-unit:json-unit-spring")
}
