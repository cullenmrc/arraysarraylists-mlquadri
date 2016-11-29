

/**
Write array methods that carry out the following tasks for an array of integers by
completing the ArrayMethods class below. For each method, provide a test program.
public class ArrayMethods
{
private int[] values;
public ArrayMethods(int[] initialValues) { values = initialValues; }
public void swapFirstAndLast() { ... }
public void shiftRight() { ... }
...
}
a. Swap the first and last elements in the array.

b. Shift all elements by one to the right and move the last element into the first
position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
c. Replace all even elements with 0.
d. Replace each element except the first and last by the larger of its two neighbors.
e. Remove the middle element if the array length is odd, or the middle two
elements if the length is even.
f. Move all even elements to the front, otherwise preserving the order of the
elements.
g. Return the second-largest element in the array.
h. Return true if the array is currently sorted in increasing order.
i. Return true if the array contains two adjacent duplicate elements.
j. Return true if the array contains duplicate elements (which need not be
adjacent).
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    private int[] x;
    public ArrayMethods(int[] initialValues) 
    {
        x = initialValues;
    }
    public void a() 
    {
        int first = x[0];
        int last = x[(x.length-1)];
        x[0]=first;
        x[(x.length-1)]=last;
    }
    public void b()
    { 
        
    }
    public void c()
    { 
        
    }
    public void d()
    { 
        
    }
    public void e()
    { 
        
    }
    public void f()
    { 
        
    }
    public void g()
    { 
        
    }
    public void h()
    { 
        
    }
    public void i()
    { 
        
    }
    public void j()
    { 
        
    }
}
