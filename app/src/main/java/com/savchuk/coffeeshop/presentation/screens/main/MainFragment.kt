package com.savchuk.coffeeshop.presentation.screens.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.savchuk.coffeeshop.R
import com.savchuk.coffeeshop.data.Coffee
import com.savchuk.coffeeshop.data.SimpleCoffeeRepository
import com.savchuk.coffeeshop.databinding.FragmentMainBinding
import com.savchuk.coffeeshop.presentation.MainAdapter

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val list = mutableListOf<Coffee>()
        val adapter = MainAdapter()

        list.add(Coffee(name = "Americano", price = 25))
        list.add(Coffee(name = "Espresso", price = 20))
        list.add(Coffee(name = "Latte", price = 40))
        list.add(Coffee(name = "Cappuccino", price = 40))
        list.add(Coffee(name = "Irish", price = 45))
        list.add(Coffee(name = "Macchiato", price = 35))
        list.add(Coffee(name = "Black tea", price = 25))
        list.add(Coffee(name = "Green tea", price = 25))

        adapter.submitList(SimpleCoffeeRepository.listOfCoffee)
        binding.recyclerView.adapter = adapter


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstance() =
            MainFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}