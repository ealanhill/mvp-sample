package co.thrivemobile.wellersample.sign_in

import co.thrivemobile.wellernetwork.network.WellerApi
import dagger.Module
import dagger.Provides

@Module
class SignInModule {

    @Provides
    fun provideSignInPresenter(api: WellerApi): SignInPresenter {
        return SignInPresenter(api)
    }
}