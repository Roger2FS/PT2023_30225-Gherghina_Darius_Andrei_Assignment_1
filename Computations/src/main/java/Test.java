public class Test {
    public static void main(String[] args){

        Polinom p1 = new Polinom() ;
        Polinom p2 = new Polinom() ;

        p1.adaugare(1,3);
        p1.adaugare(-2,2);
        p1.adaugare(6,1);
        p1.adaugare(-5,0);

        p2.adaugare(1,2);
        p2.adaugare(-1,0);
        p2.adaugare(1,1);

        Operatii polioname = new Operatii(p1,p2);

        Polinom rezultatAdunare = polioname.adunare();
        Polinom rezultatScadere = polioname.scadere();
        Polinom rezultatInmultire = polioname.inmultire();
        Polinom rezultatImpartire = polioname.impartire();

        System.out.println("Polinomul 1 este: ") ;
        String afisareP1 = p1.toString() ;
        System.out.println(afisareP1);
        System.out.println("");

        System.out.println("Polinomul 2 este: ") ;
        String afisareP2 = p2.toString() ;
        System.out.println(afisareP2);
        System.out.println("");

        System.out.println("Adunarea celor doua polinoame este: ") ;
        System.out.println(rezultatAdunare);
        System.out.println("");

        System.out.println("Scaderea celor doua polinoame este: ") ;
        System.out.println(rezultatScadere);
        System.out.println("");

        System.out.println("Inmultirea celor doua polinoame : ") ;
        System.out.println(rezultatInmultire);
        System.out.println("");

        System.out.println("Rezultatul impartirii celor doua polinoame este: ") ;
        System.out.println(rezultatImpartire);
        System.out.println("");

        System.out.println("Derivarea polinomului : ") ;
        Operatii.derivare(p1);
        System.out.println("");

        System.out.println("Integrarea polinomului : ") ;
        Operatii.integrare(p1) ;
        System.out.println("");
    }
}
