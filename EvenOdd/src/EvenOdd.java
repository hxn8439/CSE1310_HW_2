/*
Hamilton Nguyen 1000538439 07/12/2018

Problem 3 
 */
import java.util.Scanner;
public class EvenOdd {

public static int getUserInput(String message){
Scanner in=new Scanner(System.in);
System.out.println(message);
int number=in.nextInt();
return number;
}
public static boolean checkIfEven(int userInput){
if(userInput % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }

}
public static boolean checkIfOdd(int userInput){
 if(userInput % 2 == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
}
    
public static void main(String[] args) {
     boolean check=true;
             int userInput=0;
     
        userInput=getUserInput("--Enter an even number:");
        check=checkIfEven(userInput);
        
        while(check)
        
        {
            userInput=getUserInput("That is not even. Enter an even number.");
            check=checkIfEven(userInput);    
        }
        
        check=true;
        userInput=getUserInput("--Ok thanks! Now enter an odd number:");
        check=checkIfOdd(userInput);
        
        while(check)
        {
            userInput=getUserInput("That is not odd. Enter an odd number.");
            check=checkIfOdd(userInput);

        }
        System.out.println("**Thanks! Bye!**");
    }
    
}
