package numberguessing;
import java.util.Scanner;
import java.security.SecureRandom;


public class NumberGuessing {

    /**
     * @param args the command line arguments
     */
    public static String findNum(int u_num){
        SecureRandom rand = new SecureRandom();
        int c_num = rand.nextInt(10);
        
        
        if(u_num==c_num){
            return "CONGRULATIONS! You find the number!";
        }
        else{
            
            return "You can not find the number.";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        while(true){
            System.out.println("Enter a integer number: ");
            int user_num = s.nextInt();
            if(user_num>=0){
            System.out.println(findNum(user_num));
            }
            else{
            System.out.println("Game is stopped.");    
            break;
            }
        }
    }
}
