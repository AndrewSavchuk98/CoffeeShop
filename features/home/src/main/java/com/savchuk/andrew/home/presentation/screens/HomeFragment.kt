package com.savchuk.andrew.home.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.savchuk.andrew.home.databinding.FragmentHomeBinding
import com.savchuk.andrew.home.presentation.HomeViewModel
import com.savchuk.andrew.home.domain.entities.Product
import com.savchuk.andrew.home.presentation.adapters.ProductAdapter
import com.savchuk.andrew.nestedrecyclertest.domain.entities.SectionEntities
import com.savchuk.andrew.home.presentation.adapters.SectionAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(), SectionAdapter.OnSectionClickListener,
    ProductAdapter.OnProductClickListener {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = SectionAdapter()
        viewModel.homeState.observe(viewLifecycleOwner) {

            adapter.submitList(it.sectionList)
        }

        binding.parentRecyclerView.adapter = adapter

        adapter.setSectionListener(this)
        adapter.setInnerListener(this)

    }

    override fun onClick(product: Product) {
        viewModel.launchDetailProduct(productId = product.id)
    }

    override fun onSectionClick(sectionEntities: SectionEntities) {
        viewModel.launchProductMore(sectionEntities.id)
    }
}