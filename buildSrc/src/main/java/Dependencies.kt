object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }

    //chat
    val chatSdk by lazy { "io.agora.rtc:chat-sdk:${Versions.chatSdk}"}


    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}"}

}

object Modules {

    val chat = ":chat"
    val onboarding = ":onboarding"
    val central = ":central"

}







