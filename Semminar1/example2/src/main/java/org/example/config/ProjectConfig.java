package org.example.config;

import org.example.domain.Car;
import org.example.domain.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean()
    Engine engine() {
        Engine eng = new Engine();
        return eng;
    }

    @Bean()
    Car car1() {
        Car obCar = new Car();
        obCar.setEngine(engine());
        obCar.setModel("S8");
        obCar.setMade("Audi");
        return obCar;
    }
}
