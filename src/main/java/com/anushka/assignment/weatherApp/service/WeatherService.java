package com.anushka.assignment.weatherApp.service;

import com.anushka.assignment.weatherApp.model.ResponseObj;
import com.anushka.assignment.weatherApp.model.WeatherApiResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface WeatherService {
    ArrayList<ResponseObj> getWeatherForCity(String city);

    Map<String, WeatherApiResponse> cacheMap = new HashMap<String, WeatherApiResponse>();

}