
package lab1;

import java.util.*;
 class Square  extends Quadrilateral  {
    
     public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         //System.out.println("ENTER THE TYPE OF THE POLYGON");
        // String t=s.nextLine();
         System.out.println("ENTER LENGTH OF THE SIDE");
         int side=s.nextInt();    
      Square s1=new  Square();
      //s1.Quadrilateral(t);
      
         System.out.println("The area of a Square is "+s1.getArea(side));
        
     }

    private void Quadrilateral(String t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
