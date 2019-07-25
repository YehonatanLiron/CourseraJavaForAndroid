package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House
{
    private boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth)
    {
        super(dimension, dimension, lotLength, lotWidth);
        this.mSecondFloor = false;
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean seondFloor)
    {
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.mSecondFloor = seondFloor;
    }

    public boolean hasSecondFloor()
    {
        return this.mSecondFloor;
    }

    @Override
    public String toString()
    {
        String retString = super.toString();

        if (this.mSecondFloor)
        {
            retString = retString.concat("; is a two story cottage");
        }
        else
        {
            retString = retString.concat("; is a cottage");
        }

        return retString;
    }
}

