package com.example.guard.ui.dashboard.mode2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.guard.databinding.FragmentDashboardMode2Binding

class Mode2Fragment : Fragment() {

    private var _binding: FragmentDashboardMode2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mode2ViewModel = ViewModelProvider(this).get(Mode2ViewModel::class.java)

        _binding = FragmentDashboardMode2Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        mode2ViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
