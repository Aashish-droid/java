package main2;

public class Main {

	public static void main(String[] args) {
		//Method 1
		/*
		MyTaskThread mtt = new MyTaskThread();
		Thread t = new Thread(mtt);
		t.start();
		*/
		
		// Method-2
		Runnable r = new Runnable() {
			public void run() {
				MyTask t =new MyTask();
				t.print();
			}
		}; 
		
			Thread t = new Thread(r); 
			t.start();
		}
		
	}


