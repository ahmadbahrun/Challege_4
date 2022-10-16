package com.bahrun.my_app.ui.form

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bahrun.my_app.R
import com.bahrun.my_app.databinding.FragmentFormBinding


class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding
    private var listener : onNameSubmittedListener? = null

    fun setOnNameSubmittedListener(listener: onNameSubmittedListener){
        this.listener = listener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFormBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClickListener()
    }

    private fun setOnClickListener(){
        binding.ibNext.setOnClickListener {
            val name = binding.etName.text.toString().trim()
            listener?.onNameSubmitted(name)
            Toast.makeText(requireContext(), name, Toast.LENGTH_SHORT).show()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = FormFragment()
    }
}

interface onNameSubmittedListener{
    fun onNameSubmitted(name : String)
}