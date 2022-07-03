package com.example.homework2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentEndBinding
import com.example.homework2.databinding.FragmentMusicBinding
import com.google.android.material.snackbar.Snackbar

class MusicFragment : Fragment(R.layout.fragment_music) {
    private var _binding: FragmentMusicBinding? = null
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
        _binding = FragmentMusicBinding.bind(view)
        val text = "From MusicFragment"


        with(binding) {
            buttonToEnd.setOnClickListener() {
                findNavController().navigate(R.id.action_musicFragment_to_endFragment)
                Snackbar.make(view, text, Snackbar.LENGTH_LONG).show()
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}