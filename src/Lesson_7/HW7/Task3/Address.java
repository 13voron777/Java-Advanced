package Lesson_7.HW7.Task3;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "address")
public class Address {

    @XmlElement(name = "city")
    private List<City> cities = new ArrayList<>();

    public void add(City city) {
        cities.add(city);
    }
}
