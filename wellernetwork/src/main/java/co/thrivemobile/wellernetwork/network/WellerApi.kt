package co.thrivemobile.wellernetwork.network

import io.reactivex.Single
import retrofit2.http.Header
import retrofit2.http.POST

interface WellerApi {

    @POST("")
    fun signIn(@Header("email") email: String, @Header("password") password: String):
            Single<String>
}