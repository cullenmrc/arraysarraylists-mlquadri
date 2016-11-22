/**
 * Partially Filled Array
 *      has more elements than needed
 *          tracks which elements have values and wivh doesnt
 *          if filled grows to make room
 * 
 * @author (muhammed) 
 * @version (11-12-16)
 */
public class PartiallyFilledArray
{
    private double[] values;
    private int currentSize;
    private static final int DEFULT_CAPACITY =100;
    /**
     * Default constructor for objects of class PartiallyFilledArray
     */
    public PartiallyFilledArray()
    {
        this( DEFULT_CAPACITY );
    }

    /**
     * constructor for objects of class PartiallyFilledArray
     */
    public PartiallyFilledArray(int initialCurrentSize)
    {
        this.values=new double[initialCurrentSize];
        this.currentSize=0;
    }

    public void add(int value)
    {
        if(this.currentSize==this.values.length)
        {
            this.grow();
        }
        this.values[currentSize]=value;
        this.currentSize+=1;
    }
    
    public void grow()
    {
        double[] newValues= new double[(this.values.length)*2];
        for(int i=0; i<this.values.length; i++)
        {
            newValues[i]=this.values[i];
        }
        this.values=newValues;
    }
    
    public void remove(int index)
    {
        for(int i=index; i<this.values.length-1; i++)
        {
            this.values[i]=this.values[i+1];
        }
    }

    public void insert(int index, int value)
    {
        if(this.currentSize==this.values.length)
        {
            this.grow();
        }
        for(int i=this.currentSize-1; i>=index; i--)
        {
            this.values[i+1]=this.values[i];
        }
        this.values[index]=value;
        this.currentSize+=1;
    }
}
