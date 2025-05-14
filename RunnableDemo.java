package Pulkit06417711923;
class MyRunnable implements Runnable {
 private String threadName;
 public MyRunnable(String name) {
     this.threadName = name;
 }
public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println(threadName + " is running - Count: " + i);
         try {
             Thread.sleep(500); // Pause for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println(threadName + " was interrupted.");
         }
     }
     System.out.println(threadName + " has finished execution.");
 }
}
public class RunnableDemo {
 public static void main(String[] args) {
     MyRunnable runnable1 = new MyRunnable("Thread A");
     MyRunnable runnable2 = new MyRunnable("Thread B");
     Thread thread1 = new Thread(runnable1);
     Thread thread2 = new Thread(runnable2);
     thread1.start();
     thread2.start();
     for (int i = 1; i <= 3; i++) {
         System.out.println("Main thread is working... Step: " + i);
         try {
             Thread.sleep(700); 
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted.");
         }
     }
     System.out.println("Main thread has finished execution.");
 }
}
