/*
 Hamilton Nguyen 1000538439 07/12/2018

Problem 1 
 */
import java.util.Scanner;
/**
 *
 * @author hamilton
 */
public class Fluffy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s ="The big fluffy dog likes kibbles and bits";
        
        //turn the Strings into an array of words
        String [] splitS=s.split(" ");
        
        /*check if the last word in SplitS is bits (boolean value will be true 
        if the last word is bits*/
        
        boolean check =(splitS[splitS.length-1]).equals("bits"); 
        System.out.println(check);
        
        //check length of SplitS array
        int len=splitS.length;
        
        //print out variable len
        System.out.println("Length: "+len);
        
        //output the third word in the splitS array (should be fluffy)
        System.out.println(splitS[2]);
        
        //Print out the array splitS
        
       for (int i=0; i<splitS.length;i++){
       
           System.out.println(splitS[i]);
           
       }
     
 
    }
    
}
