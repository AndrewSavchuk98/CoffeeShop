package com.savchuk.coffeeshop.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.savchuk.coffeeshop.R
import com.savchuk.coffeeshop.data.Coffee

class MainAdapter : ListAdapter<Coffee, MainAdapter.MainViewHolder>(DiffUtil()) {

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val titleItemTextView = itemView.findViewById<TextView>(R.id.titleItemTextView)
        private val priceItemTextView = itemView.findViewById<TextView>(R.id.priceItemTextView)
        private val itemImageView = itemView.findViewById<ImageView>(R.id.itemImage)

        fun bind(coffee: Coffee){
            titleItemTextView.text = coffee.name
            priceItemTextView.text = "$ ${coffee.price}.00"
            itemImageView.setImageResource(coffee.image_url)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.coffee_item2, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DiffUtil : DiffUtil.ItemCallback<Coffee>() {
    override fun areItemsTheSame(oldItem: Coffee, newItem: Coffee): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Coffee, newItem: Coffee): Boolean {
        return oldItem == newItem
    }

}