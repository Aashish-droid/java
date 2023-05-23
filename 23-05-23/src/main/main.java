package main;

import java.util.Scanner;

class employee{
	int empno = 999;
	String empname ="Mr.A";

	public void getdetails(double sal) {
		System.out.println(empno+"--"+empname+"--"+sal);
	}
}
class manager extends employee{
	String dept ="IT";
	public void getdetails() {
		System.out.println(empno+"--"+empname+"--"+dept);
	}
}
public class main {
	public static void main(String[] args) {
		
		System.out.println("Enter Basic Salary");
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		
		salary a = new salary();
		a.basic(s);
		a.net();
				
		employee emp = new employee();
		emp.getdetails(a.getNet());
		
		manager mgr = new manager();
		mgr.getdetails();
		
	}
	
}
