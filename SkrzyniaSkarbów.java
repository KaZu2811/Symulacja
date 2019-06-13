package symulacja;

public class SkrzyniaSkarbów extends Przedmioty {

    public SkrzyniaSkarbów(long seed) {
        super(seed);
    }

    public SkrzyniaSkarbów(Plansza mapa) {
        super(mapa);
    }

    public SkrzyniaSkarbów() {

    }

    public static int zakończW()
    {
        Rycerz.skarb++;
        return Rycerz.skarb;
    }
}
