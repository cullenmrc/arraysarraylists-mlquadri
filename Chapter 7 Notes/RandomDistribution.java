import java.util.Random;
import java.util.Scanner;

/**
 * 
4) We can use the Math.random method to generate random integers. For example, Math.random() 
generates a random floating-point number  greater than or equal to 0 and less than 1. The 
expression (int)(Math.random() * 6) generates random numbers between 0 and 5, simulating the 
throw of a die. In this lab assignment, you will use an array to test whether the random 
generator is fair; that is, whether each possible value is generated approximately the same 
number of times.

Your program should ask the user:

How many random numbers should be generated? 
What is the number of values for each random draw? (i.e., how many sides does the die have?

Make an array with one element for each possible outcome (i.e., the number of sides of the 
die. Set each element to 0. Then keep calling the random number generator. For each random
number generated, increment the count stored in the array at that index to capture the 
distribution of the random numbers.

After all numbers have been generated, print the counters. Here is a typical program run:

How many random numbers do you want to generate? 1000
What is the number of values for each random draw? 10.

0    78
1   101
2   118
3    97
4   103
5   102
6   112
7    91
8    94
9   104
What is the code for your program?
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomDistribution
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RandomDistribution
     */
    public RandomDistribution()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("How many random numbers do you want to generate? ");
        int runs = s.nextInt();
        System.out.println("What is the number of values for each random draw? ");
        int num = s.nextInt();
        int[] randoms = new int[num];
        int test;
        for (int i = 0; i < runs; i++)
        {
            test=(int)(Math.random()*num);
            for(int x=0;x<=num;x++)
            {
                if(test==x)
                {
                    randoms[x]++;
                }
            }
        }
        int index=0;
        for(int value:randoms)
        {
            System.out.println(index+": "+value);
            index++;
        }
    }
}
