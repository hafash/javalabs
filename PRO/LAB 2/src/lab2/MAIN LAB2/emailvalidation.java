
package lab.pkg2;

ss
public class emailvalidation extends MasterClass {
    public boolean checkEmail(String email){
      boolean status;
      String email_pattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
     // Pattern pattern=Pattern.compile(email_pattern);
     // Matcher matcher=pattern.matcher(email);
      
      if(email.matches(email_pattern)){
          return true;
      }
      else{
          return false;
      }
     // return status;
}

    @Override
    int getStringLength(String txt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String changeToUpper(String txt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
