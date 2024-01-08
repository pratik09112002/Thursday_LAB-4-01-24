package Thursday_LAB_4_01_24;

class FibonacciThread extends Thread 
{
    @Override
    public void run() 
    {
        int n = 20; 		// Number of terms to display
        int a = 0, b = 1;
        System.out.println("Fibonacci Series (first " + n + " terms):");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            int c=a+b;		// 
            a = b;
            b = c;
        }
        System.out.println(); // Add a newline for better formatting
    }
}
