
package fevseasoncombobox;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class FevSeasonComboBox extends JFrame{



   private JPanel seasonPanel; 
    private JPanel selectedSeasonPanel; 
    private JList seasonList; 
    private JScrollPane scrollPane; 
    private JTextField selectedSeason; 
    private JLabel label; 
    private JLabel label2; 
    private String[] season = { "Summer","winter","autumn","spring" };
    public FevSeasonComboBox()
    {
        
        setTitle("Favouirte Season");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildSeasonPanel();
        buildSelectedSeasonPanel();
        add(label2, BorderLayout.NORTH);
        add(seasonPanel, BorderLayout.CENTER);
        add(selectedSeasonPanel, BorderLayout.SOUTH);
        pack();
        setSize(250,150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void buildSeasonPanel()
    {
        seasonPanel = new JPanel();
        label2 = new JLabel("Please select your favouirte season: ");
        seasonList = new JList(season);
        seasonList.setSelectionMode(
        ListSelectionModel.SINGLE_SELECTION);
        seasonList.addListSelectionListener( new ListListener());
        seasonList.setVisibleRowCount(3);
        scrollPane = new JScrollPane(seasonList);
         seasonPanel.add(label2);
        seasonPanel.add(scrollPane);
    }
    
    private void buildSelectedSeasonPanel()
    {
      
        selectedSeasonPanel = new JPanel();
        label = new JLabel("You selected: ");
        selectedSeason = new JTextField(10);
        selectedSeason.setEditable(false);
        selectedSeasonPanel.add(label);
        selectedSeasonPanel.add(selectedSeason);
    }
    private class ListListener implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            
            String selection = (String) seasonList.getSelectedValue();
           
            selectedSeason.setText(selection);
        }
    
    
   
   
    }
    public static void main(String[] args)
    {
    new FevSeasonComboBox();
    }
    
}
