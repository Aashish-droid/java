package main;

class First{
//	final int x=20;    final means it is constant
	int x = 20;
	static int y =30;
	public static void staticMethod() {
		System.out.println(++y);
	}
	public void regularMethod() {
		System.out.println(++x);
		System.out.println(++y);
	}
}
public class staticEg {
	public static void main(String[] args) {
		First.staticMethod();
		First.staticMethod();
//		staticEg s1 = new staticEg();
//		staticEg s2 = new staticEg();
		First s1 = new First();
		First s2 = new First();
		s1.regularMethod();
		s2.regularMethod();
		
		}
}
