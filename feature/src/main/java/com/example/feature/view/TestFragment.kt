package com.example.feature.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.core.di.ApplicationProvider
import com.example.core.di.IApp
import com.example.feature.di.component.TestComponentHolder
import javax.inject.Inject
import com.example.feature.databinding.TestFragmentBinding


class TestFragment : Fragment() {

    private var _binding: TestFragmentBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var viewModel: TestViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inject((requireActivity().application as IApp).getApplicationProvider())
        _binding = TestFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getFirstServer()
        viewModel.getSecondServer()
    }

    private fun inject(applicationProvider: ApplicationProvider) {
        TestComponentHolder.init(applicationProvider).inject(this@TestFragment)
    }

    override fun onDestroy() {
        TestComponentHolder.reset()
        super.onDestroy()
    }

}