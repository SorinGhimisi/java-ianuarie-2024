package TemeCurs.Tema8;

public class Challenge17 {
  // Scrieți un program Java care simulează un sistem simplu de autentificare. Declarați o variabilă booleană
  // hasUsername și hasPassword.
  // Configurați o serie de condiții logice folosind aceste două variabile care vor verifica următoarele condiții:
  //
  //Dacă ambele hasUsername și hasPassword sunt adevărate, imprimați „Autentificare reușită”.
  //Dacă fie hasUsername sau hasPassword este fals, imprimați „Authentication failed”.
  //Dacă hasUsername este adevărat, dar hasPassword este fals, tipăriți „Parola este incorectă”.
    public static void main (String[]args){

boolean hasUsername = true;
boolean hasPassword = true;
if (hasUsername && hasPassword){
    System.out.println("Authentification successful");

} else if (!hasUsername || !hasPassword) {
    System.out.println("Authentification failed");


} else if (hasUsername && !hasPassword) {
    System.out.println("Password is incorrect");


}
    }
}