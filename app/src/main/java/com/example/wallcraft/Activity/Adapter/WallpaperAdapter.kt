package com.example.wallhaven.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.wallcraft.Activity.Home_Activity
import com.example.wallcraft.R
import com.example.wallcraft.databinding.WallItemBinding
import com.example.wallhaven.Model.HitsItem


class WallpaperAdapter(val homeActivity: Home_Activity, val Data: List<HitsItem?>?):RecyclerView.Adapter<WallpaperAdapter.WallDataViewHolder>(){
    class WallDataViewHolder(itemView:View):ViewHolder(itemView){
        var binding : WallItemBinding = WallItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallDataViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.wall_item,parent,false)
        return WallDataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Data!!.size
    }

    override fun onBindViewHolder(holder: WallDataViewHolder, position: Int) {
        Glide.with(homeActivity).load(Data!![position]!!.webformatURL).placeholder(R.drawable.img_1).into(holder.binding.wallset)

    }

}