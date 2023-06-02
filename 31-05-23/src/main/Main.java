package main;

import java.util.Scanner;

class Employee {
    int empno = 999;
    String empname = "Mr.A";

    public Employee() {
        System.out.println("From Employee Constructor"); // 4th line in the output
    }

    public void getDetails(double sal) {
        System.out.println(empno + "--" + empname + "--" + sal); // 5th line in the output
    }

    public Employee(String str) {
        System.out.println("From Employee Constructor " + str); // 6th line in the output
    }

    public Employee(int x) {
        this("Mani"); // this is giving the string to the 6th line in the output
        this.empno = x; // here x is coming from the child class Manager using super

        System.out.println("From Employee Constructor " + x); // 7th line in the output
    }

}

class Manager extends Employee {
    String dept = "IT";

    public Manager() {
        super(888); // used to invoke the base class constructor
        System.out.println("From Mgr Constr"); // 8th line in the output
    }

    @Override
    public void getDetails(double sal) {
        super.getDetails(sal); // super is telling to send details from the Manager // 9th line in the output
        System.out.println("--" + dept); // 10th line in the output
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Basic Salary"); // 1st line in the output
        try (Scanner sc = new Scanner(System.in)) {
            double s = sc.nextDouble();

            Salary a = new Salary();
            a.basic(s); // 2nd line in the output
            a.net(); // 3rd line in the output

            Employee emp = new Employee();
            emp.getDetails(a.getNet());

            Manager mgr = new Manager();
            mgr.getDetails(a.getNet());

            Employee em = new Manager();
            em.getDetails(a.getNet()); // Removed println since getDetails method already prints the details.

            if (emp instanceof Manager) {
                System.out.println("I am Groot");
            } else {
                System.out.println("I am root");
            }
        }
    }
}
