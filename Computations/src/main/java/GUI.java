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
    private JTextField restTextField;
    private JLabel restImp;

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

                Operatii polioname = new Operatii(polinom1,polinom2);
                Polinom rezultat = polioname.adunare();

                rezultatField.setText(rezultat.toString());
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

                Operatii polioname = new Operatii(polinom1,polinom2);
                Polinom rezultat = polioname.scadere();

                rezultatField.setText(rezultat.toString());
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

                Operatii polioname = new Operatii(polinom1,polinom2);
                Polinom rezultat = polioname.inmultire();

                rezultatField.setText(rezultat.toString());
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

                Operatii polioname = new Operatii(polinom1,polinom2);
                Polinom rezultat = polioname.impartire();

                Polinom restRezultat = polioname.restImpartire() ;

                restTextField.setText(restRezultat.toString());
                rezultatField.setText(rezultat.toString());
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

                String rezultat = Operatii.derivare(polinom1);
                String rezultat2 = Operatii.derivare(polinom2);
                rez1.setText(rezultat);
                rez2.setText(rezultat2);
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
