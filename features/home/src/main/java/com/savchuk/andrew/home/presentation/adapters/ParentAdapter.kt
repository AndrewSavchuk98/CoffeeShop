package com.savchuk.andrew.home.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.savchuk.andrew.home.databinding.ProductChildRecyclerBinding
import com.savchuk.andrew.home.presentation.entities.ParentModel

class ParentAdapter(
    private val list: List<ParentModel>,
    private val listener: OnItemClick
) :
    Adapter<ParentAdapter.ParentViewHolder>() {

    interface OnItemClick {
        fun onClick(id: Int)
    }


    class ParentViewHolder(private val binding: ProductChildRecyclerBinding) :
        ViewHolder(binding.root) {
        fun bind(parentModel: ParentModel) {
            binding.titleTextView.text = parentModel.title
           // binding.moreButton.setOnClickListener()
            binding.childRecyclerView.layoutManager =
                LinearLayoutManager(this.itemView.context, LinearLayoutManager.HORIZONTAL, false)
            val adapter = ProductAdapter()
            adapter.submitList(parentModel.childList)
            binding.childRecyclerView.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        return ParentViewHolder(
            ProductChildRecyclerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val model = list[position]
        holder.bind(model)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}