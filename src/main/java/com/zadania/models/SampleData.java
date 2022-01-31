package com.zadania.models;

import net.minidev.json.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class SampleData {
    private JSONObject sampleData;

    public JSONObject getSampleData() {
        return sampleData;
    }

    public void setSampleData(JSONObject sampleData) {
        this.sampleData = sampleData;
    }
}
