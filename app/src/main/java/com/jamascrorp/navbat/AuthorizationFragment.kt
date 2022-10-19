package com.jamascrorp.navbat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController

import com.jamascrorp.navbat.databinding.AuthorizationBinding

class AuthorizationFragment : Fragment() {

    private var viewBinding: AuthorizationBinding? = null
    private val binding get() = viewBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        hideAction()
        hideBottom(this)
        viewBinding = AuthorizationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.radio.isChecked = true
        binding.buttonAuthoriz.setOnClickListener {
            findNavController().navigate(R.id.action_authorizationFragment_to_checkFragment)
        }
        binding.getregist.setOnClickListener {
            findNavController().navigate(R.id.action_authorizationFragment_to_registrationFragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() : Fragment {
            return AuthorizationFragment()
        }
    }
}