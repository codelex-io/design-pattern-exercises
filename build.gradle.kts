plugins {
    java
}

group = "io.codelex"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("org.codehaus.groovy", "groovy-all", "2.5.6")
    testCompile("org.spockframework", "spock-core", "1.3-groovy-2.5")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
