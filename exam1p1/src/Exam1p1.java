/*
Create a program that allows users to continuously enter the total number of students 
in a class(each class should be numbered-see sample run.)The user should be asked 
if they would like to enter the number of students in a class or see the total at 
that point. if the user enters exit, the program should terminate and output the 
final total upon exit.

 */
import java.util.Scanner;
/**
 *
 * @author hamilton
 */
public class Exam1p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    boolean a=true;
    int count=1;
    int total=0;
    
    while(a){
    
    System.out.println("-See total students so far or enter next class?");
    String command=input.nextLine().toLowerCase();
    
        if(command.equals("total")){
        System.out.printf("Total so far is:%d\n\n",total);
        }
        
        else if(command.equals("enter")){
        System.out.println("Enter total students in class "+count+":\n");
        int students=input.nextInt();
        input.nextLine();
        total+=students;
        count++;
        }
        else if (command.equals("exit")){
        System.out.printf("Total students when exiting: %d\n", total);
        a=false;
        }
 
        }
    }
    
}