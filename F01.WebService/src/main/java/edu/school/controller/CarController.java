package edu.school.controller;

import edu.school.Model.Car;
import edu.school.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {


    CarRepository repository=new CarRepository();


    @GetMapping("/expensivecars")
    List<Car> getExpensiveCars(){
        List<Car> cars=repository.findAll();


        return cars;
    }
}
