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
        System.out.println(list);
        removeEvenElements(list);
        System.out.println(list);
    }
    public static void fillList(ArrayList<Integer> list, int numValues, int range)
    {
        for(int i=0; i<numValues; i++)
        {
            list.add((int)(Math.random()*range));
        }
    }
    public static void removeEvenElements(ArrayList<Integer> list)
    {
        /*
         * size is like lenght
         */
        for(int i = 0; i < list.size(); i++)
        {
            int value = list.get(i);
            if(value%2==0)
            {
                list.remove(i);
                i--;
            }
        }
    }
}
