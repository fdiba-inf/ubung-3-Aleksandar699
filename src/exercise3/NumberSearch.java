package exercise3;
import java.util.Scanner;
public class NumberSearch {
public static void main(String [] args) {
  int s = 100;
  int p = 0;
  for (int i = 100; i<=1000; i++) {
    if (i%5==0 && i%6==0) {
      System.out.print(" " +i);
      p++;
    }
    if (p>9) {
    System.out.println("");
    p=0;
}
}
}
}
  