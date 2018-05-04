package co.thrivemobile.wellernetwork.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class WellerApiModule {

    @Provides
    @Singleton
    fun provideApi(): WellerApi {
        return Retrofit.Builder()
                .baseUrl("www.google.com")
                .build()
                .create(WellerApi::class.java)
    }
}