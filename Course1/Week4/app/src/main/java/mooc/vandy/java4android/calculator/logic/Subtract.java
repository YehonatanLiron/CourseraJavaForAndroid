package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Operation{
    int difference;

    public Subtract(int argumentOne, int argumentTwo)
    {
        this.difference = argumentOne - argumentTwo;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.difference);
    }
}
