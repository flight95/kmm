buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
        classpath("com.android.tools.build:gradle:4.1.1")
    }
}

group = "pe.richard"
version = "1.0.0"

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}