//import github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
plugins {
    id ("java")
    id ("com.github.johnrengelman.shadow")
//    kotlin("jvm")
}

//group = 'my.j.ex'
//version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation platform('org.junit:junit-bom:5.10.0')
//    testImplementation 'org.junit.jupiter:junit-jupiter'
    implementation ("com.google.guava:guava")
//    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("gradleHelloWorld")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        manifest {
            attributes(mapOf("Main-Class" to "my.j.ex.Main"))
        }
    }

    build {
        dependsOn(shadowJar)
    }
}
