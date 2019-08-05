package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface
{
    private int sum;

    public Add(int argumentOne, int argumentTwo)
    {
        this.sum = argumentOne + argumentTwo;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.sum);
    }
}
