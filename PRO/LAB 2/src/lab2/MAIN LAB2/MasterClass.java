s
package lab.pkg2;

import java.util.regex.Pattern;

public class MasterClass {
   public boolean checkEmail(String email){
       String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
       
        Pattern pat = Pattern.compile(emailRegex);
        
        if (email == null)
            return false;
        return pat.matcher(email).matches(); 
           
   }
   int getStringLength(String txt){
       
       return 0;
   }
   
   String changeToUpper(String txt){
       String a="hfhf";
       
       return a;
   }
   
   
           
    
    
}
