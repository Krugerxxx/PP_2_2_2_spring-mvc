package web.models;

import java.util.List;

public interface CarsList {
    public List<CarsList> getCarsList();

    public String getModel();

    public String getName();

    public int getAge();
}
