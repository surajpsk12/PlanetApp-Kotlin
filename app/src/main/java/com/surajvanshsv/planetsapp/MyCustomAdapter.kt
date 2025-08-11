package com.surajvanshsv.planetsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MyCustomAdapter(val context: Context,val planets: List<Planet>) : BaseAdapter() {
    override fun getCount(): Int {
        return planets.size
    }

    override fun getItem(position: Int): Any? {
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        val inflater = context.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View

        if(convertView == null ){
            view = inflater.inflate(R.layout.item_list_layout,parent,false)

        } else {
            view = convertView
        }

        // bind data
        val item = getItem(position) as Planet

        // initialize the view
        val titleTextView = view.findViewById<TextView>(R.id.planetName)
        val moonCountTextView = view.findViewById<TextView>(R.id.mooncount)
        val moonImage = view.findViewById<ImageView>(R.id.imageViewplanet)

        // bind the data
        titleTextView.text = item.title
        moonCountTextView.text = item.moonCount
        moonImage.setImageResource(item.imagePlanet)


        // handle click event
        view.setOnClickListener {
            Toast.makeText(context,
                "You clicked ${planets[position].title}",
                Toast.LENGTH_SHORT).show()
        }

        return view
    }

}