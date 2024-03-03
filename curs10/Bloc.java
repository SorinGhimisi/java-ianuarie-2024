package curs10;

public class Bloc {
    String numeBloc;
    int numarulBlocului;
    String adresa;
    int numarApartamente;
    public Bloc (String numeBloc,int numarulBlocului,String adresa,int numarApartamente){
        this.numeBloc= numeBloc;
        this.numarulBlocului = numarulBlocului;
        this.numarApartamente = numarApartamente;
        this.adresa = adresa;

    }
 public int getNumarApartamente(){
        return  numarApartamente;
}

}
