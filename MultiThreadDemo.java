package Pulkit06417711923;
class MyThread extends Thread {
 private String threadName;
 public MyThread(String name) {
     threadName = name;
 }
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(threadName + " is running: Iteration " + i);

         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println(threadName + " interrupted.");
         }
     }
     System.out.println(threadName + " has finished executing.");
 }
}
public class MultiThreadDemo {
 public static void main(String[] args) {
     MyThread thread1 = new MyThread("Thread 1");
     MyThread thread2 = new MyThread("Thread 2");
     thread1.start();
     thread2.start();
     for (int i = 1; i <= 5; i++) {
         System.out.println("Main thread is running: Iteration " + i);
         try {
             Thread.sleep(1500); // Sleep for 1.5 seconds
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted.");
         }
     }
     System.out.println("Main thread has finished executing.");
 }
}

