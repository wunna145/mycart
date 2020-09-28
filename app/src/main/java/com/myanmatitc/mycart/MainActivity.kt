package com.myanmatitc.mycart


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.myanmatitc.mycart.adapter.CartAdapter
import com.myanmatitc.mycart.model.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var itemList = ArrayList<Item>()
        itemList.add(Item("Fine Grain Sugar",20.00,"1KG",R.drawable.sugar))
        itemList.add(Item("Peanuts",20.00,"3KG",R.drawable.peanuts))
        itemList.add(Item("Dawat Rice",80.00,"2KG",R.drawable.rice))

        var cartAdapter = CartAdapter(itemList)
        cartRecycler.layoutManager = LinearLayoutManager(this)
        cartRecycler.adapter = cartAdapter
    }
}