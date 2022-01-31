package com.zadania.services;
import com.zadania.controllers.GeolocationController;
import com.zadania.models.GeolocationData;


import java.util.List;


public interface GeolocationService {
    void saveGeolocationData() throws Exception;
    String getSampleData();
}