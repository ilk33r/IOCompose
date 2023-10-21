plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.ilkerozcan.iocomposesample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ilkerozcan.iocomposesample"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    flavorDimensions += "environment"
    productFlavors {
        create("development") {
            buildConfigField(
                "String",
                "GENERAL_ENVIRONMENT",
                "\"development\""
            )
            buildConfigField(
                "String",
                "GENERAL_FILE_CACHE_DIRECTORY_NAME",
                "\"ioFileCache\""
            )
            buildConfigField(
                "String",
                "LOCALIZATION_DEFAULT_LOCALE_IDENTIFIER",
                "\"en_US\""
            )
            buildConfigField(
                "String",
                "LOCAL_STORAGE_PREFIX",
                "\"ioCompose_\""
            )
            buildConfigField(
                "String",
                "LOGGING_LOG_LEVEL",
                "\"verbose\""
            )
            buildConfigField(
                "String",
                "NETWORKING_API_TIMEOUT",
                "\"90\""
            )
            buildConfigField(
                "String",
                "NETWORKING_API_URL",
                "\"http://192.168.1.6:5176\""
            )
            buildConfigField(
                "String",
                "NETWORKING_AUTHORIZATION_HEADER",
                "\"n812iw9h0ya7r0ne4qekkcslzi2dsnjc\""
            )
        }
        create("dev") {
            buildConfigField(
                "String",
                "GENERAL_ENVIRONMENT",
                "\"dev\""
            )
            buildConfigField(
                "String",
                "GENERAL_FILE_CACHE_DIRECTORY_NAME",
                "\"ioFileCache\""
            )
            buildConfigField(
                "String",
                "LOCALIZATION_DEFAULT_LOCALE_IDENTIFIER",
                "\"en_US\""
            )
            buildConfigField(
                "String",
                "LOCAL_STORAGE_PREFIX",
                "\"ioCompose_\""
            )
            buildConfigField(
                "String",
                "LOGGING_LOG_LEVEL",
                "\"verbose\""
            )
            buildConfigField(
                "String",
                "NETWORKING_API_TIMEOUT",
                "\"90\""
            )
            buildConfigField(
                "String",
                "NETWORKING_API_URL",
                "\"https://ioswiftui-01-test.azurewebsites.net\""
            )
            buildConfigField(
                "String",
                "NETWORKING_AUTHORIZATION_HEADER",
                "\"n812iw9h0ya7r0ne4qekkcslzi2dsnjc\""
            )
        }
        create("production") {
            buildConfigField(
                "String",
                "GENERAL_ENVIRONMENT",
                "\"production\""
            )
            buildConfigField(
                "String",
                "GENERAL_FILE_CACHE_DIRECTORY_NAME",
                "\"ioFileCache\""
            )
            buildConfigField(
                "String",
                "LOCALIZATION_DEFAULT_LOCALE_IDENTIFIER",
                "\"en_US\""
            )
            buildConfigField(
                "String",
                "LOCAL_STORAGE_PREFIX",
                "\"ioCompose_\""
            )
            buildConfigField(
                "String",
                "LOGGING_LOG_LEVEL",
                "\"error\""
            )
            buildConfigField(
                "String",
                "NETWORKING_API_TIMEOUT",
                "\"30\""
            )
            buildConfigField(
                "String",
                "NETWORKING_API_URL",
                "\"http://localhost:6666\""
            )
            buildConfigField(
                "String",
                "NETWORKING_AUTHORIZATION_HEADER",
                "\"\""
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}