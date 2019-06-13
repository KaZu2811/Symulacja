package symulacja;

public class Rycerz extends Losowo
{
     static int skarb=0;
     static int liczbaHP = 100;
     static int liczbaZłota = 0;
     static int liczbaRuchów = 0;

    public Rycerz() {
    }

    public static void idź( )
{
     r1.nextInt(Plansza.rozmiarPlanszy);
     pozycja = r1.nextInt(Plansza.rozmiarPlanszy);
}
    public static void interakcja(Main pozycja, Main obiekty[])
    {
        for (int i = 0; i < 3; i++) {
            if (obiekty[i] == pozycja) {
                Złoto.dodajZłoto();
                break;
            }
        }
        for (int k = 3; k < 6; k++)
        {
            if (obiekty[k] == pozycja)
            {
                EliksirŻycia.dodajHP();
                break;
            }
        }
        for (int j = 9; j < 12; j++)
        {
            if (obiekty[j] == pozycja)
            {
                    Potwory.atak();
                    break;
            }
        }
        if (obiekty[6] == pozycja)
        {
                SkrzyniaSkarbów.zakończW();
        }
        if (obiekty[7] == pozycja)
        {
            Wrogowie.zakończP();
        }
        if (obiekty[8] == pozycja)
        {
            Potwory.atak();
        }
    }
}
