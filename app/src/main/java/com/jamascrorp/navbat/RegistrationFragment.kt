package com.jamascrorp.navbat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jamascrorp.navbat.databinding.AuthorizationBinding
import com.jamascrorp.navbat.databinding.CheckBinding
import com.jamascrorp.navbat.databinding.RegistrationBinding

class RegistrationFragment : Fragment() {

    private var viewBinding: RegistrationBinding? = null
    private val binding get() = viewBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        viewBinding = RegistrationBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.radio.isChecked = true
        binding.buttonAuthoriz.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_checkFragment)
        }
        binding.enter.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_authorizationFragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() : Fragment {
            return RegistrationFragment()
        }
    }
}