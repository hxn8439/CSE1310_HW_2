/*
Problem 1. Hamilton Nguyen ID: 1000538439
 */
import java.util.Scanner;

public class NumberLength {

    public static void main(String[] args) {
    
Scanner input=new Scanner(System.in);
    int num;
    int num2;
    
    System.out.printf("Please enter a number between 4-6:");
    num=input.nextInt();
    
    input.nextLine();
    
if (num == 4 ||num == 5 || num == 6){
    
    System.out.printf("Enter a word with at least %d and less than 10 letters:", num);
    String word =input.next();
    
    if (word.length()>=num && word.length()<10){
    
    System.out.printf("Please enter another number:");
    num2=input.nextInt();
    
        if (num2 == 1 || num2 == 2 || num2 == 3){
        
        System.out.println(word.substring(0, num2));
      
        }
        
        else{ System.out.printf("Number out of range!"); }
    }
    
    else if (word.length()>=10){
    
    System.out.printf("Too many letters!");
    
    }
    else {
    
    System.out.printf("Too few letters!");
    
    }
    }
        
else {
    System.out.printf("Number out of range!");
    }        
        
    }
    
}
