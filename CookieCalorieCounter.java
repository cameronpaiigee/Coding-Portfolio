/* This project lets the user report the number of
 cookies ate by user and user's total calorie.
 
*/
import java.util.Scanner;
public class CookieCalorieCounter {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter number of cookies eaten: ");
int n = in.nextInt();
System.out.println("Your calorie intake was: " + (75*n) + " calories.");
}
}