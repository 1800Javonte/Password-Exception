import java.util.Scanner;
public class PasswordException extends Exception{
   public PasswordException(){
      super("Password must contain at least 8 characters.");
   }
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      String password;
      //Ask user to enter their password
      System.out.println("Please enter your password ");
      password = keyboard.next();
      
      //Call PasswordException constructor if user enters a password that doesn't have at least 8 characters.
      try{
         if(password.length() < 8){
            throw new PasswordException();
         }
      }catch(PasswordException pe){
         System.out.println(pe.getMessage());
      }
   }
}