package opgaven;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bert-
 */
public class Rekenmachine extends JFrame {

    private static int antwoord = 0;
    String operatie = "";
    JButton getal1;
    JButton getal2;
    JButton plus;
    JButton min;
    JButton is;
    JButton reset;
    JFrame frame;
    JPanel panel;
    JTextField text;

    public Rekenmachine() {
        initComponents();
    }

    public static void main(String[] args) {
        JFrame frame = new Rekenmachine();

        frame.setVisible(true);

    }

    private void initComponents() {
        plus = new JButton("+");
        min = new JButton("-");
        getal1 = new JButton("1");
        getal2 = new JButton("2");
        is = new JButton("=");
        reset = new JButton("Restet");

        getal1.addActionListener(new CLickListnergetal1());
        getal2.addActionListener(new CLickListnergetal2());
        min.addActionListener(new CLickListnerMin());
        plus.addActionListener(new CLickListnerPlus());
        is.addActionListener(new CLickListnerAntwoord());
        reset.addActionListener(new CLickListnerReset());

        text = new JTextField();
        text.setSize(200, 40);
        text.setText("              ");
        panel = new JPanel();
        //panel.setLayout(null);

        panel.add(getal1);
        panel.add(getal2);
        panel.add(min);
        panel.add(plus);
        panel.add(is);
        panel.add(reset);
        panel.add(text);
        text.setLocation(200, 100);
        text.setSize(100, 20);
        this.add(panel);

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 300;
        final int WIDTH = 200;
        final int HEIGHT = 300;
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Rekenmachine");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reset.setBackground(Color.YELLOW);
        min.setBackground(Color.RED);
        plus.setBackground(Color.GREEN);
        panel.setBackground(Color.BLACK);

    }

    private void doeOperatie() {
        int tweedeGetal = Integer.parseInt(text.getText().trim());
        switch (operatie) {
            case "plus":
            case "+":
                antwoord += tweedeGetal;
                text.setText(antwoord + "");
                break;
            case "-":
                antwoord -= tweedeGetal;
                text.setText(antwoord + "");
            default:
        }
    }
    
    private void operatie(String operator) {
        doeOperatie();
        //antwoord = Integer.parseInt(text.getText().trim());
        operatie = operator;
        text.setText("");
    }

    class CLickListnergetal1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String bestaandeText = text.getText();
            text.setText(bestaandeText + "1");
        }

    }

    class CLickListnergetal2 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String bestaandeText = text.getText();
            text.setText(bestaandeText + "2");

        }

    }

    class CLickListnerMin implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            operatie("-");
        }

    }

    class CLickListnerPlus implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            operatie("+");
        }

    }

    class CLickListnerAntwoord implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            doeOperatie();
        }

    }

    class CLickListnerReset implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            text.setText("");
            antwoord = 0;

        }

    }

}
