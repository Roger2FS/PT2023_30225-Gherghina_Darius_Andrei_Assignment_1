import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
public class GUI extends JFrame{
    private JPanel mainPanel;
    private JLabel P1Label;
    private JTextField txtP1;
    private JTextField txtP2;
    private JLabel P2Label;
    private JLabel adunareLabel;
    private JLabel scadereLabel;
    private JLabel inmultireLabel;
    private JLabel impartireLabel;
    private JLabel derivareLabel;
    private JLabel integrareLabel;
    private JButton okAdunare;
    private JButton okScadere;
    private JButton okInmultire;
    private JButton okImpartire;
    private JButton okDerivare;
    private JButton okIntegrare;
    private JLabel rezultatCalcul;
    private JTextField rezultatField;
    private JLabel rezultat1;
    private JLabel rezultat2;
    private JTextField rez1;
    private JTextField rez2;
    public GUI() {
        okAdunare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p1 = txtP1.getText();
                String p2 = txtP2.getText();

                Map<Integer, Integer> poli1 = Polinom.PolynomialParser(p1);
                Map<Integer, Integer> poli2 = Polinom.PolynomialParser(p2);

                Polinom polinom1 = new Polinom();
                Polinom polinom2 = new Polinom();

                for(Map.Entry<Integer,Integer> afisare : poli1.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom1.adaugare(coeficient, exponent);
                }

                for(Map.Entry<Integer,Integer> afisare : poli2.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom2.adaugare(coeficient, exponent);
                }

                Polinom rezultat = Operatii.adunare(polinom1, polinom2);

                StringBuilder rezultatString = new StringBuilder();
                for(Map.Entry<Integer,Integer> afisare : rezultat.polinom.entrySet()){
                    int coeficient = afisare.getKey();
                    int exponent = afisare.getValue();

                    if( exponent == 0 ){
                        rezultatString.append(coeficient);
                    }
                    else if( exponent == 1 ){
                        rezultatString.append(coeficient).append("*x");
                    }
                    else{
                        rezultatString.append(coeficient).append("*x^").append(exponent);
                    }
                    rezultatString.append(" + ");
                }
                rezultatString.setLength(rezultatString.length() - 3);

                rezultatField.setText(rezultatString.toString());
            }
        });
        okScadere.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p1 = txtP1.getText();
                String p2 = txtP2.getText();

                Map<Integer, Integer> poli1 = Polinom.PolynomialParser(p1);
                Map<Integer, Integer> poli2 = Polinom.PolynomialParser(p2);

                Polinom polinom1 = new Polinom();
                Polinom polinom2 = new Polinom();

                for(Map.Entry<Integer,Integer> afisare : poli1.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom1.adaugare(coeficient, exponent);
                }

                for(Map.Entry<Integer,Integer> afisare : poli2.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom2.adaugare(coeficient, exponent);
                }

                Polinom rezultat = Operatii.scadere(polinom1, polinom2);

                StringBuilder rezultatString = new StringBuilder();
                for(Map.Entry<Integer,Integer> afisare : rezultat.polinom.entrySet()){
                    int coeficient = afisare.getKey();
                    int exponent = afisare.getValue();

                    if( exponent == 0 ){
                        rezultatString.append(coeficient);
                    }
                    else if( exponent == 1 ){
                        rezultatString.append(coeficient).append("*x");
                    }
                    else{
                        rezultatString.append(coeficient).append("*x^").append(exponent);
                    }
                    rezultatString.append(" + ");
                }
                rezultatString.setLength(rezultatString.length() - 3);

                rezultatField.setText(rezultatString.toString());
            }
        });
        okInmultire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p1 = txtP1.getText();
                String p2 = txtP2.getText();

                Map<Integer, Integer> poli1 = Polinom.PolynomialParser(p1);
                Map<Integer, Integer> poli2 = Polinom.PolynomialParser(p2);

                Polinom polinom1 = new Polinom();
                Polinom polinom2 = new Polinom();

                for(Map.Entry<Integer,Integer> afisare : poli1.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom1.adaugare(coeficient, exponent);
                }

                for(Map.Entry<Integer,Integer> afisare : poli2.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom2.adaugare(coeficient, exponent);
                }

                Polinom rezultat = Operatii.inmultire(polinom1, polinom2);

                StringBuilder rezultatString = new StringBuilder();
                for(Map.Entry<Integer,Integer> afisare : rezultat.polinom.entrySet()){
                    int coeficient = afisare.getKey();
                    int exponent = afisare.getValue();

                    if( exponent == 0 ){
                        rezultatString.append(coeficient);
                    }
                    else if( exponent == 1 ){
                        rezultatString.append(coeficient).append("*x");
                    }
                    else{
                        rezultatString.append(coeficient).append("*x^").append(exponent);
                    }
                    rezultatString.append(" + ");
                }
                rezultatString.setLength(rezultatString.length() - 3);

                rezultatField.setText(rezultatString.toString());
            }
        });
        okImpartire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p1 = txtP1.getText();
                String p2 = txtP2.getText();

                Map<Integer, Integer> poli1 = Polinom.PolynomialParser(p1);
                Map<Integer, Integer> poli2 = Polinom.PolynomialParser(p2);

                Polinom polinom1 = new Polinom();
                Polinom polinom2 = new Polinom();

                for(Map.Entry<Integer,Integer> afisare : poli1.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom1.adaugare(coeficient, exponent);
                }

                for(Map.Entry<Integer,Integer> afisare : poli2.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom2.adaugare(coeficient, exponent);
                }

                Polinom rezultat = Operatii.impartire(polinom1, polinom2);

                StringBuilder rezultatString = new StringBuilder();
                for(Map.Entry<Integer,Integer> afisare : rezultat.polinom.entrySet()){
                    int coeficient = afisare.getKey();
                    int exponent = afisare.getValue();

                    if( exponent == 0 ){
                        rezultatString.append(coeficient);
                    }
                    else if( exponent == 1 ){
                        rezultatString.append(coeficient).append("*x");
                    }
                    else{
                        rezultatString.append(coeficient).append("*x^").append(exponent);
                    }
                    rezultatString.append(" + ");
                }
                rezultatString.setLength(rezultatString.length() - 3);

                rezultatField.setText(rezultatString.toString());
            }
        });
        okDerivare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p1 = txtP1.getText();
                String p2 = txtP2.getText();

                Map<Integer, Integer> poli1 = Polinom.PolynomialParser(p1);
                Map<Integer, Integer> poli2 = Polinom.PolynomialParser(p2);

                Polinom polinom1 = new Polinom();
                Polinom polinom2 = new Polinom();

                for(Map.Entry<Integer,Integer> afisare : poli1.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom1.adaugare(coeficient, exponent);
                }

                for(Map.Entry<Integer,Integer> afisare : poli2.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom2.adaugare(coeficient, exponent);
                }

                Polinom deriv1 = Operatii.derivare(polinom1);
                Polinom deriv2 = Operatii.derivare(polinom2);

                StringBuilder rezultatDeriv1 = new StringBuilder();
                for(Map.Entry<Integer,Integer> afisare : deriv1.polinom.entrySet()){
                    int coeficient = afisare.getKey();
                    int exponent = afisare.getValue();

                    if( exponent == 0 ){
                        rezultatDeriv1.append(coeficient);
                    }
                    else if( exponent == 1 ){
                        rezultatDeriv1.append(coeficient).append("*x");
                    }
                    else{
                        rezultatDeriv1.append(coeficient).append("*x^").append(exponent);
                    }
                    rezultatDeriv1.append(" + ");
                }
                rezultatDeriv1.setLength(rezultatDeriv1.length() - 3);

                StringBuilder rezultatDeriv2 = new StringBuilder();
                for(Map.Entry<Integer,Integer> afisare : deriv2.polinom.entrySet()){
                    int coeficient = afisare.getKey();
                    int exponent = afisare.getValue();

                    if( exponent == 0 ){
                        rezultatDeriv2.append(coeficient);
                    }
                    else if( exponent == 1 ){
                        rezultatDeriv2.append(coeficient).append("*x");
                    }
                    else{
                        rezultatDeriv2.append(coeficient).append("*x^").append(exponent);
                    }
                    rezultatDeriv2.append(" + ");
                }
                rezultatDeriv2.setLength(rezultatDeriv2.length() - 3);

                rez1.setText(rezultatDeriv1.toString());
                rez2.setText(rezultatDeriv2.toString());
            }
        });
        okIntegrare.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String p1 = txtP1.getText();
                String p2 = txtP2.getText();

                Map<Integer, Integer> poli1 = Polinom.PolynomialParser(p1);
                Map<Integer, Integer> poli2 = Polinom.PolynomialParser(p2);

                Polinom polinom1 = new Polinom();
                Polinom polinom2 = new Polinom();

                for(Map.Entry<Integer,Integer> afisare : poli1.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom1.adaugare(coeficient, exponent);
                }

                for(Map.Entry<Integer,Integer> afisare : poli2.entrySet()){
                    int coeficient = afisare.getValue();
                    int exponent = afisare.getKey();
                    polinom2.adaugare(coeficient, exponent);
                }

                String rezultat = Operatii.integrare(polinom1);
                String rezultat2 = Operatii.integrare(polinom2);
                rez1.setText(rezultat);
                rez2.setText(rezultat2);
            }
        });
    }
    public static void main(String[] args) {
        GUI gui = new GUI() ;
        gui.setContentPane(gui.mainPanel);
        gui.setTitle("Calculator Polinoame");
        gui.setSize(400,400);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
