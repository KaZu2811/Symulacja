package symulacja;

public class Złoto extends Przedmioty {

    public Złoto(long seed) {
        super(seed);
    }

    public Złoto(Plansza mapa) {
        super(mapa);
    }

    int liczbaDodawanegoZłota = 15;

    public Złoto() {
        super();
    }


    public static int dodajZłoto()
    {
        Rycerz.liczbaZłota= Rycerz.liczbaZłota + 15;
        return Rycerz.liczbaZłota;
    }
}