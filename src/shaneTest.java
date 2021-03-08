
import java.util.Scanner;
public class shaneTest {

	public static void main(String[] args) {
		// Your First Program
		
		 Scanner userInput = new Scanner(System.in);
		 int number = 77;
		 boolean user = true;
		 int number2 = 0z00;
		
		Systen.out.println(number2);
		 
		System.out.println("I'm thinking of a number between 1 and 100. Guess the number!");
		int answer = Integer.parseInt(userInput.nextLine());
		 	
		 if (number == answer){
	            System.out.println("You guessed it!\n");
	            System.exit(0);
	          } else {
		        System.out.println("Keep guessing!");
		    }
		 if (answer > 77 - 5 && answer < 77+5 ) {
			 System.out.println("You're very close! \n");
		 } else {
			 System.out.println("Not even close! \n");
		 }
		 
		 if (number < 100) {
			 System.out.println("That's too high!!!");
		 }
		 	
	}
}
