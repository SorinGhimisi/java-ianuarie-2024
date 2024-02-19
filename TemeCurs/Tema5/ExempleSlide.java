package TemeCurs.Tema5;

public class ExempleSlide {
    public static void main(String[]args){
       int y=2;
       double x= 3+6* --y;
       System.out.println("x este egal cu" +x);

       //////////////////////////
       int x1=2*5+3*4-8;
       int y1=2*((5+3)*4-8);
       System.out.println("x1 este " +x1);
       System.out.println("y1 este" +y1);
       //////////////////////////////////

        String firstName= "Maria";
        String lastName="Georgescu";
        System.out.println(firstName + lastName);
        firstName+=lastName;
        System.out.println(firstName);

        ///////////////////////////////
        System.out.println(10 % 3);
        System.out.println(11 % 3);
        System.out.println(12 % 3);

        ////////////////////////////////

        boolean x3 = false;
        System.out.println(x3);
        x3=!x3;
        System.out.println(x3);

//////////////////////////////////////
        int counter = 0;
        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);


/////////////////////////////////////////////
        int x4= 3;
        int y4= ++x4 * 5 / x4-- + --x4;
        System.out.println("y4 este" +y4);





    }
}
