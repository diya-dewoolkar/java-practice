package methods_;

public class practice_qns {
	double balance =1000.00;
	
	public void  checkBalance() {
		System.out.println("account balance : " +balance);
	}
	public void withdrawAmount(double amount) {
		if(amount > 0 && amount <= balance)
		{
			balance=balance - amount;
			System.out.println("withdraw amount"+amount);
		}else {
			System.out.println("Insufficient Balance or invallid amount");
		}
	}
	    public double calculatePercentage(int m1, int m2, int m3) {
	        int total = m1 + m2 + m3;
	        return (total / 300.0) * 100;
	    }
	    
	    public void recharge(double amount) {
	        System.out.println("Recharge Successful: " + amount);
	    }
	    public double celsiusToFahrenheit(double c) {
	    	return(c * 9/5)+32;
	    	
	    }
	    public double calculateDiscount(double price) {
	    	double discount = price * 0.10;
	    	return price - discount;
	    }
	    public boolean login(String username, String password) {
	    	return username.equals("admin")&& password.equals("secure1234");
	    }
	    
	    //E-commerce Discount
	    public double calculateDis(double price) {
	    	double discount = price * 0.20;
	    	return price -discount;
	    }
	    public double calculateSalary(double basic) {
	    	double hra =basic * 0.20;
	    	double da = basic * 0.50;
	    	return basic +hra +da;
	    	
	    }
	    public double calculateInterest(
	    double principal,double rate,int time){
	    	return (principal * rate *time)/100;
	    }
	    
	    public void placeOrder(String item, int quantity) {
	    	if(quantity >0) {
	    		System.out.println("Food Item :" +item);
	    		System.out.println("Quantity : " +quantity);
	    		System.out.println("order placed successfully");
	    	} else {
	    		System.out.println("Invallid quantity");
	    		
	    	}
	    }
	     
	    public double calculateBill(int units) {
	    	if(units <0) {
	    		return -1;
	    	}
	    	double bill =units *5.0;
	    	return bill;
	    }
	    
	    //online voting system
	    public void vote (int age) {
	    	if(age>=18) {
	    		System.out.println("You are elligible to vote");
	    	} else {
	    		System.out.println("you are not elligible to vote");
	    	}
	    }
	    public double calculateFare(double distance) {
	    	if (distance < 0) {
	    		return -1;
	    	}
	    	double fare = distance *10;
	    	return fare;
	    }
	    public String checkPassword(String password) {
	        if (password != null
	                && password.length() >= 8
	                && password.matches(".*[A-Z].*")
	                && password.matches(".*[0-9].*")
	                && password.matches(".*[^a-zA-Z0-9].*")) {
	            return "Strong Password";
	        } else {
	            return "Weak Password";
	        }
	    }

	        
	        public void issueBook(String bookName, boolean isAvailable) {
	            if (isAvailable) {
	                System.out.println("Book issued: " + bookName);
	            } else {
	                System.out.println("Book is not available");
	            }
	        }

	      
	        public double calculateTotal(
	                double price1, double price2, double price3) {
	            return price1 + price2 + price3;
	        }

	     //maximum number
	        public int findMax(int a, int b, int c) {
	            if (a >= b && a >= c) {
	                return a;
	            } else if (b >= a && b >= c) {
	                return b;
	            } else {
	                return c;
	            }
	        }

	       
	        public boolean isPrime(int num) {
	            if (num <= 1) {
	                return false;
	            }

	            for (int i = 2; i <= num / i; i++) {
	                if (num % i == 0) {
	                    return false;
	                }
	            }

	            return true;
	        }

	        
	        public boolean isPalindrome(int num) {
	            if (num < 0) {
	                return false;
	            }

	            int original = num;
	            int reverse = 0;

	            while (num > 0) {
	                int digit = num % 10;
	                reverse = reverse * 10 + digit;
	                num = num / 10;
	            }

	            return original == reverse;
	        }

	       
	        public void countEvenOdd(int[] arr) {
	            int even = 0;
	            int odd = 0;

	            for (int num : arr) {
	                if (num % 2 == 0) {
	                    even++;
	                } else {
	                    odd++;
	                }
	            }

	            System.out.println("Even numbers: " + even);
	            System.out.println("Odd numbers: " + odd);
	        }

	     
	        
	        public char getGrade(int marks) {
	            if (marks < 0 || marks > 100) {
	                return 'X';
	            } else if (marks >= 80) {
	                return 'A';
	            } else if (marks >= 60) {
	                return 'B';
	            } else if (marks >= 40) {
	                return 'C';
	            } else {
	                return 'D';
	            }
	       

	    			
	    }
	}



