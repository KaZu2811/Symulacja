package symulacja;

public class Ogr extends Potwory {

    public Ogr() {


    }
    public int atak() {
        Rycerz.liczbaHP = Rycerz.liczbaHP - 15;
        return Rycerz.liczbaHP;
    }

}
