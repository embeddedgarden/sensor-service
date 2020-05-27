package com.embeddedgarden.sensorservice.service;

import com.embeddedgarden.sensorservice.dto.SoilSensorReadingDTO;

public interface SoilSensorService {
    SoilSensorReadingDTO save(SoilSensorReadingDTO soilSensorReadingDTO);
}
