package layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** @author sak5680 */
public class CalculatorFrame extends JFrame{
    private JTextField display;
    
    public CalculatorFrame(){
        display = new JTextField("");
        display.setPreferredSize(new Dimension(100,50));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        
        add(display, BorderLayout.NORTH);
        createButtonPanel();
        setSize(300, 300);
    }
    
    private void createButtonPanel(){
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));
        
        buttonPanel.add(makeDigitButton("7"));
        buttonPanel.add(makeDigitButton("8"));
        buttonPanel.add(makeDigitButton("9"));
        buttonPanel.add(makeOperatorButton("/"));
        buttonPanel.add(makeDigitButton("4"));
        buttonPanel.add(makeDigitButton("5"));
        buttonPanel.add(makeDigitButton("6"));
        buttonPanel.add(makeOperatorButton("*"));
        buttonPanel.add(makeDigitButton("1"));
        buttonPanel.add(makeDigitButton("2"));
        buttonPanel.add(makeDigitButton("3"));
        buttonPanel.add(makeOperatorButton("-"));
        buttonPanel.add(makeDigitButton("0"));
        buttonPanel.add(makeDigitButton("."));
        buttonPanel.add(makeOperatorButton("="));
        buttonPanel.add(makeOperatorButton("+"));
        
        add(buttonPanel, BorderLayout.CENTER);
    }
    
    public JButton makeDigitButton(String digit){
        JButton button = new JButton(digit);
        return button;
    }
    
    public JButton makeOperatorButton(String op){
        JButton button = new JButton(op);
        return button;
    }
}