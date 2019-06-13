package symulacja;

import java.util.Random;

public abstract class Przeciwnicy extends Losowo {
    protected Random rnd;
    protected long seed;

    public Przeciwnicy(long seed) {
        super(seed);
    }

    public Przeciwnicy(Plansza mapa) {
        super(mapa);
    }

    public Przeciwnicy() {

    }

    public void getSeed()
    {

    }
    public void setSeed()
    {

    }
}
