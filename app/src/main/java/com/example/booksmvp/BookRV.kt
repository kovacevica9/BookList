package com.example.booksmvp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class BookRV(private val listOfBooks:List<Book>): RecyclerView.Adapter<BookRV.BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val cell = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return BookViewHolder(cell)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(listOfBooks[position])
    }

    override fun getItemCount(): Int {
        return listOfBooks.size
    }

    class BookViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bind(book: Book){
             itemView.title.text = book.title
            itemView.author.text = "by " + book.author
        }
    }
}