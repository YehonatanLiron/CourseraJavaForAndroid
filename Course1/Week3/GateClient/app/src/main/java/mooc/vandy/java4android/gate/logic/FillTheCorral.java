package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

import static mooc.vandy.java4android.gate.logic.Gate.IN;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    public static final int INIT_SNAILS_AT_POSTURE = 5;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    void setCorralGates(Gate[] gate, Random selectDirection)
    {
        for (int i = 0; i < gate.length; i++)
        {
            gate[i].setSwing(selectDirection.nextInt(3)-1);
        }
    }

    boolean anyCorralAvailable(Gate[] corral)
    {
        boolean retVal = false;

        for (int i = 0; i < corral.length; i++)
        {
            if (IN == corral[i].getSwingDirection())
            {
                retVal = true;
            }
        }

        return retVal;
    }

    int corralSnails(Gate[] corral, Random rand)
    {
        int snailsAtPasture = INIT_SNAILS_AT_POSTURE;
        Integer attempts = 0;

        while (snailsAtPasture > 0)
        {
            Integer migrationSize = rand.nextInt(snailsAtPasture) + 1;

            Integer chosenGate = rand.nextInt(corral.length);

            mOut.println(migrationSize.toString() + " are trying to move through corral " + chosenGate.toString());

            int direction = corral[chosenGate].getSwingDirection();

            if (IN == direction)
            {
                snailsAtPasture = snailsAtPasture - migrationSize;
            }
            else if (Gate.OUT == direction)
            {
                snailsAtPasture = snailsAtPasture + migrationSize;
            }

            attempts = attempts + 1;
        }

        mOut.println("It took " + attempts.toString() + " attempts to corral all of the snails.");

        return attempts;
    }
}
