package encapsulation;

public class student {
	private int id;
	private String name;
	private int age;
	private String city;
	private String course;
	private double fees;
	private float percentage;
	private char grade;
	private long mob_no;
	private boolean is_Placed;
	private String college_name;
	private String email;
	private int semester;
	private String department;
	private String gender;
	
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	
	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}
	
	public int getage(){
		return age;
		
	}
	public void setage (int age) {
		this.age=age;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String City) {
		this.city=city;
	}
	public String getcourse() {
		return course;
	}
	public void setcourse(String course) {
		this.course = course;
	}
	public double getfees() {
		return fees;
		
	}
	public void setfees(double fees) {
		this.fees = fees;
	}
	public float getpercentage() {
		return percentage;
	}
	public void setpercentage(float percentage) {
		this.percentage =percentage;
	}
	public char getchar() {
		return grade;
		
	}
	public void setchar(char grade) {
		this.grade =grade;
		
	}
	public long getmob_no() {
		return mob_no;
	}
	public void setmob_no(long mob_no) {
		this.mob_no =mob_no;
	}
	public boolean getis_Placed() {
		return is_Placed;
	}
	public void setis_Placed(boolean is_Placed) {
	    this.is_Placed = is_Placed;
	}
	public String getcollege_name() {
		return college_name;
		
	}
	public void setcollege_name(String college_name) {
		this.college_name =college_name;		
	}
	public String getemail() {
		return email;
		
	}
	public void setemail(String email) {
		this.email =email;
	}
	public int getsemester() {
		return semester;
		
	}
	public void setSemester(int semester) {
	    this.semester = semester;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender =gender;
	}
}
