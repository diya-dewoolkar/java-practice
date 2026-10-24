package Com.sampletest;

public class studentinfo {

  
    static String name = "Diya";
    static int age = 22;
    static int rollNo = 101;
    static String course = "CSE";
    static String city = "Pune";
    static double cgpa = 6.9;
    static String college = "MIT-WPU";
    static String gender = "Female";
    static int semester = 8;
    static boolean isStudent = true;

    public static void main(String[] args) {

        // ===== 5 LOCAL VARIABLES =====
        String company = "TCS";
        int experience = 0;
        double salary = 25000.0;
        String skill = "Java";
        boolean fresher = true;

       
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("City: " + city);
        System.out.println("CGPA: " + cgpa);
        System.out.println("College: " + college);
        System.out.println("Gender: " + gender);
        System.out.println("Semester: " + semester);
        System.out.println("Student: " + isStudent);

        System.out.println("Company: " + company);
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);
        System.out.println("Skill: " + skill);
        System.out.println("Fresher: " + fresher);
    }
}
