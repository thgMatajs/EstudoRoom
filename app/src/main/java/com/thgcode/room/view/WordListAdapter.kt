package com.thgcode.room.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.thgcode.room.R
import com.thgcode.room.entities.Word

class WordListAdapter(context: Context) : Adapter<WordListAdapter.WordViewHolder>() {

    private val inflater = LayoutInflater.from(context)
    var words: List<Word> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return WordViewHolder(itemView)
    }

    override fun getItemCount() = words.size

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        if (words.isEmpty()) {
            holder.wordItemView.text = "No  Words!!!"
        } else {
            holder.wordItemView.text = words[position].word
        }
    }

    inner class WordViewHolder(itemView: View) : ViewHolder(itemView) {

        val wordItemView = itemView.findViewById<TextView>(R.id.textView)

    }
}