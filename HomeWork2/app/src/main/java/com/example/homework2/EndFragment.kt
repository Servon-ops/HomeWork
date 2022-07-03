package com.example.homework2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework2.databinding.FragmentEndBinding
import com.google.android.material.snackbar.Snackbar

class EndFragment : Fragment(R.layout.fragment_end) {
    private var _binding: FragmentEndBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentEndBinding.bind(view)

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}