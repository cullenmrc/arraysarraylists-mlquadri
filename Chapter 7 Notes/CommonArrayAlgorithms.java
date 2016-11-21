import java.util.Arrays;
import java.util.Random;
/**
* Array Algorithm #3: Linear Search
 *  creates an array filled with random numbers
 *  find the index of the first element with the specified value
 *  prints the array and the index
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommonArrayAlgorithms
{
    public static void linearSearch( int valueToFind )
    {
        Random r = new Random();
        int input=valueToFind;
        String print = "";
        int[] array = new int[100];
        for(int i = 0; i<100; i++)
        {
            array[i]=r.nextInt();
            if(i==0)
            {
                array[i]=1;
            }
        }
        for(int i = 0; i<100; i++)
        {
            if (array[i]== input)
            {
                print="index: "+i;
                break;
            }else{
                print="There is no index with that number";
            }
        }
        System.out.println(print);
    }
}
