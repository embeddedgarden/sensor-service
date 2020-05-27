package com.embeddedgarden.sensorservice.controller;

import com.embeddedgarden.sensorservice.dto.SoilSensorReadingDTO;
import com.embeddedgarden.sensorservice.service.SoilSensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class SoilSensorController {

    @Autowired
    SoilSensorService soilSensorService;

    @RequestMapping(value = "/sensor", method = RequestMethod.POST)
    public SoilSensorReadingDTO post(@Valid @RequestBody SoilSensorReadingDTO soilSensorReadingDTO){
        return soilSensorService.save(soilSensorReadingDTO);
    }

}
