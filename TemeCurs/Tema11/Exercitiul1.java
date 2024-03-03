package TemeCurs.Tema11;

public class Exercitiul1 {
    public static void main (String[]args){
        int day = 5;
        String dayOfWeek;
        switch (day){

            case 1:
                dayOfWeek = "Monday";
                break;
                case 2:
            dayOfWeek = "Tuesday";
            break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case  7:
                dayOfWeek = "Sunday";
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        System.out.println("The corresponding day of the week is:" +dayOfWeek);
    }


}
