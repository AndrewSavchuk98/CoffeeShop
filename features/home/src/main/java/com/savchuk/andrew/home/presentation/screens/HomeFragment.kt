package com.savchuk.andrew.home.presentation.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.savchuk.andrew.home.databinding.FragmentHomeBinding
import com.savchuk.andrew.home.presentation.HomeViewModel
import com.savchuk.andrew.home.presentation.adapters.ParentAdapter
import com.savchuk.andrew.home.presentation.entities.ParentModel
import com.savchuk.andrew.home.presentation.entities.ProductItemUi
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val list = mutableListOf<ProductItemUi>()

        list.add(ProductItemUi(title = "Coffee", imageSrc = ""))
        list.add(ProductItemUi(title = "Coffee", imageSrc = ""))
        list.add(ProductItemUi(title = "Coffee", imageSrc = ""))
        list.add(ProductItemUi(title = "Coffee", imageSrc = ""))
        list.add(ProductItemUi(title = "Coffee", imageSrc = ""))

        val parentList = mutableListOf<ParentModel>()
        parentList.add(ParentModel("Features", list))
        parentList.add(ParentModel("Newest", list))
        parentList.add(ParentModel("Latest", list))
        parentList.add(ParentModel("Newest", list))
        val adapter = ParentAdapter(parentList)

        binding.parentRecyclerView.adapter = adapter
        return binding.root
    }
}