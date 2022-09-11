package web.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Car implements CarsList {
    private String model;
    private String name;
    private int age;


    public Car() {
    }

    @Override
    public List<CarsList> getCarsList() {
        List<CarsList> carsLists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carsLists.add(new Car());
            ((Car) carsLists.get(i)).setModel("Модель " + (i + 1));
            ((Car) carsLists.get(i)).setName("Имя " + (i + 1));
            ((Car) carsLists.get(i)).setAge(i + 1);
        }
        return carsLists;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
