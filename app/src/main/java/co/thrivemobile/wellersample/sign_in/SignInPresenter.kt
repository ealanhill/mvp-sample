package co.thrivemobile.wellersample.sign_in

import co.thrivemobile.wellernetwork.network.WellerApi
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter
import javax.inject.Inject

class SignInPresenter @Inject constructor(private val api: WellerApi): MvpBasePresenter<SignInView>() {

    fun verifyEmail(email: String): Boolean {
        // if email is valid return true
        return true
    }

    fun signIn(email: String, password: String) {
        api.signIn(email, password)
    }
}