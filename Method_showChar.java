/* This program displays the character
at the specified character position.

*/
import java.util.Scanner;

public class Method_showChar
{

public static void main(String[] args)
{
String lineOfText;
int index;
Scanner stdin = new Scanner(System.in);

System.out.print("Enter a line of text:");
lineOfText = stdin.nextLine();

System.out.print(" Enter your index: ");
index = stdin.nextInt();

showChar(lineOfText,index);
}

public static void showChar(String str, int index)
{
System.out.print(str.charAt(index));
}
}