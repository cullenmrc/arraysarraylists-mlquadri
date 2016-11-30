

/**
 * Write a description of class TwoDArrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoDArraysNotes
{
    final int COUNTRIES=7;
    final int METAL_TYPES=3;
    private int[][] counts =
        {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {2,0,0},
            {0,1,1},
            {0,1,1},
            {1,2,0}
        };
    //counts=new[]int[COUNTRIES][METAL_TYPES];
    int[] newArray= {1,1,0};
    //counts[2]=newArray;
    
    /**
     * 
     */
    public TwoDArraysNotes()
    {
    }

    public void printTable()
    {
        for(int row =0; row<counts.length; row++)
        {
            //for(int col=0;col<METAL_TYPES;col++)
            //for(int col=0;col<counts[0].length;col++)
            for(int col=0;col<counts[row].length;col++)
            {
                System.out.print(counts[row][col]+"\t");
            }
            System.out.println("");
        }
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
    public int countMedals(int metalIndex)
    {
        int total=0;
        for(int row =0; row<counts.length; row++)
        {
            for(int col=0;col<counts[row].length;col++)
            {
                if(counts[row][col]==metalIndex)
                {
                    total++;
                }
            }
        }
        return total;
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
    public int countPerMetalType(int countryIndex)
    {
        int total=0;
        for(int col=0; col<counts[countryIndex].length; col++)
        {
            total+= counts[countryIndex][col];
        }
        return total;
    }
}
