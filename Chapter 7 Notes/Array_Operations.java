/**
 * 
1.1) Let’s work on some basic skills by creating a program that contains a few experiments 
with arrays. If you are asked to print out a value, be sure to print a label that indicates 
what the value represents, unless otherwise indicated. For example, if you are asked to 
print a variable z, the output might look like this:

z : 8.0

Perform each of the following tasks:

a) Create an array x of doubles with an initializer list that contains the following 
   values: 8, 4, 5, 21, 7, 9, 18, 2, and 100.
b) Print the number of items in the array by printing the expression x.length.
c) Print the first array item, x[0].
d) Print the last array item. Be careful to choose the right index.
            e) Print the expression . Why is this value the same as in part d?
f) Use a standard for loop to print all the values in the array without labels. 
g) Use a standard for loop to print all the values in the array with labels to indicate 
   what each element is.
h) Use a standard for loop to print all the values in the array in reverse order with 
   labels to indicate what each element is.
i) Use an enhanced for loop to print all the values in the array without labels.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array_Operations
{
    /** description of instance variable x (add comment for each instance variable) */
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};

    /**
     * Default constructor for objects of class Array_Operations
     */
    public Array_Operations()
    {
        // initialise instance variables
        
    }

    public void printWithIndex()
    {
        int index=0;
        for(double value:x)
        {
            System.out.println(index+": "+value);
            index+=1;
        }
    }
    
    public void print()
    {
        for(double value:x)
        {
            System.out.println(value);
        }
    }
    
    public void printWithIndexStanderd()
    {
        for(int i=0; i<x.length; i++)
        {
            System.out.println(i+": "+x[i]);
        }
    }
    
    public void printStanderd()
    {
        for(int i=0; i<x.length; i++)
        {
            System.out.println(x[i]);
        }
    }
    
    public void printReverse()
    {
        for(int i=x.length-1; i>0; i--)
        {
            System.out.println(i+": "+x[i]);
        }
    }
    
    public void printFirst()
    {
        int index=0;
        System.out.println(index+": "+x[index]);
    }
    
    public void printLast()
    {
        int index=x.length-1;
        System.out.println(index+": "+x[index]);
    }
    
    public void printexpresion()
    {
        System.out.println(x.length-1);
    }
}
