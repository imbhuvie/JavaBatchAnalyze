// Demonstrate throw.
class DivisionByZeroException extends Exception
 {
   DivisionByZeroException(String msg)
   {
	   super(msg);
   }
}
public class DivisionByZero
{
    public void division()
    {
        int num1 = 10;
        int num2 = 0;
        try
		{
		 if (num2 == 0) throw new   DivisionByZeroException("Divide by Zero");
		 System.out.println(num1 + " / " + num2 + " = " +
	                              (num1 / num2));
	 	}
	 	catch (DivisionByZeroException e)
		{
	       System.out.println("Dealt with " + e);
		}
		finally
		{
	       System.out.println("Finally done.");
		}
		System.out.println("Returning from division.");
	}
    public static void main(String args[])
    {
        new DivisionByZero().division();
        System.out.println("Returning from main.");
    }
}


/*

OUTPUT:

Dealt with DivisionByZeroException: Divide by Zero
Finally done.
Returning from division.
Returning from main.
Press any key to continue . . .

*/
