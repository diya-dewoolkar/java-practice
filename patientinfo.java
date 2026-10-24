
package Com.sampletest;

public class patientinfo {

    static String name;
    static byte patient_id;
    static short roomNo;
    static int age;
    static long AdharId;
    static float height;
    static double fees;
    static char gender;
    static boolean is_alive;

    public static void main(String args[]) {

        String patientName = "nayandeep";
        int checking_hours = 1;
        String pancard = "4895748748968";
        int visiting_hours = 8;

        System.out.println("Name: " + name);
        System.out.println("patient_id: " + patient_id);
        System.out.println("roomNo: " + roomNo);
        System.out.println("age of patient is: " + age);
        System.out.println("Adhar_id of patient is: " + AdharId);
        System.out.println("height of patient is: " + height);
        System.out.println("fees of patient is: " + fees);
        System.out.println("gender of patient is: " + gender);
        System.out.println("patient is alive: " + is_alive);

        System.out.println("name of patient: " + patientName);
        System.out.println("checking hours of patient: " + checking_hours);
        System.out.println("pancard no: " + pancard);
        System.out.println("hours you can meet patient: " + visiting_hours);
    }
}