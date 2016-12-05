import java.util.ArrayList;
/**
 * Write a description of class ArrayLists here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        fillList(list, 20,10);
    }
    public static void fillList(ArrayList<Integer> list, int numValues, int range)
    {
        for(int i=0; i<numValues; i++)
        {
            list.add((int)(Math.random()*range));
            
        }
    }
}
