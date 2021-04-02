package com.koooge.googlespreadsheetsample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.koooge.googlespreadsheetsample.viewmodel.UserViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(R.layout.fragment_first) {
    companion object {
        private val TAG = FirstFragment::class.java.simpleName
    }
    private val userViewModel: UserViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = view.findViewById(R.id.textview_first) as TextView
        if (userViewModel.isLogin()) {
            text.setText(userViewModel.account.getValue()!!.displayName)
        } else {
            findNavController().navigate(R.id.signin_fragment)
        }

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}