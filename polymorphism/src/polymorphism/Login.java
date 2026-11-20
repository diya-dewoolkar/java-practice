package polymorphism;

public class Login {

    void login(String username) {

        System.out.println("Username: " + username);
    }

    void login(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {

        Login l = new Login();

        l.login("Diya");

        l.login("Diya", "12345");
    }
}
