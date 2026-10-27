package methods_;

public class main {

    public static void main(String[] args) {
    	System.out.println("ATM SYSTEM........");
        practice_qns p = new practice_qns();
        System.out.println();
        p.checkBalance();
        p.withdrawAmount(500);
        p.checkBalance();
        System.out.println("------------------");
        System.out.println("\n----- STUDENT RESULT -----");
        double percentage = p.calculatePercentage(85, 90, 78);
        System.out.println("Percentage: " + percentage);
        System.out.println("\n----- TEMPERATURE -----");

        double fahrenheit = p.celsiusToFahrenheit(25);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("\n----- LOGIN SYSTEM -----");

        boolean result = p.login("admin", "secure123");
        System.out.println("Login Successful: " + result);
        
        
        System.out.println("----------Discount");
        double finalPrice = p.calculateDiscount(1000);
        System.out.println("Final price " + finalPrice);
        
        
        System.out.println("\n----- EMPLOYEE SALARY -----");
        double salary = p.calculateSalary(20000);
        System.out.println("Total Salary: " + salary);
        

        System.out.println("\n----- BANK INTEREST -----");
        double interest = p.calculateInterest(10000, 5, 2);
        System.out.println("Interest: " + interest);
        
        
        System.out.println("\n----- FOOD ORDER -----");
        p.placeOrder("Pizza", 2);
        

        System.out.println("\n----- ELECTRICITY BILL -----");
        double bill = p.calculateBill(100);
        System.out.println("Total Bill: " + bill);
        

        System.out.println("\n----- ONLINE VOTING -----");
        p.vote(22);
        

       
        System.out.println("\n----- RIDE BOOKING -----");
        double fare = p.calculateFare(10);
        System.out.println("Total Fare: " + fare);
        
        
        System.out.println("\n----- PASSWORD CHECK -----");
        String strength = p.checkPassword("Diya@123");
        System.out.println(strength);
    

    	System.out.println("----- LIBRARY SYSTEM -----");
    	p.issueBook("Java Programming", true);
    	

	    System.out.println("----- SHOPPING CART -----");
	    System.out.println(
	        "Total: " + p.calculateTotal(100, 200, 300));
	    
	
	    System.out.println("----- MAXIMUM NUMBER -----");
	    System.out.println("Maximum: " + p.findMax(10, 50, 30));
	    
	
	    System.out.println("----- PRIME NUMBER -----");
	    System.out.println("Is Prime: " + p.isPrime(7));
	    
	
	    System.out.println("----- PALINDROME -----");
	    System.out.println("Is Palindrome: " + p.isPalindrome(121));
	    
	
	    System.out.println("----- EVEN ODD COUNTER -----");
	    int[] arr = {10, 15, 20, 25, 30};
	    p.countEvenOdd(arr);
	    
	
	    System.out.println("----- GRADE CALCULATOR -----");
	    System.out.println("Grade: " + p.getGrade(85));
	    
	
	
	
	
	    }
}
	    
	        
	
	       
	    
	        
	        
	   
	
	
		