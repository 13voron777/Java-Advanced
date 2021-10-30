package Lesson_1.LAB_1.LR_1;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Cherry", 10, 10);
        products[1] = new Product("Banana", 8, 15);
        products[2] = new Product("Apple", 10, 15);
        products[3] = new Product("Mango", 14, 7);
        products[4] = new Product("Melon", 12, 3);
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Cherry", 10, 10));
        productList.add(new Product("Banana", 8, 15));
        productList.add(new Product("Apple", 10, 15));
        productList.add(new Product("Mango", 14, 7));
        productList.add(new Product("Melon", 12, 3));

        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println();

        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println();
    }
}
