package co.thrivemobile.wellersample

import android.app.Application
import co.thrivemobile.wellersample.sign_in.SignInModule

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .signInModule(SignInModule())
                .build()
    }
}