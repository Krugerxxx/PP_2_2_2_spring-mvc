package web.models;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String name;
    private int age;
    private List<Car> carsLists;

    public Car() {
        this.carsLists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            carsLists.add(new Car("Модель " + (i + 1), "Имя " + (i + 1), i + 1));
        }
    }

    private Car(String model, String name, int age) {
        this.model = model;
        this.name = name;
        this.age = age;
    }

    public List<Car> getCarsList(String val) {
        if (val != null && val.matches("[-+]?\\d+")
                && Integer.parseInt(val) >= 2 && Integer.parseInt(val) < 5) {
            return carsLists.subList(0, Integer.parseInt(val));
        }
        return carsLists;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
