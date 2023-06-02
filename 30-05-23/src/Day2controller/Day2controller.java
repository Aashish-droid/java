package Day2controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Day2Model.Day2Model;

public class Day2controller {
    Scanner sc = new Scanner(System.in);
    List<Day2Model> empList = new ArrayList<>();

    public void addEmployee() {
        Day2Model emp = new Day2Model();
        System.out.println("Enter employee name: ");
        String ename = sc.next();
        emp.setEname(ename);

        System.out.println("Enter employee number: ");
        int eno = sc.nextInt();
        emp.setEno(eno);

        empList.add(emp);
    }

    public void viewEmployee() {
        for (Day2Model emp : empList) {
            System.out.println( emp.getEname()+ " " +  emp.getEno());
        }
        //--------------------------------------------------------------------------
    	Iterator<Day2Model> i = empList.iterator();
    	while (i.hasNext()) {
			System.out.println(i.next());
		}
    	//--------------------------------------------------------------------------
    	empList.forEach(e -> System.out.println(e));
    	//--------------------------------------------------------------------------
    	empList.forEach(System.out::println);
    }

    public void serialize() {
        try {
            FileOutputStream fos = new FileOutputStream("dedalus.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empList);
            oos.close();
            fos.close();
            System.out.println("Serialized and saved to dedalus.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deserialize() {
        try {
            FileInputStream fis = new FileInputStream("dedalus.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            empList = (ArrayList<Day2Model>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized from dedalus.txt");
            
            for (Day2Model emp : empList) {
                System.out.println(emp.getEno() + " " + emp.getEname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
