/*
  Hamilton Nguyen 1000538439 07/12/2018

Problem 2
 */
import java.util.Scanner;
/**
 *
 * @author hamilton
 */
public class NumeroDeux {

    
    
        public static int getUserNum(String message){
        
        Scanner in=new Scanner(System.in);
        System.out.printf(message);
        int Number=in.nextInt();
        return Number;
        }
        
        public static String getUserString(int number){
        Scanner in=new Scanner(System.in);
       System.out.printf("Enter a word of length %d:", number);  
       String userIn= in.nextLine();
       return userIn;
        }
        public static boolean checkNumLength(int number, int check1, int check2){
        
        if(check1<=number&&check2>=number)
        {
            return false;
        }
        else
        {
            return true;
        }
        }
        
    public static void main(String[] args) //DO NOT MODIFY 
    {
        boolean choice=true;
        int number=0;
        
        while(choice)
        {
        number=getUserNum("Enter a number between 4-6:");
        choice=checkNumLength(number,4,6);
        }
        
        String input=getUserString(number);
        choice=true;
        int userInput2=0;
        
        while(choice)
        {
        userInput2=getUserNum("Enter another number (for substring)between 1-3:");
        choice=checkNumLength(userInput2,1,3);
        }
        
        System.out.println(input.substring(0,userInput2));
    }
    
}
