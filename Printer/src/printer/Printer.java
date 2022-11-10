
package printer;

import java.awt.*;
import javax.swing.*;

public class Printer extends JFrame {
    
    
    private final String[] options = {"High", "Low", "Stander"};
    private JLabel label;  //reference a label
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JRadioButton RadioButton1;  //reference a button
    private JRadioButton RadioButton2;
    private JRadioButton RadioButton3;
    private ButtonGroup RadioButtonGroup;
    private JCheckBox box1;
    private JCheckBox box2;
    private JCheckBox box3;
    private JPanel checkBoxPanel;
    private JPanel radioButtonPanel;
    private JPanel container;
    private JPanel buttonPanel;
    private JComboBox comboBox;
    private JPanel comboBoxPanel;
    private JCheckBox box4;
    
    public Printer(){
        
        setTitle("Printer");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        label = new JLabel("Printer: My Printer");
        
        add(label, BorderLayout.NORTH);
        buildCheckBox();
        add(container, BorderLayout.CENTER);
        buttonPanel();
        add(buttonPanel, BorderLayout.EAST);
        comboBoxPanel();
        add(comboBoxPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
        
    }
   
    private void buildCheckBox(){
        
        container = new JPanel();
        checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new GridLayout(3,1));
        checkBoxPanel.setBorder(BorderFactory.createTitledBorder("Type"));
        box1 = new JCheckBox("Image");
        box2 = new JCheckBox("Text");
        box3 = new JCheckBox("Code");
      
        checkBoxPanel.add(box1);
        checkBoxPanel.add(box2);
        checkBoxPanel.add(box3);
        
        radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new GridLayout(3,1));
        radioButtonPanel.setBorder(BorderFactory.createTitledBorder("Shape"));
        RadioButton1 = new JRadioButton("Selection");
        RadioButton2 = new JRadioButton("All");
        RadioButton3 = new JRadioButton("Applet");
        
        
        RadioButtonGroup = new ButtonGroup();
        RadioButtonGroup.add(RadioButton1);
        RadioButtonGroup.add(RadioButton2);
        RadioButtonGroup.add(RadioButton3);
        
        
        
        radioButtonPanel.add(RadioButton1);
        radioButtonPanel.add(RadioButton2);
        radioButtonPanel.add(RadioButton3);
        
        container.add(checkBoxPanel);
        container.add(radioButtonPanel);
    }
    
    private void buttonPanel(){
        
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,1));
        button1 = new JButton("OK");
        button2 = new JButton("Cancel");
        button3 = new JButton("Setup");
        button4 = new JButton("Help");
        
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        
        
    }
    
    private void comboBoxPanel(){
        
        comboBoxPanel = new JPanel();
        label2 = new JLabel("Print Quallity:");
        comboBox = new JComboBox(options);
        JScrollPane stylesScrollPane = new JScrollPane(comboBox);
        box4 = new JCheckBox("Pritn to File");
        
        comboBoxPanel.add(label2);
        comboBoxPanel.add(comboBox);
        comboBoxPanel.add(box4);
    }
     
    
    public static void main(String[] args) {
        new Printer();
    }
    
}
