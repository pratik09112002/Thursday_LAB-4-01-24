/*Q.Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.

*/


package Thursday_LAB_4_01_24;
 
public class Practical_2 
{
    public static void main(String[] args) 
    {
        // Create threads for Fibonacci series and reverse numbers
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseNumberThread reverseNumberThread = new ReverseNumberThread();

        // Start the threads
        fibonacciThread.start();
        reverseNumberThread.start();
    }
}
