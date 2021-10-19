package Lesson_1.LAB_1.Extra;

public class Animal implements Comparable { // <Animal>{
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

    // Сортируем по скорости/цене
    public int compareTo(Object o) {              //    public int compareTo(Animal o) {
        int tmp = this.speed - ((Animal)o).speed; //    int tmp = this.speed - o.speed;

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

    // Сравнение 2-х строковых значений
    // return this.breed.compareTo(((Animal)o).breed);
}