package opgaven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dave
 */
public class Calculator extends JFrame {

    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton buttonPlus;
    private JButton buttonIs;
    private JButton buttonMinus;
    private JButton buttonClear;

    private JPanel panel;
    private JTextField textField;
    private String text = "";
    private int numberBefore;
    private int numberAfter;
    private int answer;

    public Calculator() {
        initComponents();
    }

    public void initComponents() {
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        buttonPlus = new JButton("+");
        buttonIs = new JButton("=");
        buttonMinus = new JButton("-");
        buttonClear = new JButton("C");

        panel = new JPanel();
        textField = new JTextField();
        button0.addActionListener(new Calculator.ClickListener0());
        button1.addActionListener(new Calculator.ClickListener());
        button2.addActionListener(new Calculator.ClickListener2());
        buttonPlus.addActionListener(new Calculator.ClickListenerPlus());
        buttonIs.addActionListener(new Calculator.ClickListenerIs());
        buttonMinus.addActionListener(new Calculator.ClickListenerMinus());
        buttonClear.addActionListener(new Calculator.ClickListenerClear());
        textField.setSize(150, 20);

        panel.setLayout(null);
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(buttonPlus);
        panel.add(buttonIs);
        panel.add(buttonMinus);
        panel.add(buttonClear);
        panel.add(textField);
        button0.setSize(50, 20);
        button0.setLocation(0, 40);
        button1.setSize(50, 20);
        button1.setLocation(0, 20);
        button2.setSize(50, 20);
        button2.setLocation(50, 20);
        buttonPlus.setSize(50, 20);
        buttonPlus.setLocation(100, 40);
        buttonIs.setSize(50, 20);
        buttonIs.setLocation(100, 60);
        buttonMinus.setSize(50, 20);
        buttonMinus.setLocation(100, 20);
        buttonClear.setSize(50, 20);
        buttonClear.setLocation(150, 20);
        this.add(panel);
        this.setSize(250, 300);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public double calculate(String input) {

        return 0;
    }

    public static void main(String[] args) {
        JFrame frame = new Calculator();
        frame.setVisible(true);
    }

    class ClickListener0 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            text += "0";
            textField.setText(text);
        }

    }

    class ClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            text += "1";
            textField.setText(text);
        }

    }

    class ClickListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            text += "2";
            textField.setText(text);
        }

    }

    class ClickListenerPlus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            text += " + ";
            textField.setText(text);
        }

    }

    class ClickListenerMinus implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            text += " - ";
            textField.setText(text);
        }

    }

    class ClickListenerIs implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Scanner scanner = new Scanner(text);
            //scanner.useDelimiter("[^\\p{Alnum},\\.-]");

            numberBefore = scanner.nextInt();
            String operator = scanner.next();
            numberAfter = scanner.nextInt();
            if (operator.equals("+")) {
               answer = numberBefore + numberAfter;
            }
            if (operator.equals("-")) {
                answer = numberBefore - numberAfter;
            }

            System.out.println(answer);
            textField.setText(answer + "");
        }

    }

    class ClickListenerClear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            text = "";
            textField.setText(text);
        }

    }

}
