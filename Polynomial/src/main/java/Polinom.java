import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Polinom {
    public Map<Integer, Integer> polinom ;
    public Polinom(){
        this.polinom = new HashMap<Integer, Integer>() ;
    }
    public void adaugare( int coeficient , int exponent ) {
        this.polinom.put(coeficient, exponent) ;
    }
    public void afisare() {
        StringBuilder poli = new StringBuilder();
        for(Map.Entry<Integer,Integer> afisare : this.polinom.entrySet()){
            int coeficient = afisare.getKey();
            int exponent = afisare.getValue();

            if( exponent == 0 ){
                poli.append(coeficient);
            }
            else if( exponent == 1 ){
                poli.append(coeficient).append("x");
            }
            else{
                poli.append(coeficient).append("x^").append(exponent);
            }
            poli.append(" + ");
        }
        poli.setLength(poli.length() - 3);
        System.out.println(poli.toString());
    }
    public static Map<Integer,Integer> PolynomialParser(String polynomial) {

        Map<Integer, Integer> coefficients = new HashMap<>();
        String[] terms = polynomial.split("\\s*\\+\\s*"); // split la "+" cu spatiu inainte si dupa

        for (String term : terms) {
            String[] parts = term.split("x\\^?");
            int coefficient = Integer.parseInt(parts[0].trim());
            int exponent = parts.length > 1 ? Integer.parseInt(parts[1].trim()) : 0;
            coefficients.put(exponent, coefficient);
        }

        return coefficients;
    }
}
