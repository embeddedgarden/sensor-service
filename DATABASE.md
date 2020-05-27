

#### MySQL
``` 
berw install mysql
```

#### Configuration of MySQL
```
mysql.server start
mysql_secure_installation
# Enter password
```

#### Connect to MySQL
``` 
mysql -uroot -p
# Enter password
```

#### Create database
``` 
CREATE DATABASE soil_dev;
USE soil_dev;
```

#### Create soil_sensor_reading table
``` 
CREATE TABLE soil_sensor_reading (id BIGINT NOT NULL AUTO_INCREMENT, moisture INT NOT NULL, temperature FLOAT NOT NULL, humidity INT NOT NULL, reading_date DATETIME NOT NULL, PRIMARY KEY (id));
```



#### Instructions from brew install mysql
We've installed your MySQL database without a root password. To secure it run:
    mysql_secure_installation

MySQL is configured to only allow connections from localhost by default

To connect run:
    mysql -u root

To have launchd start mysql now and restart at login:
  brew services start mysql
Or, if you don't want/need a background service you can just run:
  mysql.server start
  
  
  