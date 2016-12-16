import javax.swing.JFrame;
import java.util.Scanner;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit and @mlquadri
 * @version 19 July 2014
 */
public class RadarViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create the radar, set the monster location, and perform the initial scan
        final int ROWS = 100;
        final int COLS = 100;
        final int MONSTERSNUM = 2;
        Radar radar = new Radar(ROWS, COLS, MONSTERSNUM);
        radar.setNoiseFraction(0.10);

        // prompt the user to optionally enter the location of the monster
        //  (if they don't, leave the location randomly determined)

        Scanner s = new Scanner(System.in);
        boolean run=true;
        int[] mx=new int[MONSTERSNUM];
        int[] my=new int[MONSTERSNUM];
        String yn;
        Location loca;
        while(run==true)
        {
            System.out.print("Do you want to choose the monsters position(Y/N): ");
            yn=s.next();
            System.out.println("");
            if(yn.equals("Y"))
            {
                for(int i=0; i>mx.length; i++)
                {
                    System.out.print("Input X"+i+": ");
                    mx[i]=s.nextInt();
                    System.out.println("");
                    System.out.print("Input Y"+i+": ");
                    my[i]=s.nextInt();
                    System.out.println("");
                    run=false;
                }
            }else if(yn.equals("N")){
                for(int i=0; i>mx.length; i++)
                {
                    mx[i]=(int)((Math.random())*100);
                    my[i]=(int)((Math.random())*100);
                    loca = new Location(mx[i], my[i]);
                    radar.setMonsterLocation(loca, i);
                    run=false;
                }
            }else{
                System.out.println("ERROR: That's not a valid answer");
                System.out.println("Please only put a capital N or Y");
                run=true;
            }
        }

        radar.scan();

        JFrame frame = new JFrame();

        frame.setTitle("Signals in Noise Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // a frame contains a single component; create the radar component and add it to the frame
        RadarComponent component = new RadarComponent(radar);
        frame.add(component);

        // set the size of the frame to encompass the contained component
        frame.pack();

        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);

        // perform 100 scans of the radar wiht a slight pause between each
        // after each scan, instruct the Java Run-Time to redraw the window
        for(int i = 0; i < 100; i++)
        {
            Thread.sleep(100); // sleep 100 milliseconds (1/10 second)

            radar.scan();

            frame.repaint();
        }
    }

}
