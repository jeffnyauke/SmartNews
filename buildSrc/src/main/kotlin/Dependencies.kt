/*
 * MIT License
 *
 * Copyright (c) 2020 Jeffrey Nyauke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

object Testing {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.9"
    const val room = "androidx.room:room-testing:2.2.5"
    const val jUnit = "junit:junit:4.13"
    const val extJUnit = "androidx.test.ext:junit:1.1.1"
    const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    const val okHttp = "com.squareup.okhttp3:mockwebserver:4.4.0"
    const val core = "androidx.arch.core:core-testing:2.1.0"
}

object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.4.0"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0"
    const val gradle = "com.android.tools.build:gradle:4.0.1"
    const val daggerHilt = "com.google.dagger:hilt-android-gradle-plugin:2.28-alpha"
    const val ktLint = "org.jlleitschuh.gradle:ktlint-gradle:9.2.1"
    const val materialDesign = "com.google.android.material:material:1.1.0"
    const val materialDialog = "com.shreyaspatil:MaterialDialog:2.1"
    const val coil = "io.coil-kt:coil:0.9.5"
}

object Lifecycle {
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
}

object Hilt {
    const val daggerCompiler = "com.google.dagger:hilt-android-compiler:2.28-alpha"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:1.0.0-alpha01"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha01"
    const val hiltAndroid = "com.google.dagger:hilt-android:2.28-alpha"
}

object Moshi {
    const val moshi = "com.squareup.moshi:moshi-kotlin:1.9.2"
    const val codeGen = "com.squareup.moshi:moshi-kotlin-codegen:1.9.2"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:2.8.1"
    const val moshiRetrofitConverter = "com.squareup.retrofit2:converter-moshi:2.7.2"
}

object Coroutines {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"
}

object Android {
    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
    const val coreKtx = "androidx.core:core-ktx:1.2.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"
}

object Room {
    const val compiler = "androidx.room:room-compiler:2.2.5"
    const val ktx = "androidx.room:room-ktx:2.2.5"
    const val runtime = "androidx.room:room-runtime:2.2.5"
}
