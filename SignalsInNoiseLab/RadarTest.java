import java.util.Scanner;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Test
    public void testRadar()
    {
        // test that the Radar class successfully finds the location of the monster after several scans
        // test that the Radar class successfully finds the location of the monster after several scans
        Radar radar = new Radar(100,100);
        Scanner s = new Scanner(System.in);
        Location monster= new Location(0,0);
        Location guess;
        String yn;
        int mx=0;
        int my=0;
        boolean run=true;
        
        while(run==true)
        {
            System.out.print("Do you want to choose the monsters position(Y/N): ");
            yn=s.next();
            System.out.println("");
            if(yn.equals("Y"))
            {
                System.out.print("Input X: ");
                mx=s.nextInt();
                System.out.println("");
                System.out.print("Input Y: ");
                my=s.nextInt();
                System.out.println("");
                run=false;
            }else if(yn.equals("N")){
                mx=(int)((Math.random())*100);
                my=(int)((Math.random())*100);
                monster= new Location(mx, my);
                radar.setMonsterLocation(monster);
                run=false;
            }else{
                System.out.println("ERROR: That's not a valid answer");
                System.out.println("Please only put a capital N or Y");
                run=true;
            }
        }
        
        for(int i=0 ; i>100; i++)
        {
            radar.scan();
        }
        
        if( (radar.findMonster()) == (monster) )
        {
            System.out.println("The Program Works");
        }else{
            System.out.println("The De Program Works");
        }
    }
}
