package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DaoCar {

    List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("Audi", "Brown", 2017));
        listCar.add(new Car("BMW", "Black", 2012));
        listCar.add(new Car("Land Rover", "Black", 2008));
        listCar.add(new Car("Ford", "White", 2020));
        listCar.add(new Car("Toyota", "Red", 2021));
    }

    public  List<Car> getListCar (int count) {
        if (count > 5) {return listCar;}
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
