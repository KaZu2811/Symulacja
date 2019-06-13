package symulacja;

public class Smok extends Potwory {


    public Smok() {

    }

    public int atak() {
         Rycerz.liczbaHP = Rycerz.liczbaHP - 30;
        return Rycerz.liczbaHP;
    }
}