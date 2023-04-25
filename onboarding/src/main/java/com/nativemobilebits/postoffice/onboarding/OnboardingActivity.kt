package com.nativemobilebits.postoffice.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.nativemobilebits.postoffice.onboarding.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOnboardingBinding
    private var step =1

    private val onboardingImages = listOf(R.drawable.one,R.drawable.two,R.drawable.three)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_onboarding)

        initViews()
        setUpClickListeners()
    }

    private fun initViews() {
        binding.step1.apply {
            setBackgroundColor(ContextCompat.getColor(this@OnboardingActivity,
                com.nativemobilebits.postoffice.central.R.color.colorPrimaryVariant))
        }
    }


    private fun setUpClickListeners() {
        binding.btnNext.setOnClickListener {
            setUpNewOnboardingDetails()
            step+=1
        }
    }

    private fun setUpNewOnboardingDetails() {
        when (step){
            1->{
                binding.tvOnboardingMessage.text = getString(com.nativemobilebits.postoffice.central.R.string.onboarding_message1)
                binding.ivOnboarding.setImageResource(onboardingImages[step-1])
            }
            2->{
                binding.tvOnboardingMessage.text = getString(com.nativemobilebits.postoffice.central.R.string.onboarding_message2)
                binding.ivOnboarding.setImageResource(onboardingImages[step-1])
                binding.step2.apply {
                    setBackgroundColor(ContextCompat.getColor(this@OnboardingActivity,
                        com.nativemobilebits.postoffice.central.R.color.colorPrimaryVariant))
                }
            }
            3->{
                binding.tvOnboardingMessage.text = getString(com.nativemobilebits.postoffice.central.R.string.onboarding_message3)
                binding.ivOnboarding.setImageResource(onboardingImages[step-1])

                binding.btnNext.apply {
                    text = getString(com.nativemobilebits.postoffice.central.R.string.get_started)
                    setBackgroundColor(ContextCompat.getColor(this@OnboardingActivity,com.nativemobilebits.postoffice.central.R.color.colorPrimaryVariant))
                    setTextColor(ContextCompat.getColor(this@OnboardingActivity,com.nativemobilebits.postoffice.central.R.color.colorWhite))
                }
                binding.btnSkip.visibility = View.GONE

                binding.step3.apply {
                    setBackgroundColor(ContextCompat.getColor(this@OnboardingActivity,
                        com.nativemobilebits.postoffice.central.R.color.colorPrimaryVariant))
                }

            }


        }
    }
}