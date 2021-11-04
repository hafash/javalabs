/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author UR SYSTEM ADMIN
 */
import java.util.*;
public class Rectangle extends Quadrilateral{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length");
        int length=sc.nextInt();
         System.out.println("Entera Width");
        int width=sc.nextInt();
        System.out.println("ENTER USERNAME AND TYPE");
         String user=sc.nextLine();
   /*       System.out.println("======================MENU=====================");
       System.out.println("1-Square ");
       System.out.println("2-Rectangle");
       System.out.println("3-Trapezium");
      
      System.out.println("================ ** ==END== ** =================");
        System.out.println("SELECT A NUMBER CORRESPONDING TO THE POLYGON YOU WANT  ");*/
        int ty=sc.nextInt();
       
        Quadrilateral q1=new Quadrilateral(user,ty);
        
        System.out.println("The area of rectangle is "+q1.getArea(length, width));
    }
  
    
}
