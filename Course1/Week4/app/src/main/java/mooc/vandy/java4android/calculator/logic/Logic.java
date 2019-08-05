package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    public final static int ADD = 1;
    public final static int SUBTRACT = 2;
    public final static int MULTIPLY = 3;
    public final static int DIVIDE = 4;

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation)
    {
        OperationInterface op;

        switch (operation)
        {
            case ADD:
                op = new Add(argumentOne, argumentTwo);
            break;

            case SUBTRACT:
                op = new Subtract(argumentOne, argumentTwo);
            break;

            case MULTIPLY:
                op = new Multiply(argumentOne, argumentTwo);
            break;

            //Divide is the default so op will never be undefined.
            default:
                op = new Divide(argumentOne, argumentTwo);
            break;
        }

        this.mOut.print(op.toString());
    }
}
