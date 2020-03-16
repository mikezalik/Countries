package com.mikezalik.countries.di

import com.mikezalik.countries.model.CountriesService
import com.mikezalik.countries.viewmodel.ListViewModel
import dagger.Component

@Component (modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}