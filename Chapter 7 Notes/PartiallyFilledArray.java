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
     * Default constructor for objects of class PartiallyFilledArray
     */
    public PartiallyFilledArray(int initialCurrentSize)
    {
        this.values=new double[initialCurrentSize];
        this.currentSize=0;
    }

    /**
     *
     */
    public void add(int value)
    {
        if(this.currentSize=this.values.length)
        {
            this.grow();
        }
        this.values[currentSize]=values;
        this.currentSize+=1;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public void grow()
    {
        double[] newValues= new double[(this.values.lenght)*2];
        for(int i=0; i<this.values.lenght; i++)
        {
            newValues[i]=this.values[i];
        }
        this.values=newValues;
    }
    
    public void remove(int index)
    {
        for(int i=index; i<this.values.lenght-1; i++)
        {
            this.values[i]=this.values[i+1];
        }
    }

}
