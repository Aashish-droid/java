//create a class with anyname with 2 varibale, 2 method 2 instance and access all the variables and methos using both instance

import java.lang.*;

class MyClass{

	int x = 10;
	int y = 20;

	public void method1(){
		System.out.println(+ new MyClass().x);	
		
	}
	public void method2(){
		System.out.println(+ new MyClass().y);	
	}
	
}
public class Ex1{
	public static void main(String[] args){
	
		MyClass a = new MyClass();
		a.method1();
		a.method2();
	}
}