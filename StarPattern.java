/*This project consists of a pattern of
stars being printed in a specific order.

*/
class StarPattern
{
public static void main (String[] args)
{
int x = 1;
int increment_by = 2;
while (x > 0) {
// print spaces
int spaces = 4 - x / 2;
for (int i = 1; i <= spaces; i++) System.out.print(" ");
// print asterisks
for (int i = 1; i <= x; i++) System.out.print("*");
// end line
System.out.println();
// change width
if (x == 7) increment_by = -2; // reverse
x += increment_by;
}
}
}