package com.cmadushan.android.myapplication

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.cmadushan.android.myapplication.posts.models.Post

class DataAdapter(private val inflater: LayoutInflater, private val dataSource: ArrayList<Post>): BaseAdapter() {


    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val rowView = inflater.inflate(R.layout.list_item, parent, false)
        val titleTextView = rowView.findViewById(R.id.title) as TextView
        val bodyTextView = rowView.findViewById(R.id.body) as TextView
        val userIdTextView = rowView.findViewById(R.id.userid) as TextView
        val idTextView = rowView.findViewById(R.id.id) as TextView

        val post = getItem(position) as Post
        titleTextView.text = post.title
        bodyTextView.text = post.body
        userIdTextView.text = post.userId.toString()
        idTextView.text = post.id.toString()



        return rowView
    }


}

