/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Jordan Koski>
 * @version <October 20th>
 */
import java.util.Scanner;

public class PizzaPalace {

	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   int numPeople = 0;
   int numPizzas = 0;
   int numSlicesPeople = 0;
   int numSlicesPizza = 0;
   int totalSlices = 0;
      System.out.println("How many people in your group?");
      numPeople = scnr.nextInt();
      System.out.println("How many slices will each person get?");
      numSlicesPeople = scnr.nextInt();
      System.out.println("How many slices per pizza?");
      numSlicesPizza = scnr.nextInt();
      totalSlices = numSlicesPeople * numPeople; 
      numPizzas = totalSlices / numSlicesPizza;
      System.out.println(Math.ceil(numPizzas));
      System.out.println("You will have to buy " + numPizzas + " pizzas"); 
      
		
	}

}
