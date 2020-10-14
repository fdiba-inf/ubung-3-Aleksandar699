package exercise3;
import java.util.Scanner;
public class NumberCounter {
  public static void main (String [] args) {
  

Scanner input = new Scanner(System.in);

int number = input.nextInt();
int countd = 0;
int countc = 0;
int sum = 0;
 
 while (number !=0) {
   if (number>0) {
   countd++;
   sum = sum + number;
   number = input.nextInt();
 }
 else {
  countc++;
  sum = sum + number;
  number = input.nextInt();
 }
 }
 double average = (sum/countd + countc);
 
 System.out.println("Positive numbers: " + countd);
 System.out.println("Negative nubmers: " + countc);
 System.out.println("Sum: " + sum);
 System.out.println("Average: " + average);  
}
}
