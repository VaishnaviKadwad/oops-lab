/*Write a Java program that demonstrates cooperation between multiple threads using a shared object. 
Create a class that acts as a buffer and contains synchronized put() and get() methods. 
One thread places integer values into the buffer, while another thread removes them.
Use the wait() and notify() methods to ensure that:
•	The thread that places values waits when the buffer already contains a value
•	The thread that removes values waits when the buffer is empty
The program should run continuously, displaying the values as they are placed into
and removed from the buffer.*/

class Buffer {
    int value;
    boolean available = false;

    // Producer method
    synchronized void put(int value) {
        try {
            while (available) {
                wait();
            }

            this.value = value;
            System.out.println("Produced: " + value);
	     Thread.sleep(1000);
            available = true;
            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Consumer method
    synchronized int get() {
        int data = 0;

        try {
            while (!available) {
                wait();
            }

            data = value;
            System.out.println("Consumed: " + data);
	Thread.sleep(1000);
            available = false;
            notify();

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        return data;
    }
}

// Producer Thread
class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        int i = 1;

        while (true) {
            b.put(i++);
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        while (true) {
            b.get();
        }
    }
}

// Main Class
public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
