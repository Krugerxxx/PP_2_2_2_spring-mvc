package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.CarImpl;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCarsList(@RequestParam(value = "val", required = false) String val, Model model) {
        if (val != null && val.matches("[-+]?\\d+")
                && Integer.parseInt(val) >= 2 && Integer.parseInt(val) < 5) {
            model.addAttribute("carslist", new CarImpl().getCarsList().subList(0, Integer.parseInt(val)));
        } else {
            model.addAttribute("carslist", new CarImpl().getCarsList());
        }
        System.out.println(val);
        return "cars";
    }
}
