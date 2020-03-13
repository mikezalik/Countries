package com.mikezalik.countries.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikezalik.countries.R
import com.mikezalik.countries.model.Country
import com.mikezalik.countries.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ListViewModel
    private val countriesAdapter = CountryListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        viewModel.refresh()

        countriesList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = countriesAdapter
        }

        observeViewModel()
    }
           private fun observeViewModel() {
                viewModel.countries.observe(this, Observer{countries: List <Country>? ->
                    countries?.let { countriesAdapter.updateCountries(it)}})

                viewModel.countryLoadError.observe(this, Observer { isError ->
                    isError?.let {list_error.visibility = if(it) View.VISIBLE else View.GONE}})

                viewModel.loading.observe(this, Observer { isLoading ->
                    isLoading?.let {loading_view.visibility = if(it) View.VISIBLE else View.GONE}})
            }
}

