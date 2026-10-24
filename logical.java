package javapractice;

public class logical {

	public static void main(String Arg[]) {

		int age = 22;
		int marks = 68;

		boolean a = ((age >= 18 && marks >= 60) || !(marks < 50)) && ((age != 25) || (marks == 68));
		System.out.println(a);

		boolean b = ((marks <= 75 && marks != 40) || !(age < 20)) && ((age >= 21) || (marks < 50 && marks >= 30));
		System.out.println(b);

		boolean c = ((age >= 20 && marks <= 65) || (marks > 50)) && (!(age >= 30) || marks == 68);
		System.out.println(c);

		boolean d = ((age >= 22 || marks >= 70) && (marks <= 80 || age != 18)) || (!(marks < 60) && age <= 25);
		System.out.println(d);

		boolean e = ((age >= 90 || marks >= 90) || (age == 22 && marks >= 65)) && !(marks < 50);
		System.out.println(e);

		boolean f = ((age >= 30 || marks >= 60) && ((age >= 50 || marks <= 76) && (age >= 20 && age <= 70))) || (marks != 40 && !(age < 18));
		System.out.println(f);

		boolean g = ((age >= 40 || marks <= 40) && (age >= 90 || marks == 68)) && ((age >= 50 && marks >= 30) || (marks != 50 && age <= 25));
		System.out.println(g);

		boolean h = (((age >= 18 && marks >= 65) || (age < 18 && marks >= 80)) && !(marks < 50)) || ((age == 22 || marks == 100) && (marks != 40));
		System.out.println(h);

		boolean i = ((age >= 20 && age <= 25) || (marks >= 70 && marks <= 80)) && (!(age > 30) || marks != 60);
		System.out.println(i);

		boolean j = ((age >= 18 && marks > 50) && ((marks != 68) || !(age == 22))) || ((age == 22 && marks == 68) && !(marks < 60));
		System.out.println(j);

		boolean k = (age >= 20 && marks > 60) || !(age < 18 && marks < 50);
		System.out.println(k);

		boolean l = ((age > 18 || marks >= 70) && marks != 40) || !(age >= 30);
		System.out.println(l);

		boolean m = (age >= 21 && marks <= 70) && (marks > 50 || !(age < 20));
		System.out.println(m);

		boolean n = ((age == 22 || marks == 68) && age >= 18) || !(marks < 60);
		System.out.println(n);

		boolean o = (age >= 25 || marks > 65) && (marks != 68 || age != 22);
		System.out.println(o);

		boolean p = ((age <= 25 && marks >= 60) || (age > 30 && marks < 50)) && !(marks == 40);
		System.out.println(p);

		boolean q = (age >= 18 && (marks >= 60 || marks <= 40)) || (!(age > 25) && marks != 70);
		System.out.println(q);

		boolean r = ((age < 20 || marks > 65) && (age >= 18 || marks == 50)) || !(marks < 30);
		System.out.println(r);

		boolean s = (age >= 20 && marks >= 60) && ((age != 22) || !(marks == 68));
		System.out.println(s);

		boolean t = ((age == 22 && marks > 60) || (age > 25 && marks < 50)) && !(age >= 30);
		System.out.println(t);

		boolean u = ((age >= 18 || marks >= 80) && (marks != 40 && age <= 25)) || !(age < 20);
		System.out.println(u);

		boolean v = (age >= 21 && marks <= 75) || ((age == 22 || marks == 90) && !(marks < 60));
		System.out.println(v);

		boolean w = ((age > 20 && age < 25) || (marks > 70 && marks < 80)) && (age != 30 || marks >= 60);
		System.out.println(w);

		boolean x = (!(age < 22) && marks >= 65) || ((age <= 20 || marks != 68) && age >= 18);
		System.out.println(x);

		boolean y = ((age >= 20 && marks > 50) || !(age == 22 && marks == 68)) && (marks >= 60 || age > 30);
		System.out.println(y);
	}
}