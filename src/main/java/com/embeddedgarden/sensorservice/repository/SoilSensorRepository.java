package com.embeddedgarden.sensorservice.repository;

import com.embeddedgarden.sensorservice.model.SoilSensorReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoilSensorRepository extends JpaRepository<SoilSensorReading, Long> {
}
