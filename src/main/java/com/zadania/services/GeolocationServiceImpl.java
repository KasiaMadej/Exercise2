package com.zadania.services;

import com.zadania.dto.Geolocation;
import com.zadania.models.GeolocationData;
import com.zadania.repository.GeolocationRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Service
public class GeolocationServiceImpl implements GeolocationService {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    private GeolocationRepository geolocationRepository;

    @Autowired
    public GeolocationServiceImpl(GeolocationRepository geolocationRepository) {
        this.geolocationRepository = geolocationRepository;

    }

    @Override
    public void saveGeolocationData() throws Exception {

        final String uri = "http://localhost:8080/sample";
        RestTemplate restTemplate = new RestTemplate();
        List<Geolocation> geolocations;

        try {
            ResponseEntity<Geolocation[]> responseEntity = restTemplate.getForEntity(uri, Geolocation[].class);

            geolocations = Arrays.asList(responseEntity.getBody());

            for (Geolocation n : geolocations) {
                GeolocationData dataRow = new GeolocationData();
                dataRow.setDeviceId(n.getDeviceId());
                dataRow.setLatitiude(n.getLatitiude());
                dataRow.setLongitude(n.getLongitude());
                geolocationRepository.save(dataRow);

            }


        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public String getSampleData() {
        List<JSONObject> allData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JSONObject data = new JSONObject();
            data.put("deviceId", "1234" + i);
            data.put("latitiude", 50543 + i);
            data.put("longitude", 1423412 + i);
            data.toJSONString();
            allData.add(data);
        }
        LOGGER.info(allData.toString());
        return allData.toString();
    }

}
