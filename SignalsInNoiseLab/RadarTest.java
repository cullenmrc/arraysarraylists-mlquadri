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
        Radar radar = new Radar(50, 50, 2);
        Scanner s = new Scanner(System.in);
        boolean run=false;
        String yn;
        Location[] monster = new Location[2];
        
        monster[0] = new Location(3, 1);
        radar.setMonsterLocation(monster[0], 0);
        monster[1] = new Location(1, 3);
        radar.setMonsterLocation(monster[1], 1);
        for(int i=0; i<100; i++)
        {
            radar.scan();
        }
        for(int i=0 ; i<100; i++)
        {
            if(radar.findMonster() == monster)
            {
                run=true;
            }
        }
        if( run==true )
        {
            System.out.println("The Program Works");
            run=false;
        }else{
            System.out.println("The Doesnt Program Works");
            run=false;
        }
        
        monster[0] = new Location(2, 2);
        radar.setMonsterLocation(monster[0], 0);
        monster[1] = new Location(4, 4);
        radar.setMonsterLocation(monster[1], 1);
        for(int i=0; i<100; i++)
        {
            radar.scan();
        }
        for(int i=0 ; i<100; i++)
        {
            if(radar.findMonster() == monster)
            {
                run=true;
            }
        }
        if( run==true )
        {
            System.out.println("The Program Works");
            run=false;
        }else{
            System.out.println("The Doesnt Program Works");
            run=false;
        }
    }
}
