

plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
    implementation("junit:junit:4.13.2")
    testImplementation ("io.mockk:mockk:1.13.1")
 
//    androidTestImplementation ("io.mockk:mockk-android:4.1.0")

//        testImplementation("androidx.test.ext:junit:1.1.5")
//    testImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    testImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
//    testImplementation("androidx.compose.ui:ui-test-junit4")
}

tasks.test {
    useJUnitPlatform()
}



application {
    mainClass.set("MainKt")
}