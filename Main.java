package symulacja;

class Main extends Losowo {

    public Main(int rozmiarPlanszy) {
        int[] obiekty = new int[12];
        Rycerz r1 = new Rycerz();
        Złoto z1 = new Złoto();
        Złoto z2 = new Złoto();
        Złoto z3 = new Złoto();
        EliksirŻycia e1 = new EliksirŻycia();
        EliksirŻycia e2 = new EliksirŻycia();
        EliksirŻycia e3 = new EliksirŻycia();
        SkrzyniaSkarbów s1 = new SkrzyniaSkarbów();
        Smok d1 = new Smok();
        Wrogowie w1 = new Wrogowie();
        Ogr o1 = new Ogr();
        Ogr o2 = new Ogr();
        Ogr o3 = new Ogr();
        int pozycja = r1.nextInt(rozmiarPlanszy);
        obiekty[0] = z1.nextInt(rozmiarPlanszy);
        obiekty[1] = z2.nextInt(rozmiarPlanszy);
        obiekty[2] = z3.nextInt(rozmiarPlanszy);
        obiekty[3] = e1.nextInt(rozmiarPlanszy);
        obiekty[4] = e2.nextInt(rozmiarPlanszy);
        obiekty[5] = e3.nextInt(rozmiarPlanszy);
        obiekty[6] = s1.nextInt(rozmiarPlanszy);
        obiekty[7] = w1.nextInt(rozmiarPlanszy);
        obiekty[8] = d1.nextInt(rozmiarPlanszy);
        obiekty[9] = o1.nextInt(rozmiarPlanszy);
        obiekty[10] = o2.nextInt(rozmiarPlanszy);
        obiekty[11] = o3.nextInt(rozmiarPlanszy);
    }
        public static void rozpocznij(Main pozycja, Main obiekty[]) {
            do {
                Rycerz.interakcja();
                Rycerz.idź();
                Rycerz.liczbaRuchów++;
                if (Rycerz.liczbaHP <= 0) {
                    System.out.println("Koniec symulacji, rycerz zginął");
                    System.out.println("Liczba zdobytego złota: " + Rycerz.liczbaZłota);
                    System.out.println("Liczba wykonanych ruchów: " + Rycerz.liczbaRuchów);
                }
                if (Rycerz.skarb == 1) {
                    System.out.println("Koniec symulacji rycerz zdobył skrzynię skarbów");
                    System.out.println("Liczba zdobytego złota: " + Rycerz.liczbaZłota);
                    System.out.println("Liczba wykonanych ruchów: " + Rycerz.liczbaRuchów);
                    break;
                }
            } while (Rycerz.liczbaHP >= 0);
        }
        public static void main (String[]args){
            Plansza.ustalRozmiar();
            Main symulacja = new Main(Plansza.rozmiarPlanszy);
            symulacja.rozpocznij();
        }
}
