package Thursday_LAB_4_01_24;

public class Practical_4 
{
	public static void main(String[] args) 
	{
        try 
        {
            // Create the first object
            Singleton firstInstance = new Singleton();
            System.out.println("First instance created successfully.");

            // Try to create a second object, which should throw an exception
            Singleton secondInstance = new Singleton();
            System.out.println("This line won't be executed.");
        } 
        catch (SingletonException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

