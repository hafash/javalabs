
package lab1;


public class Quadrilateral {
    String name,user;
    int type;
    int getArea(int s){
        
        return  s*s;
        
    }
     int getArea(int l,int w){
         return l*w;
        
    }
      int getArea(int a,int b,int h){
        return (a+b)*h/2;
    }
      
      Quadrilateral(int t){
          
          this.type=t;
          
          
      }
         Quadrilateral(){
          
             System.out.println("HELLO STUDENT !");
          
          
      }
         
            Quadrilateral(String u,int ty){
          
          this.user=u;
          this.type=ty;
          
          
      }
    
    
    
}
