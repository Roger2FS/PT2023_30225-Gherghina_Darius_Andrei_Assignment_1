import java.util.*;
public class Operatii {
    public static void adunare(Polinom p1, Polinom p2){

        Polinom p3 = new Polinom();

        for (Map.Entry<Integer, Integer> adunare : p1.polinom.entrySet()) {
            int coeficient = adunare.getKey();
            int exponent = adunare.getValue();
            p3.adaugare(coeficient, exponent);
        }
        for (Map.Entry<Integer, Integer> adunare : p2.polinom.entrySet()) {
            int coeficient = adunare.getKey();
            int exponent = adunare.getValue();
            p3.adaugare(coeficient, exponent);
        }

        boolean b = false ;
        int retine = 100 ;
        Polinom p4 = new Polinom();
        for( int i = 0 ; i < p3.polinom.size() ; i++ ){
            if( i == retine ) {
                i++;
                if (i == p3.polinom.size()) {
                    break;
                }
            }
            b = false ;
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) p3.polinom.entrySet().toArray()[i];
            int exponent = entry.getValue();
            int coeficient = entry.getKey();
            if( i == p3.polinom.size() - 1 ){
                p4.adaugare(coeficient, exponent) ;
                break;
            }
            for( int j = i + 1 ; j < p3.polinom.size() ; j++ ){
                Map.Entry<Integer,Integer> entry2 = (Map.Entry<Integer,Integer>) p3.polinom.entrySet().toArray()[j];
                int exponent2 = entry2.getValue();
                int coeficient2 = entry2.getKey();
                if( exponent == exponent2 ){
                    int aux = coeficient + coeficient2 ;
                    p4.adaugare(aux, exponent) ;
                    b = true ;
                    retine =  j ;
                }
            }
            if( b == false ){
                p4.adaugare(coeficient, exponent) ;
            }
        }

        p4.afisare();
    }
    public static void scadere(Polinom p1, Polinom p2){

        Polinom p3 = new Polinom();

        for (Map.Entry<Integer, Integer> adunare : p1.polinom.entrySet()) {
            int coeficient = adunare.getKey();
            int exponent = adunare.getValue();
            p3.adaugare(coeficient, exponent);
        }
        for (Map.Entry<Integer, Integer> adunare : p2.polinom.entrySet()) {
            int coeficient = adunare.getKey();
            int exponent = adunare.getValue();
            p3.adaugare(-coeficient, exponent);
        }

        boolean b = false ;
        int retine = 100 ;
        Polinom p4 = new Polinom();
        for( int i = 0 ; i < p3.polinom.size() ; i++ ){
            if( i == retine ) {
                i++;
                if (i == p3.polinom.size()) {
                    break;
                }
            }
            b = false ;
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) p3.polinom.entrySet().toArray()[i];
            int exponent = entry.getValue();
            int coeficient = entry.getKey();
            if( i == p3.polinom.size() - 1 ){
                p4.adaugare(coeficient, exponent) ;
                break;
            }
            for( int j = i + 1 ; j < p3.polinom.size() ; j++ ){
                Map.Entry<Integer,Integer> entry2 = (Map.Entry<Integer,Integer>) p3.polinom.entrySet().toArray()[j];
                int exponent2 = entry2.getValue();
                int coeficient2 = entry2.getKey();
                if( exponent == exponent2 ){
                    int aux = coeficient + coeficient2 ;
                    p4.adaugare(aux, exponent) ;
                    b = true ;
                    retine =  j ;
                }
            }
            if( b == false ){
                p4.adaugare(coeficient, exponent) ;
            }
        }

        p4.afisare();
    }
    public static void inmultire(Polinom p1, Polinom p2){

        Polinom p3 = new Polinom() ;

        for(Map.Entry<Integer,Integer> inmultire : p1.polinom.entrySet()){
            int coeficient = inmultire.getKey();
            int exponent = inmultire.getValue();
            for(Map.Entry<Integer,Integer> inmultire2 : p2.polinom.entrySet()){
                int coeficient2 = inmultire2.getKey();
                int exponent2 = inmultire2.getValue();
                int aux = coeficient * coeficient2 ;
                int aux2 = exponent + exponent2 ;
                p3.adaugare(aux, aux2) ;
            }
        }

        p3.afisare() ;

        boolean b = false ;
        int retine = 100 ;
        Polinom p4 = new Polinom();
        for( int i = 0 ; i < p3.polinom.size() ; i++ ){
            if( i == retine ) {
                i++;
                if (i == p3.polinom.size()) {
                    break;
                }
            }
            b = false ;
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) p3.polinom.entrySet().toArray()[i];
            int exponent = entry.getValue();
            int coeficient = entry.getKey();
            if( i == p3.polinom.size() - 1 ){
                p4.adaugare(coeficient, exponent) ;
                break;
            }
            for( int j = i + 1 ; j < p3.polinom.size() ; j++ ){
                Map.Entry<Integer,Integer> entry2 = (Map.Entry<Integer,Integer>) p3.polinom.entrySet().toArray()[j];
                int exponent2 = entry2.getValue();
                int coeficient2 = entry2.getKey();
                if( exponent == exponent2 ){
                    int aux = coeficient + coeficient2 ;
                    p4.adaugare(aux, exponent) ;
                    b = true ;
                    retine =  j ;
                }
            }
            if( b == false ){
                p4.adaugare(coeficient, exponent) ;
            }
        }

        p4.afisare();
    }
    public static void impartire(Polinom p1, Polinom p2) {

    }
    public static void derivare(Polinom p1){

        Polinom p2 = new Polinom() ;

        for(Map.Entry<Integer,Integer> derivare : p1.polinom.entrySet()){
            int coeficient = derivare.getKey() ;
            int exponent = derivare.getValue() ;
            int aux = coeficient * exponent ;
            int aux2 = exponent - 1 ;
            p2.adaugare(aux, aux2) ;
        }

        p2.afisare() ;
    }
    public static void integrare(Polinom p1){

        StringBuilder poli2 = new StringBuilder();

        for(Map.Entry<Integer,Integer> integrare : p1.polinom.entrySet()){
            int coeficient = integrare.getKey() ;
            int exponent = integrare.getValue() ;
            int aux = exponent + 1 ;

            poli2.append(coeficient).append("/").append(aux).append("*x^").append(aux).append(" + ") ;
        }

        poli2.setLength(poli2.length() - 3);
        System.out.println(poli2.toString());
    }
}
