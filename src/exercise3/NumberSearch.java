package exercise3;

public class NumberSearch {
public static void main(String [] args) {
  int anzahl = 0;
  
  for (int i = 100; i<=1000; i++) {
    if (i%5==0 && i%6==0) {
      if (anzahl<9){      
      System.out.print(i + " ");
      anzahl++;
      }else if(anzahl==9){
      anzahl++;
    System.out.print(i);
    if(anzahl==10){
    System.out.print("\n");
    anzahl=0;
    }

    
}
}
}
}
}


  