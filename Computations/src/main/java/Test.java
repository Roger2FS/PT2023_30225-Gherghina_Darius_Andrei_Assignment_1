public class Test {
    public static void main(String[] args){

        Polinom p1 = new Polinom() ;
        Polinom p2 = new Polinom() ;

        p1.adaugare(2, 3) ;
        p1.adaugare(4, 2) ;
        p1.adaugare(5, 1) ;

        p2.adaugare(1, 4) ;
        p2.adaugare(3, 2) ;

        System.out.println("Polinomul 1 este: ") ;
        p1.afisare() ;
        System.out.println("");

        System.out.println("Polinomul 2 este: ") ;
        p2.afisare() ;
        System.out.println("");

        System.out.println("Adunarea celor doua polinoame este: ") ;
        Operatii.adunare(p1, p2) ;
        System.out.println("");

        System.out.println("Scaderea celor doua polinoame este: ") ;
        Operatii.scadere(p1, p2) ;
        System.out.println("");

        System.out.println("Inmultirea celor doua polinoame : ") ;
        Operatii.inmultire(p1, p2) ;
        System.out.println("");

        System.out.println("Derivarea polinomului : ") ;
        Operatii.derivare(p1) ;
        System.out.println("");

        System.out.println("Integrarea polinomului : ") ;
        Operatii.integrare(p1) ;
        System.out.println("");
    }
}
