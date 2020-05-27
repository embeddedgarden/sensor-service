package com.embeddedgarden.sensorservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SoilSensorReadingDTO {
    private long id;
    private int moisture;
    private float temperature;
    private float humidity;
    private Date readingDate;
}
