import java.util.GregorianCalendar;
/**
 * A colection of notes on list, arrays and Chapter 7
 * 
 * @author (Muhammed Quadri) 
 * @version (11-15-16)
 */
public class Notes
{
    public static void createArryOfEvens()
    {
        /*
         * arrays store any number of elements of the same type
         *      can be primitive type or class
         *      arrays must be inicalised and declared
         *      
         * this creates an arry with 10 ints
         *      by defult int[] elements are inilalised to 0
         *      boolean = false
         *      objects = null
         */
        int[] evens = new int[10];
        /*
         * sets vales of arry to 10 positive ints
         */
        for(int i = 0; i<evens.length; i++)
        {
            evens[i]=(i+1)*2;
        }
        for(int i = 0; i<evens.length; i++)
        {
            System.out.println((i+1)+": "+evens[i]);
        }
    }
    public static void createArryOfOdds()
    {
        /*
         * array literal (denoted by curly brakets and comma-seperated values) can be used to 
         *      inilaize an arry, but only when declared
         */
        int[] odds = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        /* 
         * this doesn't work
         * odds = {1, 3, 5, 7, 9, 11, 13, 15, 16, 17, 19};
         */
        for(int i = 0; i<odds.length; i++)
        {
            System.out.println((i+1)+": "+odds[i]);
        }
        
        /*
         * most commen mistake
         *      arrays have a fix size when enitalised
         *      index must refer tp a valid element
         * 
         * for(int i = 0; i<=odds.length; i++)
         * {
         *     System.out.println((i+1)+": "+odds[i]);
         * }
         * creates:
         * java.lang.ArrayIndexOutOfBoundsException: 10
         * at Notes.createArryOfOdds(Notes.java:58)
         * 
         * means problem is index 10
         
        /* 
         *Array reffrence:
         *      varable of type array contains a refrence to a varable to another array
         */
        int[] odds2 = odds;
        odds2[1] = -1;
    }
    public static void createArryOfGregorianCalendar()
    {
        GregorianCalendar[] cal = new GregorianCalendar[12];
        for(int i = 0; i<cal.length; i++)
        {
            cal[i] = new GregorianCalendar(2016, i+1, 1);
        }
        for(int i = 0; i<cal.length; i++)
        {
            System.out.println((i+1)+": "+cal[i]);
        }
    }
}