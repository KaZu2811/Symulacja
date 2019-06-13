package symulacja;

public class EliksirŻycia extends Przedmioty {

    public EliksirŻycia()
    {

    }

    public static int dodajHP()

    {
        Rycerz.liczbaHP = Rycerz.liczbaHP + 20;
        return Rycerz.liczbaHP;
    }
}
