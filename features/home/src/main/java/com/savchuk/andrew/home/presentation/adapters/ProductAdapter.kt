package com.savchuk.andrew.home.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import coil.transform.RoundedCornersTransformation
import com.savchuk.andrew.home.databinding.ProductItemBinding
import com.savchuk.andrew.home.domain.entities.Product

class ProductAdapter(private val list: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    private lateinit var listener: OnProductClickListener

    fun setOnClickListener(listener: OnProductClickListener) {
        this.listener = listener
    }

    class ProductViewHolder(private val binding: ProductItemBinding) : ViewHolder(binding.root) {

        fun bind(product: Product) {
            binding.titleItemTextView.text = product.title
            //binding.itemImage.setImageResource(product.imageRes)
            binding.itemImage.load(product.imageRes) {
                transformations(RoundedCornersTransformation(50f))
            }
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

    interface OnProductClickListener {
        fun onClick(product: Product)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            listener.onClick(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}