package Com.sampletest;

public class employeeinfo {

    
    static String name;
    static int age;
    static int employeeId;
    static String department;
    static String city;
    static double salary;
    static String company;
    static String designation;
    static int experience;
    static boolean isEmployee;

    public static void main(String[] args) {


        String project = "Banking System";
        int workingHours = 8;
        double bonus = 5000.0;
        String skill = "Java";
        boolean fresher = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("City: " + city);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
        System.out.println("Designation: " + designation);
        System.out.println("Experience: " + experience);
        System.out.println("Employee: " + isEmployee);

        // ===== PRINT LOCAL VARIABLES =====
        System.out.println("Project: " + project);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Bonus: " + bonus);
        System.out.println("Skill: " + skill);
        System.out.println("Fresher: " + fresher);
    }
}