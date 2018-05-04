package co.thrivemobile.wellersample.sign_in

import android.os.Bundle
import co.thrivemobile.wellersample.App
import co.thrivemobile.wellersample.R
import com.hannesdorfmann.mosby3.mvp.MvpActivity

class SignInActivity: MvpActivity<SignInView, SignInPresenter>() {

    override fun createPresenter(): SignInPresenter {
        return (application as App).appComponent.signInPresenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sign_in)
    }

}