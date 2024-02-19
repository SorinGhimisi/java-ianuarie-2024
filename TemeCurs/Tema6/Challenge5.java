package TemeCurs.Tema6;
import java.util.Scanner;
public class Challenge5 {
    public static void main (String[]args){
      Scanner scanner = new Scanner(System.in);
      System.out.println ("Introduceti primul numar:");
      double numar1 = scanner.nextDouble();
      System.out.println("Introduceti al doilea numar:");
      double numar2=scanner.nextDouble();
if (numar1 > numar2) {
    System.out.println(numar1 + "este mai mare decat" + numar2);
} else if (numar1 < numar2){
    System.out.println(numar1 + "este mai mic decat" +numar2);

}else {
    System.out.println(numar1+ "este egal cu" +numar2);
}

    }
}
