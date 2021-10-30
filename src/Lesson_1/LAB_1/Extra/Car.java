package Lesson_1.LAB_1.Extra;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int speed = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (speed == 0) {
            int price = this.price - ((Car)o).price;
            if (price == 0) {
                int model = this.model.compareTo(((Car) o).model);
                if (model == 0) {
                    return this.color.compareTo(((Car) o).color);
                } else {
                    return model;
                }
            } else {
                return price;
            }
        } else {
            return speed;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}