import java.awt.*;
import oudraw.*;
import java.util.ArrayList;
/**
 * Write a description of class InitialsMW here.
 *
 * @author (Morgan Woodward)
 * @version (09/11/2025)
 */


public class InitialsMW
{
    // instance variables - replace the example below with your own
    private OurPolygon TheM;
    private OurPolygon TheW;
    private ArrayList<Point> ListOfPoints;
    private OurPolygon Circle;
    /**
     * Constructor for objects of class InitialsMW
     */
    public InitialsMW()
    {
        // initialise instance variables
        TheM = new OurPolygon("M.txt", Color.BLUE);
        TheW = new OurPolygon("W.txt", Color.BLUE); // These create new polygons using the coordinates from the text files
        TheM.makeCanvasVisible();
        TheW.makeCanvasVisible();
        TheM.makeVisible();
        TheW.makeVisible(); // Used both just in case there's issues with the canvas
        
        ListOfPoints = new ArrayList<>(); // Creates an empty array list for the circle path later
    }
    
    public InitialsMW(String name1,String name2)
    {
       /**
        * Convert the names into integers
        */ 
       /*int forename = name1.hashCode();
       int surname = name2.hashCode();
       
       TheM = new OurPolygon("M.text", new Color(forename));
       TheM.makeCanvasVisible();
       TheM.makeVisible(); */
    }
    
    public void testing()
    {
        Circle = new OurPolygon(ListOfPoints, Color.BLUE);
        Circle.makeCanvasVisible();
        Circle.makeVisible();
        /*
           This creates a new circle,
           uses the array from circle path and a colour I chose,
           then makes everything visible to draw the circle*/
    }
    
    public void clear()
    {
        OurPolygon.resetCanvasImage(); // Clears the canvas
    }
    
    public void redraw()
    {
        TheM = new OurPolygon("M.txt", Color.BLUE);
        TheW = new OurPolygon("W.txt", Color.BLUE);
        TheM.makeCanvasVisible();
        TheW.makeCanvasVisible();
        TheM.makeVisible();
        TheW.makeVisible(); // The same code as in the constructor, just used to reset the canvas
    }
    public void animate()
    {
       //Rotate the M 360 degrees, in 4 90 degree steps
       for (int i = 0; i < 4; i++)
       {
          TheM.rotate(90.0);
          TheM.delay(500);
       }
       OurPolygon.delay(1000);
       //Increase the size of the M
       for (int i = 0; i < 5; i++)
       {
           TheM.changeSize(1.05, 1.05);
       }
       OurPolygon.delay(1000);
       //Decrease the size of the M
       for (int i = 0; i < 5; i++)
       {
          TheM.changeSize(0.95, 0.95); 
       }
       OurPolygon.delay(1000);
       //Change the colour of the W
       for (int i = 0; i < 5; i++)
       {
           TheW.setColor(Color.MAGENTA);
           TheM.delay(500);
           TheW.setColor(Color.BLUE);
       }
       OurPolygon.delay(1000);
       // Make the W follow a circle path
       for (int i = 0; i < ListOfPoints.size(); i++)
       {
          //Find coordinates
          Point converter = ListOfPoints.get(i);
          int x = (int) converter.getX();
          int y = (int) converter.getY();
          
          TheW.moveTo(x, y);
          TheW.delay(200);
          
       }
    }
    public ArrayList<Point> circlePath(int h, int k, int r, int numOfPoints,  boolean clockwise)
    {
        // Find the first point
        Point center = new Point(h,k);
        Point start = new Point(h+r,k);
        double currentAngle = 0;
        int counter = 0;
        ListOfPoints.add(start);
        // Determine whether loop goes clockwise or counterclockwise
        if (clockwise  == true)
        {
           // Create clockwise list of points
           
           while(counter < numOfPoints)
           {
               /*
                  This loop works in both if conditions the same way,
                  take the current angle which starts at 0, and either minus (clockwise) or plus (anti-clockwise) an angle so that it 
                  is evenly distributed.
                  Then get the cosine and sine using that angle to find the coordinate points required to add to the list*/
              currentAngle -= 360.0 / numOfPoints;
              int x = (int)(r * OurPolygon.cosine(currentAngle) + h);
              int y = (int)(r * OurPolygon.sine(currentAngle) + k);
              
              ListOfPoints.add(new Point(x,y));
              
              counter++;
           } 
           System.out.println(ListOfPoints);
           return ListOfPoints;
           
        } else 
        {
            // Create counter clockwise list of points
            while(counter < numOfPoints)
            {
               currentAngle += 360.0 / numOfPoints;
              int x = (int)(r * OurPolygon.cosine(currentAngle) + h);
              int y = (int)(r * OurPolygon.sine(currentAngle) + k);
              
              ListOfPoints.add(new Point(x,y));
              
              counter++; 
            } return ListOfPoints;
        }
        
    }
}