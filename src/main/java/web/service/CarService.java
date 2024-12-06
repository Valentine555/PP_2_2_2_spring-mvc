package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry",1990),
            new Car("Honda", "Accord", 2014),
            new Car("Ford", "Mustang", 2024),
            new Car("BMW", "X5",2012),
            new Car("Audi", "A4",2024)
    );

    public List<Car> countCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        if (count >= 5) {
            return new ArrayList<>(cars);
        }
        List<Car> cars1 = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars1.add(cars.get(i));
        }
        return cars1;
    }

    public List<Car> getCars() {
        return cars;
    }
}
