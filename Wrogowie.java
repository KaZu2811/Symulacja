package symulacja;

public class Wrogowie extends Przeciwnicy {

    public Wrogowie(long seed) {
        super(seed);
    }

    public Wrogowie(Plansza mapa) {
        super(mapa);
    }

    public Wrogowie()
    {

    }

    public static int zakończP()
    {
        Rycerz.liczbaHP = 0;
        return Rycerz.liczbaHP;
    }
}