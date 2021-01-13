/*
The university Lost and Found has three spots available to store found items. Create a program that allows user s to either
enter a found item or see the current list of items in the lost and found. You do not have to account for an empy lost
and found(the header can still print out-see sample run) and you do no have to worry about the user putting more items 
than the three available spots(it is ok if they go over) You must use an array.
 */
import java.util.Scanner;
/**
 *
 * @author hamilton
 */
public class Exam1p2 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String []item= new String[4];
        item[0]="";
        item[1]="";
        item[2]="";
        item[3]="";
        int count=0;
        boolean a=true;
        
        while(a){
        System.out.println("Welcome to the lost and found.\nEnter:\n-add to add an item\n-look to see all items");
        String command=input.next();
        
        if(command.equals("look")){
        System.out.printf("\n-items in Lost and Found:\n %s %s %s %s \n\n",item[0],item[1],item[2],item[3]);
            a=true;
        }
        
        if(command.equals("add")){
        
            System.out.println("\nEnter found item:");
            String entry=input.next();
            
            if(count<3) {
                item[count]=entry;
            }
            count++;
        }
        
        if(command.equals("exit")){
        System.out.println("\nBye.");
        break;
        }        
        }
    }
    
}
