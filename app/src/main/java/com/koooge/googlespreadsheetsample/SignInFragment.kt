package com.koooge.googlespreadsheetsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.gms.common.SignInButton

class SignInFragment : Fragment(R.layout.fragment_signin) {
    companion object {
        private val TAG = SignInFragment::class.java.simpleName
    }
    private lateinit var mSignInButton: SignInButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mSignInButton = view.findViewById(R.id.sign_in_button)
        mSignInButton.setOnClickListener {

        }
    }
}