package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Operation{
    int quotient;
    int remainder;
    boolean warning;

    public Divide(int argumentOne, int argumentTwo)
    {
        if (argumentTwo == 0)
        {
            this.warning = true;
        }
        else
        {
            this.warning = false;
            this.quotient = argumentOne / argumentTwo;
            this.remainder = argumentOne % argumentTwo;
        }
    }

    @Override
    public String toString()
    {
        String result;

        if (warning)
        {
            result = "Error: Divide by zero.";
        }
        else
        {
            result = String.valueOf(quotient) + " R: " + String.valueOf(remainder);
        }
        return result;
    }
}
