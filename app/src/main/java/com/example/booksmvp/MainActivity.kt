package com.example.booksmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.booksmvp.utils.RVItemDecorator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfBooks : ArrayList<Book> = ArrayList()
        listOfBooks.add(Book("The Hunger Games","Suzanne Collins"))
        listOfBooks.add(Book("Harry Poter and the Order of the Pheonix","J.K Rowlling"))
        listOfBooks.add(Book("To Kill a Mockingbird","Harper Lee"))
        listOfBooks.add(Book("The Book Thief","Markus Zusak"))
        listOfBooks.add(Book("Animal Farm","George Orwell"))
        listOfBooks.add(Book("The Chronicles of Narnia","C.S Lewis"))
        listOfBooks.add(Book("The Da Vinci Code","Dan Brown"))
        listOfBooks.add(Book("The Picture of Dorian Gray","Oscar Wilde"))
        listOfBooks.add(Book("Fahrenheit 451","Ray Bradburry"))
        listOfBooks.add(Book("Pride and Prejudice","Jane Austen"))
        listOfBooks.add(Book("Twilight","Stephanie Meyer"))
        listOfBooks.add(Book("The Fault In Our Stars","John Green"))
        listOfBooks.add(Book("The Wuthering Heights","Emily Bronte"))
        listOfBooks.add(Book("Crime and Punishment","Fyodor Dostoyevsky"))
        listOfBooks.add(Book("The Great Gatsby","Scott F. Fitzgerald"))
        val rv = BookRV(listOfBooks)
        recyclerView.adapter = rv
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        recyclerView.apply {
            addItemDecoration(RVItemDecorator(10,30,RecyclerView.VERTICAL))
        }
    }
}