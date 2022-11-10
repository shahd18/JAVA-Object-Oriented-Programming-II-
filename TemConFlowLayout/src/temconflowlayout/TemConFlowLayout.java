
package temconflowlayout;
import javax.swing.*; // Needed for Swing classes
import java.awt.*; // Needed for BorderLayout class
import java.awt.event.*;


public class TemConFlowLayout extends JFrame {

    private final int WINDOW_WIDTH = 250; // Window width
    private final int WINDOW_HEIGHT = 190; // Window height  
    private JRadioButton CButton ;
    private JRadioButton FButton ;
    private ButtonGroup group;
    private JButton button ;
    private JTextField text ;
    private JTextField text2 ;
 /**
 Constructor
 */

    public TemConFlowLayout()
    {
        // Set the title bar text.
         setTitle("Flow Layout");

         // Set the size of the window.
         setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        setLayout(new FlowLayout());

        // Create four panels.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        JLabel label = new JLabel("Celsius");
        text = new JTextField(10);
        
        JLabel label2 = new JLabel("Fahrenheit");
        text2 = new JTextField(10);
        
        CButton = new JRadioButton("Celsius");
        FButton = new JRadioButton("Fahrenheit");
        group = new ButtonGroup();
        group.add(CButton);
        group.add(FButton);
        
        button = new JButton("calculate");
        button.addActionListener(new RadioButtonListener());
        
        // Add the buttons to the panels.
        panel1.add(label);
        panel1.add(text);
        
        panel2.add(label2);
        panel2.add(text2);
        
        panel3.add(CButton);
        panel3.add(FButton);
        
        panel4.add(button);     

       // Add the five panels to the content pane.
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        
        // Center the frame 
        setLocationRelativeTo(null); 
        
        // Display the window.
        setVisible(true);
        
    }
    
    private class RadioButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            double temp;
        
            if(FButton.isSelected()){
                temp = Double.parseDouble(text.getText());
                double result = ((9* temp)/5)+32;//c to f
                JOptionPane.showMessageDialog(null, "answer= "+result);
            }
            else if(CButton.isSelected()){
                temp = Double.parseDouble(text2.getText());
                double result = ((temp-32)*5)/9;
                JOptionPane.showMessageDialog(null, "answer= "+result);
            }
            
        }
            
   }
    
  
    
    public static void main(String[] args) {
        new TemConFlowLayout();
    }
    
}
