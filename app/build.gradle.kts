plugins {
    id("com.android.application")
}

android {
    namespace = "com.carlosabaunza.walletapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.carlosabaunza.walletapp"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //Libreria para poner una imagen redonda:
    implementation("de.hdodenhof:circleimageview:3.1.0")
    //Piccaso para cargar imagenes url
    implementation("com.squareup.picasso:picasso:2.8")
    //Colores
    implementation("com.github.yukuku:ambilwarna:2.0.1")
    //

}