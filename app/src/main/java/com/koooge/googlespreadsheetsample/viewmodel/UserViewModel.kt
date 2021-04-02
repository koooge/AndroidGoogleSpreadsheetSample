package com.koooge.googlespreadsheetsample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

class UserViewModel : ViewModel() {
    var account: MutableLiveData<GoogleSignInAccount> = MutableLiveData()

    fun login(_account: GoogleSignInAccount?) {
        account.postValue(_account)
    }

    fun isLogin(): Boolean {
        return account.getValue() != null
    }
}