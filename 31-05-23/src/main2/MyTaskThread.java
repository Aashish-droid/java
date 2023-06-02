package main2;

public class MyTaskThread implements Runnable {
	public void run() {
		MyTask t = new MyTask();
		t.print();
	}
}
