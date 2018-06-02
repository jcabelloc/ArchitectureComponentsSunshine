package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListViewWeatherEntry;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.Date;
import java.util.List;

public class MainActivityViewModel extends ViewModel{

    private final LiveData<List<ListViewWeatherEntry>> weatherEntries;
    private final SunshineRepository mRepository;

    public MainActivityViewModel(SunshineRepository repository) {
        mRepository = repository;
        weatherEntries = mRepository.getAllFutureWeather();
    }

    public LiveData<List<ListViewWeatherEntry>> getAllFutureWeather(){
        return weatherEntries;
    }
}
