package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String Cars(ModelMap model) {
        List<Car> cars = carService.getCars();
        model.addAttribute("cars",cars);
        return "cars";
    }

    @GetMapping("/count")
    public String Car(@RequestParam ("count") int count, ModelMap model) {
        List<Car> cars=carService.countCars(count);
        model.addAttribute("cars",cars);
        return "cars";
    }

}
