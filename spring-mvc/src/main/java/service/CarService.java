package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    Car car = new Car("BMW", 3, 3);
    Car car1 = new Car("AUDI", 6, 2);
    Car car2 = new Car("MERCEDES", 600, 6);
    Car car3 = new Car("ROVER", 5, 2);
    Car car4 = new Car("TOYOTA", 4, 4);

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        return cars;
    }

    public List<Car> getListOfCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        if (count < 1 || count >= 5) {
            return cars;
        } else
            return cars.stream().limit(count).collect(Collectors.toList());
    }
}
