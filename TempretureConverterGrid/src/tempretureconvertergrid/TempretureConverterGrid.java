
package tempretureconvertergrid;

import java.awt.*;
import javax.swing.*;



public class TempretureConverterGrid extends JFrame{

    private JLabel label;  //reference a label
    private JLabel label2;
    private JTextField text;  //reference text field
    private JTextField text2;
    private JButton button;
    private JRadioButton CButton;  //reference a button
    private JRadioButton FButton;
    private ButtonGroup RadioButtonGroup;
    private JPanel panel;
    
    
    /**
     * constructor
     */
    public TempretureConverterGrid(){
        setTitle("Temperatuer Converter");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4,2));
        buildPanel();
        
    
    }
    
    private void buildPanel(){
         label = new JLabel("Celsius");
        text = new JTextField(10);
        label2 = new JLabel("Fahrenheit");
        text2 = new JTextField(10);
       CButton = new JRadioButton("Celsius");
       FButton = new JRadioButton("Fahrenheit");
        button = new JButton("Calculate");
        
       RadioButtonGroup = new ButtonGroup();
       RadioButtonGroup.add(CButton);
       RadioButtonGroup.add(FButton);
       
       // create eight panels
       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       JPanel panel3 = new JPanel();
       JPanel panel4 = new JPanel();
       JPanel panel5 = new JPanel();
       JPanel panel6 = new JPanel();
       JPanel panel7 = new JPanel();
       JPanel panel8 = new JPanel();
       
       
       
       panel1.add(label); //add label to panel 1
       panel2.add(text); //add text to panel 2
       panel3.add(label2); //add label to panel 3
       panel4.add(text2); //add text to panel 4
       panel5.add(CButton); //add Celsius radio button to panel 5
       panel6.add(FButton); //add Fahrenheit radio button to panel 6
       panel8.add(button); //add Calculate button to panel 8
       
       
       add(panel1);
       add(panel2);
       add(panel3);
       add(panel4);
       add(panel5);
       add(panel6);
       add(panel7);
       add(panel8);
       
       pack();
       setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       new TempretureConverterGrid();
    }
    
}
