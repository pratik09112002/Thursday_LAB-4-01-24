package Thursday_LAB_4_01_24;

class ReverseNumberThread extends Thread 
{
    @Override
    public void run() 
    {
        System.out.println("\nNumbers from 1 to 9999 in reverse order:");
        for (int i = 9999; i >= 1; i--) 
        {
            System.out.print(i + " ");
        }
    }
}