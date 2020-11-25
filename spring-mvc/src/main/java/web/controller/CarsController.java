package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {
    CarService carService = new CarService();

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count
            , ModelMap model) {
        List<Car> cars = carService.getListOfCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
