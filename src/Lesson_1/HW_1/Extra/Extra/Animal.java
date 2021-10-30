package Lesson_1.HW_1.Extra.Extra;

public class Animal implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int tmp = this.speed - ((Animal)o).speed;

        if (tmp == 0) {
            int priceCom = this.price - ((Animal)o).price;
            if (priceCom == 0) {
                int weightCom = this.weight - ((Animal)o).weight;
                if (weightCom == 0) {
                    return this.breed.compareTo(((Animal) o).breed);
                } else {
                    return weightCom;
                }
            } else {
                return priceCom;
            }
        } else {
            return tmp;
        }
    }
}