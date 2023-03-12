import java.util.*;
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
                    poli.append(coeficient).append("*x");
                }
                else{
                    poli.append(coeficient).append("*x^").append(exponent);
                }
                poli.append(" + ");
            }
            poli.setLength(poli.length() - 3);
            System.out.println(poli.toString());
    }
}
