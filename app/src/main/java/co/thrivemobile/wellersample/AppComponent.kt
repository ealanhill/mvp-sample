package co.thrivemobile.wellersample

import co.thrivemobile.wellernetwork.network.WellerApiModule
import co.thrivemobile.wellersample.sign_in.SignInModule
import co.thrivemobile.wellersample.sign_in.SignInPresenter
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ AppModule::class, WellerApiModule::class, SignInModule::class])
@Singleton
interface AppComponent {

    val signInPresenter: SignInPresenter
}