package com.myanmatitc.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.myanmatitc.mycart.R
import com.myanmatitc.mycart.model.Item
import kotlinx.android.synthetic.main.item_cart.view.*

class CartAdapter (var itemList: ArrayList<Item>)  : RecyclerView.Adapter<CartAdapter.CartViewHolder>(){
    class CartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(item: Item){
            itemView.name.text =item.name
            itemView.price.text = item.price.toString()
            itemView.kg.text = item.kg
            itemView.img.setImageResource(item.image)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartAdapter.CartViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart,parent,false)
        return CartViewHolder(view)
    }

    override fun getItemCount(): Int =itemList.size

    override fun onBindViewHolder(holder: CartAdapter.CartViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

}