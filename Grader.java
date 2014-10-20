import java.util.Scanner;

public class Grader {
  
  public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       System.out.println("Input the total points of the test: ");       
       total = scnr.nextInt();
       System.out.println("Enter your score on the test: ");
       score = scnr.nextInt();
       percentage = (score * 100 / total);
       System.out.println("Your score is " + percentage + "%");
    }
}
  
 