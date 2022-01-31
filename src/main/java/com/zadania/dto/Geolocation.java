package com.zadania.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geolocation {

    @JsonProperty("deviceId")
    private String deviceId;
    @JsonProperty("latitiude")
    private Long latitiude;
    @JsonProperty("longitude")
    private Long longitude;

    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Long getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(Long latitiude) {
        this.latitiude = latitiude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }
}