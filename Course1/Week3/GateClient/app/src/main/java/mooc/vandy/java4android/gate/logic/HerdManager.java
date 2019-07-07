package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    public static final int HERD = 24;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    void simulateHerd(Random rand)
    {
        int herd = HERD;
        int atPasture = 0;

        int numOfIterations = 10;

        for (int i = 0; i < numOfIterations; i++)
        {
            int w_or_e_0_1;

            if (0 == atPasture)
            {
                w_or_e_0_1 = 1; // east (OUT) gate auto chosen - all the snails are in
            }
            else
            {
                w_or_e_0_1 = rand.nextInt();
            }

            if (w_or_e_0_1 == 0)
            {
                int movingIn = rand.nextInt(atPasture) + 1;
                herd = herd + movingIn;
                atPasture = atPasture - movingIn;
            }
            else
            {
                int movingOut = rand.nextInt(herd) + 1;
                herd = herd - movingOut;
                atPasture = atPasture + movingOut;
            }

        }
    }


}
