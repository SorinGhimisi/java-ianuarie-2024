package curs8.curs81;

public class Masina {
    int anFabricatie;
   String culoare;
    String model;

    public Masina(int anfabricatie, String culoare, String model) {
        this.anFabricatie= anfabricatie;
        this.culoare= culoare;
        this.model= model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "anFabricatie=" + anFabricatie +
                ", culoare='" + culoare + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
