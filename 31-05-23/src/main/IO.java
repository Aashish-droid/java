package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static void main(String[] args) throws IOException{
		System.out.println("main starts");
		try {
		int x=0;
		int y =0;
		int z = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter x");
		x = Integer.parseInt(br.readLine());
		System.out.println("enter y");
		y = Integer.parseInt(br.readLine());
		z=x/y;
		System.out.println("z ="+z);
		
		}
		catch(ArithmeticException ae) {
			System.out.println("no no 0");
		}
		catch(IOException ae) {
			System.out.println("Error :"+ae);
		}
		catch(Exception ae) {
			System.out.println("Error :"+ae);
		}
		finally {
			System.out.println("Finally");
		}
		
		System.out.println("main ends");
	}

}
