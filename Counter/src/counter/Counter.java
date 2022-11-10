
package counter;

import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame{ 
    private JLabel label;//reference a label
    private JButton button;//reference a button
    private JTextField text;//reference text field
    private JPanel panel;// refrence panel
    /** 
     * constructor
     */
    public Counter(){
        setTitle("Swing Counter");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  
         
        panel = new JPanel();
        label = new JLabel("Counter");
        
        text = new JTextField(10);
        text.setText("0");
        text.setEditable(false);
        
        button = new JButton("count");
        button.addActionListener(new Count());
        
        add(panel);
        panel.add(label); 
        panel.add(text);
        panel.add(button);
        setVisible(true);
    }
    
    
    
     private class Count implements ActionListener{
         
        private int counter = 0;
         
         /** 
        The actionPerformed method executes when the user clicks on the Counter button. 
        @param e The event object. 
        */
        
        public void actionPerformed(ActionEvent e) {
            ++counter;
           String result=String.valueOf(counter);
            text.setText(result);
            
        }
        
       
    }
     
    
    /** 
    The main method creates an instance of the Counter 
    class, which causes it to display its window. 
    */
    public static void main(String[] args) {
        new Counter();
    }
    
}
