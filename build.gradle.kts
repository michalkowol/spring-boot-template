plugins {
    java
    id("eu.codeloop.java") version "2.2.5.0"
    id("eu.codeloop.springboot") version "2.2.5.0"
}

dependencies {
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    implementation("com.github.spotbugs:spotbugs-annotations")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    implementation( "com.vladmihalcea:hibernate-types-52:2.9.3")
    implementation( "org.liquibase:liquibase-core")
    runtimeOnly("com.h2database:h2")
    
    implementation("org.springdoc:springdoc-openapi-ui:1.2.33")

    implementation( "org.mapstruct:mapstruct:1.3.1.Final")
    annotationProcessor( "org.mapstruct:mapstruct-processor:1.3.1.Final")
    
    testImplementation( "org.springframework.boot:spring-boot-starter-test")
    testImplementation( "org.codehaus.groovy:groovy-all")
    testImplementation( "org.spockframework:spock-spring")
}
