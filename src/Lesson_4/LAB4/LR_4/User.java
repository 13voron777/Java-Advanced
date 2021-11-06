package Lesson_4.LAB4.LR_4;

public class User {
    private String login;
    private String phone;
    private String email;

    public User(String login, String phone, String email) {
        this.login = login;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                " login = " + login +
                ", phone = " + phone +
                ", email = " + email + '\'' +
                '}';
    }
}
