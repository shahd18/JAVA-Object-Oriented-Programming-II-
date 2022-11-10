
package tempconverter;

import javax.swing.*; 

import java.awt.event.*;

public class TempConverter extends JFrame{
    
    private JLabel label;  //reference a label
    private JTextField text;  //reference text field
    private JButton button;  //reference a button
    private JPanel panel;
    /**
     * constructor
     */
    public TempConverter(){
        setTitle("C to F converter");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);      
        
        panel = new JPanel();
        label = new JLabel("Enter tempreture in Celsius");
        text = new JTextField(10);       
        button = new JButton("calculate");
        button.addActionListener(new Convert());
        
        add(panel);
        panel.add(label); 
        panel.add(text);
        panel.add(button);
        setVisible(true);
   
    }
    
    
    private class Convert implements ActionListener{
        /** 
        The actionPerformed method executes when the user clicks on the Calculate button. 
        @param e The event object. 
        */
        public void actionPerformed(ActionEvent e) {
            
            double celsius = Double.parseDouble(text.getText());
            double fahrenheit =((9* celsius)/5)+32;
            
            JOptionPane.showMessageDialog(null, "The tempreture in fahrenheit = " + fahrenheit);
            
        }
        
    }
    
    
    
    
    /** 
    The main method creates an instance of the TempConverter 
    class, which causes it to display its window. 
    */
    public static void main(String[] args) {
        new TempConverter();
    }

    
    
}
