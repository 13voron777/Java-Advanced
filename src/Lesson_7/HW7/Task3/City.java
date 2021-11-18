package Lesson_7.HW7.Task3;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class City {
    @XmlAttribute
    private String name;

    @XmlElement
    private String street;

    @XmlElement
    private int house;

    public City(String name, String street, int house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }
}
