package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements OperationInterface{
    int product;

    public Multiply(int argumentOne, int argumentTwo)
    {
        this.product = argumentOne * argumentTwo;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.product);
    }
}
