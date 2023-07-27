package com.example.homework19_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework19_3.databinding.FragmentFirstBinding
import com.google.android.material.tabs.TabLayoutMediator

class FirstFragment : Fragment() {
    private val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val list = listOf<DataClass>(
            DataClass(R.drawable.img1," Geoaxborot","Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar va boshqa muassasalar haqida ma'lumot olishingiz mumkin"),
            DataClass(R.drawable.img1,"Huquqiy axborot","Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan, qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin"),
            DataClass(R.drawable.img1," To'lovlar xizmatlari","To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin"),
            DataClass(R.drawable.img1,"Qo'shimcha imkoniyat","Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar yordamida til bilish savodxonligingizni oshirishingiz mumkin")
        )
        val customFragment = CustomFragment(context as MainActivity,list)
        binding.viewPager2.adapter = customFragment

        TabLayoutMediator(binding.tabLayout,binding.viewPager2){ _, _ ->
        }.attach()

        return binding.root
    }
}