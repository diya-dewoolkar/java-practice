
package encapsulation;

public class mainclass {

    public static void main(String[] args) {

        student s = new student();

        
        s.setid(101);
        s.setName("Diya");
        s.setage(22);
        s.setCity("Pune");
        s.setcourse("BTech CSE");
        s.setfees(85000.0);
        s.setpercentage(85.5f);
        s.setchar('A');
        s.setmob_no(9876543210L);
        s.setis_Placed(false);
        s.setcollege_name("ABC College");
        s.setemail("diya@gmail.com");
        s.setSemester(8);
        s.setdepartment("Computer Science");
        s.setgender("Female");

        
        System.out.println("Student ID: " + s.getid());
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getage());
        System.out.println("City: " + s.getCity());
        System.out.println("Course: " + s.getcourse());
        System.out.println("Fees: " + s.getfees());
        System.out.println("Percentage: " + s.getpercentage());
        System.out.println("Grade: " + s.getchar());
        System.out.println("Mobile Number: " + s.getmob_no());
        System.out.println("Placed: " + s.getis_Placed());
        System.out.println("College: " + s.getcollege_name());
        System.out.println("Email: " + s.getemail());
        System.out.println("Semester: " + s.getsemester());
        System.out.println("Department: " + s.getdepartment());
        System.out.println("Gender: " + s.getgender());
    }
}
