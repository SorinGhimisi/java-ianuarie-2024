package TemeCurs.Tema9;

public class Exercitiu2 {
    public static void main(String[] args) {

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Valoarea 'A' - Excellente");
                break;

            case 'B':
                System.out.println("Valoarea 'B' - Good");
                break;

            case 'C':
                System.out.println("Valoarea 'C' - Average");

            default:
                System.out.println("Invalid grade");
                break;

        }
    }
}
