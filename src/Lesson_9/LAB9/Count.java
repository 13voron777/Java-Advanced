package Lesson_9.LAB9;

public class Count extends Thread {
    private int[] arr;
    private String operation;

    public Count(int[] mas, String operation) {
        this.arr = mas;
        this.operation = operation;
    }

    @Override
    public void run() {
        int res;
        if (operation.equals("min")) {
            res = Integer.MAX_VALUE;
        } else if (operation.equals("max")) {
            res = Integer.MIN_VALUE;
        } else {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (operation.equals("min")) {
                if (arr[i] < res) {
                    res = arr[i];
                }
            } else {
                if (arr[i] > res) {
                    res = arr[i];
                }
            }
        }
        System.out.println(operation + " = " + res);
    }
}
