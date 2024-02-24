package curs8;

import curs8.curs81.Bloc;
import curs8.curs81.Masina;

import java.util.Scanner;

public class Curs {
    public static void main(String[]args){

Person persoana1=new Person("Alex",20);
persoana1.nume= "Alex";
persoana1.age=20;
Person persoana2=new Person("Alex2",22);
persoana2.nume="Alex2";
persoana2.age=22;

System.out.println("varsta este :" +persoana1.age);
if (persoana1.age==persoana2.age){
    System.out.println("Varsta este diferita");
}
Person persoana3 = new Person("Alex",20);
System.out.println(persoana3.age);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu numar utilizator:");
        int numarUtilizator = scanner.nextInt();
        System.out.println(numarUtilizator);
//
        Bloc bloc1=new Bloc(true,2000,7);
        Bloc bloc2=new Bloc(false,1999,10);
        Bloc bloc3= new Bloc( true,2008,5);

        Masina masina1=new Masina(2023,"blue","Audi");
        Masina masina2=new Masina(2020,"black","Mercedes");
        Masina masina3=new Masina(2015,"red","BMW");


        if (masina1.getAnFabricatie()>2020) {

            System.out.println(masina1 + " Este nou");
        }


    }
}
