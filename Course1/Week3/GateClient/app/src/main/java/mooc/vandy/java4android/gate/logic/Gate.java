package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate
{
    // TODO -- Fill in your code here
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    private int mSwing;

    public boolean setSwing(int direction)
    {
        boolean retVal = true;
        if ((IN == direction) || (OUT == direction) || (CLOSED == direction))
        {
            this.mSwing = direction;
        }
        else
        {
            retVal = false;
        }
        return retVal;
    }

    public boolean open(int direction)
    {
        boolean retVal = true;
        if ((IN == direction) || OUT == direction)
        {
            this.setSwing(direction);
        }
        else
        {
            retVal = false;
        }
        return retVal;
    }

    public void close()
    {
        this.setSwing(CLOSED);
    }

    public int getSwingDirection()
    {
        return mSwing;
    }

    public int thru(int count)
    {
        return count * this.getSwingDirection();
    }

    public String toString()
    {
        String retString;
        switch (this.getSwingDirection())
        {
            case CLOSED:
            {
                retString = "This gate is closed";
            }
            break;

            case IN:
            {
                retString = "This gate is open and swings to enter the pen only";
            }
            break;

            case OUT:
            {
                retString = "This gate is open and swings to exit the pen only";
            }
            break;

            default:
            {
                retString = "This gate has an invalid swing direction";
            }
            break;
        }
        return retString;
    }
}
