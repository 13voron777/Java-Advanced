package Lesson_3.HW3.Task3;

public class Run {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("test string examples");
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < stringBuilder.length() / 2; i++) {
            stringBuilder1.insert(i, stringBuilder.charAt(i));
        }
        for (int i = stringBuilder.length() / 2; i < stringBuilder.length(); i++) {
            stringBuilder2.insert(i - stringBuilder.length() / 2, stringBuilder.charAt(i));
        }
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
    }
}
