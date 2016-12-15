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
        Radar radar = new Radar(ROWS, COLS);
        radar.setNoiseFraction(0.10);
        
        // prompt the user to optionally enter the location of the monster
        //  (if they don't, leave the location randomly determined)
        
        Scanner s = new Scanner(System.in);
        boolean run=true;
        int mx=0;
        int my=0;
        String yn;
        Location loc;
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
                Location loca = new Location(mx, my);
                Radar.setMonsterLocation(loca);
                run=false;
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
