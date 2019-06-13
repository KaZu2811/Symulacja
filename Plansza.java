package symulacja;

import java.util.Scanner;

public class Plansza
{
    static int rozmiarPlanszy;
    public Plansza() {

    }

    public static int ustalRozmiar ()
    {
        Scanner odczyt = new Scanner(System.in);
        int rozmiarPlanszy = odczyt.nextInt();
        return rozmiarPlanszy;
    }



}