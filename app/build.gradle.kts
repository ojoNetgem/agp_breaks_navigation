plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.github.ojonetgem.agp_breaks_navigation"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.github.ojonetgem.agp_breaks_navigation"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlin {
        jvmToolchain(21)
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(project(":module"))
    implementation(libs.androidx.fragment.ktx)
}