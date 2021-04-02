package com.koooge.googlespreadsheetsample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.fragment.findNavController
import com.google.android.gms.common.SignInButton
import com.koooge.googlespreadsheetsample.viewmodel.UserViewModel

class SignInFragment : Fragment(R.layout.fragment_signin) {
    companion object {
        private val TAG = SignInFragment::class.java.simpleName
    }
    private lateinit var mSignInButton: SignInButton
    private val userViewModel: UserViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mSignInButton = view.findViewById(R.id.sign_in_button)
        mSignInButton.setOnClickListener {
            (requireActivity() as MainActivity).signIn()
        }

        userViewModel.account.observe(viewLifecycleOwner, { account ->
            account?.let {
                findNavController().popBackStack()
            }
        })
    }
}