/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgaven;

import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author j
 */
public class MyFrame extends JFrame {
    JButton button;
    JPanel panel;
    JTextField text;
    
    public MyFrame() {
        initComponents();
    }
    
    private void initComponents() {
        button = new JButton("Click me");
        button.addActionListener(new ClickListener());
        text = new JTextField();
        text.setSize(100, 20);
        text.setText("aap");
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(button);
        panel.add(text);
        button.setSize(50, 20);
        button.setLocation(100, 100);
        text.setLocation(100, 20);
        this.add(panel);
        this.setTitle("titel");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        frame.setVisible(true);
    }
    
    class ClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.setText("I was clicked!");
        }
    }
    
}
