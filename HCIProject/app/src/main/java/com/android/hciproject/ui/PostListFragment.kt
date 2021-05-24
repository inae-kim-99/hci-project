package com.android.hciproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.android.hciproject.R
import com.android.hciproject.databinding.PostListFragmentBinding
import com.android.hciproject.viewmodels.PostListViewModel

class PostListFragment : Fragment() {

    private var _binding: PostListFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: PostListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = PostListViewModel()
        _binding = PostListFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.showMapBtn.setOnClickListener {
            findNavController().navigate(R.id.action_postListFragment_to_mainFragment)
        }
    }


}