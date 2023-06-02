package main;

class ThreadA implements Runnable{
	public void run() {
		try {
			for(int i =1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println("i="+i);
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadCls {

	public static void main(String[] args) {
		System.out.println("main start");
		ThreadA ta = new ThreadA();
		Thread t = new Thread(ta);
		t.start();
		System.out.println("main end");
	}

}
