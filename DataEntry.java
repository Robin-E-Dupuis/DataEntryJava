

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Robin Dupuis
 */
public class DataEntry {
static int j=0;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of users : ");
        int numOfUsers = input.nextInt();
        
        
        
        FileWriter userData = new FileWriter("UserInfo.txt");
        while(j<numOfUsers){
        userData.write("Username: ");
        userData.write(user());
         userData.write(" , ");
         userData.write("Password: ");
        userData.write(password());
         userData.write(" , ");
         userData.write("Email: ");
        userData.write(email());
         userData.write("   ");
        ++j;
        }
        userData.close();
        
      
    }
    
    public static String user(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username number "+(j+1)+" : ");
        String username = input.next();
        return username; 
    }
    
        public static String password(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password number "+(j+1)+" : ");
        String password = input.next();
            System.out.print("Your password is : ");
        for(int i=0; i<password.length(); ++i){
            System.out.print("*");
        }
        return password; 
    }
        
    public static String email(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter email number "+(j+1)+" : ");
        String email = input.next();

            while(email.contains("@")!=true || email.contains("gmail.com")!=true){
                System.out.println("Email is not valid, Please enter a valid email : "); 
                email=input.next();
        }
        return email; 
    }
}
