package curs7;

public class Main {

    public static void main(String[]Args){
        System.out.println("Start");
        System.out.println(3.0==3.1);

        // Creare obiect

        Animal  animalObiect=new Animal();
        Animal pisica=new Animal();
        Animal caine= new Animal();
        Animal soarece = pisica;
        System.out.println(pisica==soarece);
        System.out.println(caine==soarece);

        int numarMasini=10;
        if (numarMasini == 10) {

        }else if (numarMasini == 3){

        }else{
            System.out.println("Nu ai 10 masini");

        }

    }
}
