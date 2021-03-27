package javaguessingnumber;
import java.util.Scanner;

public class JavaGuessingNumber {

    public static void main(String[] args) {
        
        int c_num = 1 + (int)(100* Math.random());
        
        int trial =5;
        Scanner s = new Scanner(System.in);
        for(int i=1;i<=trial;i++){
            System.out.println("Enter a integer number: ");
        int u_num = s.nextInt();// number entered by user
        if(u_num==c_num){
            System.out.println("CONGRULATIONS! You find the number!");
            System.out.println("Your trials: "+i);
            break;
        }
        else if(u_num>=c_num && i!=trial){
            System.out.println("Your number is great, enter again.");
            System.out.println("Your trials: "+i);
        }
        else if(u_num<=c_num && i!=trial){
            System.out.println("Your number is small, enter again.");
            System.out.println("Your trials: "+i);
        }
        
        if(i==trial){
            System.out.println("You have exhausted "+trial+" trials.");
            System.out.printf("The number is %d.",c_num);
        }
       } 
    }
    
}
