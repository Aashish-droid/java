package main;

class CommonClass {
    private int num;
    private boolean available = false;

    public synchronized void put(int num) {
        // If the buffer is not available, wait until it becomes available
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Put the number into the buffer
        this.num = num;
        System.out.println("Producer put " + num);

        // Simulate some processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the buffer as available and notify waiting threads
        available = true;
        notifyAll();
    }

    public synchronized void get() {
        // If the buffer is not available, wait until it becomes available
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Get the number from the buffer
        System.out.println("Consumer get " + num);

        // Simulate some processing time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the buffer as unavailable and notify waiting threads
        available = false;
        notifyAll();
    }
}

class Producer implements Runnable {
    private CommonClass cc;

    public Producer(CommonClass cc) {
        this.cc = cc;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 1;
        int x = 1;
        while (x <= 10) {
            cc.put(i++);
            x++;
        }
    }
}

class Consumer implements Runnable {
    private CommonClass cc;

    public Consumer(CommonClass cc) {
        this.cc = cc;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        int x = 1;
        while (x <= 10) {
            cc.get();
            x++;
        }
    }
}

public class PC {
    public static void main(String[] args) {
        CommonClass cc = new CommonClass();
        new Producer(cc);
        new Consumer(cc);
    }
}
