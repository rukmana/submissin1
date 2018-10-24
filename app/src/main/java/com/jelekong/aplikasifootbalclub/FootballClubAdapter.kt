package com.jelekong.aplikasifootbalclub

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_footbal_club.view.*

class FootballClubAdapter(private val context: Context,
                          private val items : List<FootballClubItem>,
                          private val listener : (FootballClubItem) -> Unit)
    : RecyclerView.Adapter<FootballClubAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_footbal_club, parent, false))

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        fun bindItem(items: FootballClubItem, listener: (FootballClubItem) -> Unit) {
            itemView.name.text = items.name
            items.image?.let { Picasso.get().load(it).into(itemView.image) }
            itemView.setOnClickListener{
                listener(items)
            }
        }

    }

}