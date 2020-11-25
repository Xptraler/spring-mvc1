package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import service.CarService;

import java.util.List;

@Controller
public class CarsController {
    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String getCars(@RequestParam(value = "count", required = false) Integer count
            , ModelMap model) {
        if (count != null) {
            List<Car> cars = carService.getListOfCars(count);
            model.addAttribute("cars", cars);
            return "cars";
        } else model.addAttribute("cars", carService.getCars());
        return "cars";
    }
}
