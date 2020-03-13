package com.mikezalik.countries.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mikezalik.countries.R
import com.mikezalik.countries.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryListAdapter(var countries:ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {
    fun updateCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val countryName = view.name

        fun bind(country: Country) {
            countryName.text = country.countryName

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CountryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }
}