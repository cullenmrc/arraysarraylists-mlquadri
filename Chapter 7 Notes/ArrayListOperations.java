import java.util.ArrayList;
/**
 *
6) Array lists are objects that, like arrays, provide you the ability to store items 
sequentially and recall items by index. Working with array lists involves invoking ArrayList 
methods, so we will need to develop some basic skills. Let’s start with the code below:

import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
   }
} 
The main method imports java.util.ArrayList and creates an ArrayList that can hold strings. It 
also prints out the ArrayList and, when it does, we see that the list is empty: [ ].

Complete the following tasks by adding code to this skeleton program. If you are asked to print 
a value, provide a suitable label to identify it when it is printed.

a) Invoke add() to enter the following names in sequence: Alice, Bob, Connie, David, Edward, 
Fran, Gomez, Harry. Print the ArrayList again.
b) Use get() to retrieve and print the first and last names.
c) Print the size() of the ArrayList.
d) Use size() to help you print the last name in the list.
e) Use set() to change “Alice” to “Alice B. Toklas”. Print the ArrayList to verify the change.
f) Use the alternate form of add() to insert “Doug” after “David”. Print the ArrayList again.
g) Use an enhanced for loop to print each name in the ArrayList.
h) Create a second ArrayList called names2 that is built by calling the ArrayList constructor 
that accepts another ArrayList as an argument. Pass names to the constructor to build names2. 
Then print the ArrayList.
i) Call names.remove(0) to remove the first element. Print names and names2. Verify that 
Alice B. Toklas was removed from names, but not from names2.

 * @author (Me) 
 * @version (Me)
 */
public class ArrayListOperations 
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
    }
    
    public void a(ArrayList<String> names)
    {
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
    }

    public void b(ArrayList<String> names)
    {
        names.get(0);
        names.get(names.size());
    }
    
    public void c(ArrayList<String> names)
    {
         System.out.println(names.size());
    }
    
    public void d(ArrayList<String> names)
    {
        
    }
    
    public void e(ArrayList<String> names)
    {
        
    }
    
    public void f(ArrayList<String> names)
    {
        
    }
    
    public void g(ArrayList<String> names)
    {
        
    }
    
    public void h(ArrayList<String> names)
    {
        
    }
    
    public void i(ArrayList<String> names)
    {
        
    }
}
