import java.util.*;
import java.util.stream.Collectors;
public class Operatii {
    public static Polinom adunare(Polinom p1, Polinom p2){

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

        p3.afisare();

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
        return p4 ;
    }
    public static Polinom scadere(Polinom p1, Polinom p2){

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

        //p4.afisare();
        return p4 ;
    }
    public static Polinom inmultire(Polinom p1, Polinom p2){

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

        //p3.afisare() ;

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

        //p4.afisare();
        return p4 ;
    }
    public static Polinom impartire(Polinom p1, Polinom p2) {

        p1.polinom = p1.polinom.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        p2.polinom = p2.polinom.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Map<Integer, Integer> rezultat = new TreeMap<>(Collections.reverseOrder());
        Map<Integer, Integer> rest = new TreeMap<>(Collections.reverseOrder());

        while (p1.polinom.size() >= p2.polinom.size()) {
            int exponent1 = p1.polinom.values().iterator().next();
            int exponent2 = p2.polinom.values().iterator().next();
            int coeficient1 = p1.polinom.getOrDefault(0, exponent1);
            int coeficient2 = p2.polinom.getOrDefault(0, exponent2);

            int coeficient = coeficient1 / coeficient2;
            int exponent = exponent1 - exponent2;
            rezultat.put(coeficient, exponent);

            Map<Integer, Integer> produs = new TreeMap<>(Collections.reverseOrder());
            for (int exp : p2.polinom.keySet()) {
                int productExponent = exp + exponent;
                int productCoeficient = rezultat.getOrDefault(0, productExponent) * p2.polinom.getOrDefault(0, exp);
                produs.put(productCoeficient, productExponent);
            }

            for (int exp : p1.polinom.keySet()) {
                int restExponent = exp;
                int restCoeficient = p1.polinom.getOrDefault(0, exp) - produs.getOrDefault(0, exp);
                if (restCoeficient != 0) {
                    rest.put(restCoeficient, restExponent);
                }
            }

            p1.polinom = rest;
            rest = new TreeMap<>(Collections.reverseOrder());
        }

        Polinom rezultatPolinom = new Polinom();
        for (int exp : rezultat.keySet()) {
            int coef = rezultat.get(exp);
            rezultatPolinom.adaugare(coef, exp);
        }

        return rezultatPolinom;
    }
    public static void inmultireCuScalar(Polinom p1, int scalar){

        Polinom p2 = new Polinom() ;

        for(Map.Entry<Integer,Integer> inmultire : p1.polinom.entrySet()){
            int coeficient = inmultire.getKey();
            int exponent = inmultire.getValue();
            int aux = coeficient * scalar ;
            p2.adaugare(aux, exponent) ;
        }

        p2.afisare() ;
    }
    public static Polinom derivare(Polinom p1){

        Polinom p2 = new Polinom() ;

        for(Map.Entry<Integer,Integer> derivare : p1.polinom.entrySet()){
            int coeficient = derivare.getKey() ;
            int exponent = derivare.getValue() ;
            int aux = coeficient * exponent ;
            int aux2 = exponent - 1 ;
            p2.adaugare(aux, aux2) ;
        }

        //p2.afisare() ;
        return p2 ;
    }
    public static String integrare(Polinom p1){

        StringBuilder poli2 = new StringBuilder();

        for(Map.Entry<Integer,Integer> integrare : p1.polinom.entrySet()){
            int coeficient = integrare.getKey() ;
            int exponent = integrare.getValue() ;
            int aux = exponent + 1 ;

            poli2.append(coeficient).append("/").append(aux).append("*x^").append(aux).append(" + ") ;
        }

        poli2.setLength(poli2.length() - 3);
        //System.out.println(poli2.toString());

        return poli2.toString() ;
    }
    public static String afisare(Polinom p) {

        StringBuilder poli = new StringBuilder();
        for(Map.Entry<Integer,Integer> afisare : p.polinom.entrySet()){
            int coeficient = afisare.getKey();
            int exponent = afisare.getValue();

            if( exponent == 0 ){
                poli.append(coeficient);
            }
            else if( exponent == 1 ){
                poli.append(coeficient).append("*x");
            }
            else{
                poli.append(coeficient).append("*x^").append(exponent);
            }
            poli.append(" + ");
        }
        poli.setLength(poli.length() - 3);
        //System.out.println(poli.toString());

        return poli.toString();
    }
}
