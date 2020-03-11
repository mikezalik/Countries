package com.mikezalik.countries.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mikezalik.countries.model.Country

class CountryListAdapter(var countries:ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {
    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bing(country: Country) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}