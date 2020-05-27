package com.embeddedgarden.sensorservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "soil_sensor_reading")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"sensor_reading_date"},
        allowGetters = true)
@Data
public class SoilSensorReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="moisture", nullable = false, updatable = false)
    private int moisture;

    @Column(name="temperature", nullable = false, updatable = false)
    private float temperature;

    @Column(name="humidity", nullable = false, updatable = false)
    private float humidity;

    @Column(name="reading_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date readingDate;

}
