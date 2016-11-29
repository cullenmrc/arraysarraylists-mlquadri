

/**
Sounds can be represented by an array of “sample values” that describe the intensity of the 
sound at a point in time. The program in ch07/sound of your companion code reads a sound 
file (in WAV format), processes the sample values, and shows the result. Your task is to 
process the sound by introducing an echo. For each sound value, add the value from 0.2 seconds 
ago. Scale the result so that no value is larger than 32767.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtensionEcho
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class ExtensionEcho
     */
    public ExtensionEcho()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
