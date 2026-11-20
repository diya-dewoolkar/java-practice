package polymorphism;

public class Student_{

    int id;
    String name;

    Student_() {
        id = 0;
        name = "Not Assigned";
    }

    Student_(int id) {
        this.id = id;
    }

    Student_(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student_ s1 = new Student_();
        Student_ s2 = new Student_(101);
        Student_ s3 = new Student_(102, "Diya");

        s1.display();
        s2.display();
        s3.display();
    }
}