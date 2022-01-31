package com.zadania.models;

import javax.persistence.*;


@Entity
public class GeolocationData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String deviceId;
    private Long latitiude;
    private Long longitude;


    public GeolocationData(String deviceId, Long latitiude, Long longitude) {
        this.deviceId = deviceId;
        this.latitiude = latitiude;
        this.longitude = longitude;
    }

    public GeolocationData() {

    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
