package com.example.homework19_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework19_3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private val binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.apply {
            binding.imageView.setImageResource(getInt("img"))
            binding.textView1.text = getString("title")
            binding.textView2.text = getString("desc")
        }
        return binding.root
    }
}