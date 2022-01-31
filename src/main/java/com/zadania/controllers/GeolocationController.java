package com.zadania.controllers;


import com.zadania.services.GeolocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class GeolocationController {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    private GeolocationService geolocationService;

    @Autowired
    public GeolocationController(GeolocationService geolocationService) {
        this.geolocationService = geolocationService;
    }

    @GetMapping("sample")
    public String getSampleData() {
        return geolocationService.getSampleData();
    }


    @GetMapping("saveGeolocationData")
    public String saveDataToDatabase() throws Exception {
        try {
            geolocationService.saveGeolocationData();
        }catch (Exception e){
            throw e;
        }

        LOGGER.info("All data added");
        return "Data added to database!";


    }


}

