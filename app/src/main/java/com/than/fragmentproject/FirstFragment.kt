package com.than.fragmentproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.than.fragmentproject.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(FirstFragment::class.java.simpleName, "onAttach() Dijalankan")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(FirstFragment::class.java.simpleName, "onCreate() Dijalankan")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.namaAnggota.text = "Puan Mahalini Serang"
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(FirstFragment::class.java.simpleName, "onActivityCreated() Dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.d(FirstFragment::class.java.simpleName, "onStart() Dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(FirstFragment::class.java.simpleName, "onResume() Dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(FirstFragment::class.java.simpleName, "onPause() Dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(FirstFragment::class.java.simpleName, "onStop() Dijalankan")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(FirstFragment::class.java.simpleName, "onDestroyView() Dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(FirstFragment::class.java.simpleName, "onDestroy() Dijalankan")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(FirstFragment::class.java.simpleName, "onDetach() Dijalankan")
    }
}