
package lab1;


import java.util.*;
public class LAB1 extends Trapezium  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Quadrilateral qd=new Quadrilateral(); 
      
      Scanner sca=new Scanner(System.in);
      
        System.out.println("ENTER  YOUR NAME ");
      String m=sca.nextLine();
     
      System.out.println("======================MENU=====================");
       System.out.println("1-Square ");
       System.out.println("2-Rectangle");
       System.out.println("3-Trapezium");
      
      System.out.println("================ ** ==END== ** =================");
        System.out.println("SELECT A NUMBER CORRESPONDING TO THE POLYGON YOU WANT  ");
      int p=sca.nextInt();
      switch(p){
          case 1:
              LAB1 l1=new LAB1();
              System.out.println("ENTER THE LENGTH OF THE SIDE OF THE SQUARE ");
              int sid=sca.nextInt();
              l1.getArea(sid);
              System.out.println("The area of a Square is "+l1.getArea(sid));
              break;
         case 2:
             LAB1 l2=new LAB1();
             System.out.println("ENTER THE LENGTH AND WIDTH OF RECTANGLE SIDES");
             int len=sca.nextInt();
             int wid=sca.nextInt();
             l2.getArea(len,wid);
             System.out.println("The area of a rectangle is "+l2.getArea(len,wid));
             
             
              break;  
        case 3:
             LAB1 l3=new LAB1();
             System.out.println("ENTER SMALL BASE,BIG BASE AND HEIGHT OF THE TRAPEZIUM");
             int sbase=sca.nextInt();
             int bbase=sca.nextInt();
             int height=sca.nextInt();
             l3.getArea(sbase,bbase,height);
             System.out.println("The area of a Trapezium is "+l3.getArea(sbase,bbase,height));
             
             
              break;   
              
        default:
            System.out.println("INVALID CHOICE");
            break;
            
      }
      Quadrilateral qd1=new Quadrilateral(m,p);
      Trapezium t1= new Trapezium();
       t1.message();
      
    }
    
}
