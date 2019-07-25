package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building
{
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices;

    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = null;
        this.mParkingSpaces = 0;
        sTotalOffices += 1;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = 0;
        sTotalOffices += 1;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices += 1;
    }

    public String getBusinessName()
    {
        return this.mBusinessName;
    }

    public int getParkingSpaces()
    {
        return this.mParkingSpaces;
    }

    public void setBusinessName(String businessName)
    {
        this.mBusinessName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces)
    {
        this.mParkingSpaces = parkingSpaces;
    }

    @Override
    public String toString()
    {
        String retString = "Business: ";

        if (this.mBusinessName != null)
        {
            retString = retString.concat(this.mBusinessName);
        }
        else
        {
            retString = retString.concat("unoccupied");
        }

        if (this.mParkingSpaces > 0)
        {
            retString = retString.concat("; has "+Integer.toString(this.mParkingSpaces)+" parking spaces");
        }

        retString = retString.concat(" (total offices: "+Integer.toString(sTotalOffices)+")");

        return retString;
    }

    @Override
    public boolean equals(Object o)
    {
        boolean retValue = false;
        if (o instanceof Office)
        {
            if (this.calcBuildingArea() == ((Office) o).calcBuildingArea())
            {
                retValue = (this.mParkingSpaces == ((Office) o).getParkingSpaces());
            }
        }

        return retValue;
    }
}
