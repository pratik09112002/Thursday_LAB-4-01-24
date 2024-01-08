/*
 Q. Write a program to demonstrate the chained exception in Java.
 */


package Thursday_LAB_4_01_24;

public class Practical_3 
{

    public static void main(String[] args) 
    {
        try 
        {
            // Simulate an initial exception
            generateException();
        } catch (Exception e) 
        {
            // Catch the initial exception and add a new exception as a chained exception
            handleChainedException(e);
        }
    }

    public static void generateException() throws Exception 
    {
        try 
        {
            // Simulate a NullPointerException
            String str = null;
            str.length(); // This line will throw a NullPointerException
        } 
        catch (NullPointerException e) 
        {
            // Wrap the NullPointerException in a new exception (chained exception)
            throw new Exception("An error occurred while processing data.", e);
        }
    }

    public static void handleChainedException(Exception e) 
    {
        // Print the details of the initial exception and the chained exception
        System.out.println("Caught Initial Exception: " + e.getMessage());
        System.out.println("Chained Exception: " + e.getCause());
    }
}

