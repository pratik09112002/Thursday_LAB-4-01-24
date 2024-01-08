package Thursday_LAB_4_01_24;

public class Singleton 
{
    private static boolean instanceCreated = false;

    public Singleton() throws SingletonException 
    {
        if (instanceCreated) 
        {
            throw new SingletonException("Error: Only one instance of Singleton allowed.");
        }

        // Initialization code here

        // Mark the instance as created
        instanceCreated = true;
    }
}
