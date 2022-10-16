package com.bahrun.my_app.ui.slider

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import com.bahrun.my_app.R
import com.bahrun.my_app.databinding.FragmentSliderBinding
import com.bahrun.my_app.model.SliderData


class SliderFragment : Fragment() {

    private lateinit var binding: FragmentSliderBinding

    private var sliderData : SliderData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            sliderData = it.getParcelable(ARG_SLIDER_DATA)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSliderBinding.inflate(layoutInflater,container,false)
        return binding.root
        binSliderData()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binSliderData()
    }

    private fun binSliderData(){
        with(binding){
            tvFragment1.text = sliderData?.desc
            ivIcFragment1.load(sliderData?.imgSlider)
        }
    }

    companion object {
        private const val ARG_SLIDER_DATA = "ARG_SLIDER_DATA"

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SliderFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_SLIDER_DATA, sliderData)
                }
            }
    }
}