
/**
 * Write a description of class Notes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Notes
{
    public static void createArrayOfEvens()
    {
        /*
         * an array stores multiple elements of the same type (e.g., int)
         * 
         *  the array is an object that must be declared and initialized
         *  
         *  For example, create an array of the first ten even numbers.
         *      By default, every element has a value of 0
         */
        int[] evenNumbers = new int[10];
        for( int i = 0; i < 10; i++ )
        {
            evenNumbers[i] = (i+1) * 2;
        }
        
        /* 
         * print all the elements in the array
         *  length returns the number of elements in the array
         */
        for( int i = 0; i < evenNumbers.length; i++ )
        {
            System.out.println( i + ": " + evenNumbers[i] );
        }
    }
    
    public static void createArrayOfOdds()
    {
        /*
         * This is an example of an array literal.
         *  No new operator is used.
         *  The size is determined based on the number of elements in the
         *      literal.
         *  Can only be used when declaring the array.
         */
        int[] oddNumbers = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        
        // this won't compile
        //oddNumbers = { 1, 3, 5 };
    }
    
    public static void createArrayOfStrings()
    {
        /*
         * This creates a new array that stores references to five Strings.
         *  No new strings are created.
         */
        String[] words = new String[ 5 ];
        
        for( int i = 0; i < words.length; i++ )
        {
            words[i] = new String( "" + i );
        }
        
        for( int i = 0; i < words.length; i++ )
        {
            System.out.println( i + ": " + words[i] );
        }
        
        
        
    }
}
