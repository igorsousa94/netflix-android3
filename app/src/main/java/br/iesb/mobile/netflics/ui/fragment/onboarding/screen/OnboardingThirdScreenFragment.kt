package br.iesb.mobile.netflics.ui.fragment.onboarding.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.iesb.mobile.netflics.databinding.FragmentOnboardingThirdScreenBinding

class OnboardingThirdScreenFragment : Fragment() {
    private lateinit var binding: FragmentOnboardingThirdScreenBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingThirdScreenBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        return binding.root
    }
}