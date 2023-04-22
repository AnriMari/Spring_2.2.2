package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.DaoCar;

@Controller
public class CarController {

    private DaoCar daoCar;

    @Autowired
    public CarController(DaoCar daoCar) {
        this.daoCar = daoCar;
    }

    @GetMapping("/cars")
    public String showCarsFromList(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("listCar", daoCar.getListCar(count));
        return "cars";
    }
}
