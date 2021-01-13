/*
Allow users to enter 5 words that start with the letter b. If the word does not start with the letter b, ask the user to enter again.
you must use a for-loop.
 */
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String []word=new String[5];
        
        for (int i=0; i<5; i++){
        
            System.out.println("Enter a word that starts with letter b."); 
            word[i]=input.nextLine().toLowerCase();
            
            while(!word[i].startsWith("b")){
            System.out.println("Please enter again, it must start with a letter b.");
            word[i]=input.nextLine().toLowerCase();
            }
            
        }       
             
    }
    
}