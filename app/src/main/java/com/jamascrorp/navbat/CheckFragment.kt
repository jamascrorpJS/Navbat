package com.jamascrorp.navbat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jamascrorp.navbat.databinding.AuthorizationBinding
import com.jamascrorp.navbat.databinding.CheckBinding

class CheckFragment : Fragment() {

    private var viewBinding: CheckBinding? = null
    private val binding get() = viewBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        viewBinding = CheckBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.radio.isChecked = true
        binding.radio1.isChecked = true
    }

    companion object {
        @JvmStatic
        fun newInstance() : Fragment {
            return CheckFragment()
        }
    }
}