package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCarsList(@RequestParam(value = "val", required = false) String val, Model model) {
        model.addAttribute("carslist", new Car().getCarsList(val));
        return "cars";
    }
}
