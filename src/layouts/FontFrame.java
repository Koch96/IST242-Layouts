package layouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/** @author sak5680 */
public class FontFrame extends JFrame{
    private JRadioButton smallButton, mediumButton, largeButton;
    private JLabel label;
    
    public FontFrame(){
        label = new JLabel("Big Java");
        add(label, BorderLayout.CENTER);
        
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,1));
        controlPanel.setBorder(new TitledBorder(new EtchedBorder(), "Control Panel"));
        
        smallButton = new JRadioButton("Small");
        smallButton.setSelected(true);
        mediumButton = new JRadioButton("Medium");
        largeButton = new JRadioButton("Large");
        
        ButtonGroup group = new ButtonGroup();
        group.add(smallButton);
        group.add(mediumButton);
        group.add(largeButton);
        
        ActionListener listener = new ChoiceListener();
        smallButton.addActionListener(listener);
        mediumButton.addActionListener(listener);
        largeButton.addActionListener(listener);
        
        JPanel sizePanel = new JPanel();
        sizePanel.setBorder(new TitledBorder("Size"));
        sizePanel.add(smallButton);
        sizePanel.add(mediumButton);
        sizePanel.add(largeButton);
        
        controlPanel.add(sizePanel);
        
       
                
        add(controlPanel, BorderLayout.SOUTH);
        setSize(300,400);
    }
    
    class ChoiceListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            setLabelFont();
        }
    }
    
    public void setLabelFont(){
        String facename = "Tahoma";
        int style = 0;
        int size = 24;
        
        if(smallButton.isSelected()) size = 24;
        else if (mediumButton.isSelected()) size = 36;
        else if (largeButton.isSelected()) size = 48;
        
        label.setFont(new Font(facename, style, size));
        label.repaint();
    }
}
