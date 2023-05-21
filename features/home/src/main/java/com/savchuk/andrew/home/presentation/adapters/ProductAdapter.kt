package com.savchuk.andrew.home.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.savchuk.andrew.home.databinding.ProductItemBinding
import com.savchuk.andrew.home.presentation.entities.ProductItemUi
import com.savchuk.andrew.presentation.loadUrl

class ProductAdapter : ListAdapter<ProductItemUi, ProductAdapter.ProductViewHolder>(diffUtil) {

    class ProductViewHolder(private val binding: ProductItemBinding) : ViewHolder(binding.root) {
        fun bind(productItemUi: ProductItemUi) {
            binding.titleItemTextView.text = productItemUi.title
            binding.itemImage.loadUrl(productItemUi.imageSrc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            ProductItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

private val diffUtil = object : DiffUtil.ItemCallback<ProductItemUi>() {
    override fun areItemsTheSame(oldItem: ProductItemUi, newItem: ProductItemUi): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ProductItemUi, newItem: ProductItemUi): Boolean {
        return oldItem.title == newItem.title
    }

}