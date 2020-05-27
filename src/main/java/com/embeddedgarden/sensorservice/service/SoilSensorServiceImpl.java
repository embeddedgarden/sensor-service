package com.embeddedgarden.sensorservice.service;

import com.embeddedgarden.sensorservice.dto.SoilSensorReadingDTO;
import com.embeddedgarden.sensorservice.model.SoilSensorReading;
import com.embeddedgarden.sensorservice.repository.SoilSensorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoilSensorServiceImpl implements SoilSensorService {

    @Autowired
    SoilSensorRepository soilSensorRepository;

    public SoilSensorReadingDTO save(SoilSensorReadingDTO soilSensorReadingDTO){
        ModelMapper modelMapper = new ModelMapper();
        SoilSensorReading soilSensorReading = modelMapper.map(soilSensorReadingDTO, SoilSensorReading.class);
        soilSensorReading = soilSensorRepository.save(soilSensorReading);
        return modelMapper.map(soilSensorReading, SoilSensorReadingDTO.class);
    }

}
