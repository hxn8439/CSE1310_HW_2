/*
 Hamilton Nguyen 1000538439 07/12/2018

Problem 4
 */
import java.util.Scanner;
public class FinalGrade {

    public static int [] enterInput(String message, int count)
    {
      System.out.println(message);
      Scanner input=new Scanner(System.in);
      
      int[] info=new int [count];
      
      for(int i=0;i<info.length;i++)
      {
          System.out.printf("Enter grade %d:\n", i+1);
          info[i]=input.nextInt();
      }
      return info;  
    }
    
    public static double getAvg(int [] average)
    {
        int total=0;
        
        for(int i=0; i<average.length;i++)
        {
            total=total+average[i];
        }
        return (double)total/(double)average.length;
    }
    
    public static double getWeightedGrade(int percent, double avg)
    {
        double percentDecimal=(double)percent/100;
        return avg*percentDecimal;
    }
    
    public static void letterGrade(double grandTotal)
    {
        
        if(grandTotal>=90)
        {
            System.out.println("You made a A!");
        }
        else if(grandTotal>=80)
        {
            System.out.println("You made a B!");
        }
        else if(grandTotal>=70)
        {
            System.out.println("You made a C!");
        }
        else if(grandTotal>=60)
        {
            System.out.println("You made a D!");
        }
        else
        {
            System.out.println("You made a F!");
        }
    }
   
    public static void main(String[] args) {
        
        int [] testGrades=enterInput("Please enter test grades:", 3);
        int [] hwGrades=enterInput("\nPlease enter HW grades:", 8);
        int [] quizGrades=enterInput("\nPlease enter quiz grades:", 5);
        int [] examGrade=enterInput("\nPlease enter final exam grade:", 1);
        
        double avgTest=getAvg(testGrades);
        double avgHws=getAvg(hwGrades);
        double avgQuiz=getAvg(quizGrades);
        double exam=getAvg(examGrade);
        
        double totalTestPoints= getWeightedGrade(45, avgTest);
        double totalHwPoints=getWeightedGrade(15, avgHws);
        double totalQuizPoints=getWeightedGrade(20, avgQuiz);
        double ExamPoints=getWeightedGrade(20, exam);
        

                
        double grandTotal=totalTestPoints+totalHwPoints+totalQuizPoints+ExamPoints;
        
        System.out.printf("Total grade is: %.02f\n", grandTotal);
        letterGrade(grandTotal);
    }
    
}
