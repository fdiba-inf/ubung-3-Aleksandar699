package exercise3;

import java.util.Scanner;

public class PrimeNumber{
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    int b = 2;
    boolean Prime = true;
    while(b<number){
      if(number%b==0){
        Prime=false;
      }
      b++;
    }
    System.out.println("Prime number: " + Prime);
  }
}


