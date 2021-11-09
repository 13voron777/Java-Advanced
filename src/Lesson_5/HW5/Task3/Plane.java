package Lesson_5.HW5.Task3;

public class Plane {
    private String name;
    private String hub;
    private String airlines;

    public Plane(String name, String hub, String airlines) {
        this.name = name;
        this.hub = hub;
        this.airlines = airlines;
    }

    public Plane(String hub, String airlines) {
        this.hub = hub;
        this.airlines = airlines;
    }

    public String getName() {
        return name;
    }

    public String getHub() {
        return hub;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name = " + name +
                ", hub = " + hub +
                ", airlines = " + airlines +
                '}';
    }
}
