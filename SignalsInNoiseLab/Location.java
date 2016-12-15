/**
 * Write a description of class Location here.
 * 
 * @author (mlquadri) 
 * @version (12-14-16)
 */
public class Location
{
    /** description of instance variable x (add comment for each instance variable) */
    private int row;
    private int col;
    /**
     * Default constructor for objects of class Location
     */
    public Location(int x, int y)
    {
        row=x;
        col=y;
    }

    /**
     * returns the row
     *
     * @return  an intager representing the row
     */
    public int getRow()
    {
         return row;
    }

    /**
     * returns the column
     *
     * @return  an intager representing the column 
     */
    public int getCol()
    {
        return col;
    }
}
