package main;
interface Clac{
	public  int add(int a,int b);
}
public class Jv8 {
	public static void main(String[] args) {
		Clac v = (a,b)->{return(a+b);};
		System.out.println(v.add(9, 8));
	}
}
