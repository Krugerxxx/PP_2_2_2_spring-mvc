package web.models;

import java.util.List;

public interface Cars {
    public List<Cars> getCarsList();

    public String getModel();

    public String getName();

    public int getAge();
}
