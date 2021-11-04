
package lab1;

/**
 *
 * @author UR SYSTEM ADMIN
 */
import java.util.*;
public class Trapezium extends Quadrilateral implements Polygon {
    String name;
    int nsides;
    int angle;
    Scanner tr=new Scanner(System.in);
      public String  getName(){
          System.out.println("ENTER THE NAME OF POLYGON");
          
          name=tr.nextLine();
          return name;
      }
      
       public int getNumberOfSides(){
           System.out.println("ENTER THE NUMBER OF SIDES");
           this.nsides=tr.nextInt();
           return nsides;
           
       }

    public  int totalIntAngleSum(){
         
         angle=(nsides-2)*180;
           return angle;
    
    }
    
    public static void message(){
        System.out.println("================THANK YOU===============");
    }
    public static void main(String[] args) {
        
        Quadrilateral qd=new Quadrilateral();
        
        Trapezium t1= new Trapezium();
        
        t1.getName();
        t1.getNumberOfSides();
        t1.totalIntAngleSum();
        
        message();
        
        
        
    }
    
}
