
CREATE USER 'sensor'@'localhost' IDENTIFIED BY 'sensor';

GRANT INSERT ON soil_dev.soil_sensor_reading TO 'sensor'@'localhost';
GRANT SELECT ON soil_dev.soil_sensor_reading TO 'sensor'@'localhost';

CREATE TABLE soil_sensor_reading (
    id BIGINT NOT NULL AUTO_INCREMENT,
    moisture INT NOT NULL,
    temperature FLOAT NOT NULL,
    humidity FLOAT NOT NULL,
    reading_date DATETIME NOT NULL,
    PRIMARY KEY (id));
