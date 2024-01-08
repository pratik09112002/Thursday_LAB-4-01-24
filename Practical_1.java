/*
 Q. Write a program that creates 2 threads - each displaying a message 
 (Pass the message as a parameter to the constructor). The threads should 
 display the messages continuously till the user presses ctrl+c.
 
 */

package Thursday_LAB_4_01_24;

public class Practical_1 
{

    public static void main(String[] args) 
    {
        // Create and start the first thread
        MessageThread thread1 = new MessageThread("Thread 1: Hello, World!");
        thread1.start();

        // Create and start the second thread
        MessageThread thread2 = new MessageThread("Thread 2: Welcome to Java!");
        thread2.start();

        // Add a shutdown hook to handle Ctrl+C
        Runtime.getRuntime().addShutdownHook(new Thread(() -> 
        {
            System.out.println("Program terminated by user.");
            // Interrupt the threads to gracefully terminate them
            thread1.interrupt();
            thread2.interrupt();
        }));

        // Keep the main thread running indefinitely
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            // Handle interrupt (not expected in this case)
            e.printStackTrace();
        }
    }

    // Custom thread class to display a message continuously
    static class MessageThread extends Thread {
        private final String message;

        public MessageThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            try {
                // Display the message continuously until interrupted
                while (!Thread.interrupted()) {
                    System.out.println(message);
                    Thread.sleep(1000); // Sleep for 1 second before displaying the message again
                }
            } catch (InterruptedException e) {
                // Handle interrupt (gracefully terminate the thread)
            }
        }
    }
}
