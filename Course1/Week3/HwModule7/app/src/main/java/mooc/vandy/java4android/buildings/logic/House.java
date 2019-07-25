package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building
{
    private String mOwner;
    private boolean mPool;
       
    public House(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner()
    {
        return this.mOwner;
    }

    public boolean hasPool()
    {
        return this.mPool;
    }

    public void setOwner(String owner)
    {
        this.mOwner = owner;
    }

    public void setPool(boolean pool)
    {
        this.mPool = pool;
    }

    @Override
    public String toString()
    {
        String retString = "Owner: ";

        if (this.mOwner != null)
        {
            retString = retString.concat(this.mOwner);
        }
        else
        {
            retString = retString.concat("n/a");
        }

        if (this.mPool)
        {
            retString = retString.concat("; has a pool");
        }

        if (this.calcLotArea() > this.calcBuildingArea())
        {
            retString = retString.concat("; has big open space");
        }

        return retString;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean retValue = false;
        if (o instanceof House)
        {
            if (this.calcBuildingArea() == ((House) o).calcBuildingArea())
            {
                retValue = (this.mPool == ((House) o).hasPool());
            }
        }
        return retValue;
    }
}
