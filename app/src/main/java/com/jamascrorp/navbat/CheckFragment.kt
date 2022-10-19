package com.jamascrorp.navbat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jamascrorp.navbat.databinding.AuthorizationBinding
import com.jamascrorp.navbat.databinding.CheckBinding

class CheckFragment : Fragment() {

    private var viewBinding: CheckBinding? = null
    private val binding get() = viewBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        hideAction()
        hideBottom(this)
        viewBinding = CheckBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonAuthoriz.setOnClickListener {
            findNavController().navigate(R.id.action_checkFragment_to_servicesFragment)
        }
        binding.radio.isChecked = true
        binding.radio1.isChecked = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        showBottom(this)
    }

    companion object {
        @JvmStatic
        fun newInstance() : Fragment {
            return CheckFragment()
        }
    }
}