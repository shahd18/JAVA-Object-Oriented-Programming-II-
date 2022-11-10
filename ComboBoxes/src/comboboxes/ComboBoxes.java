
package comboboxes;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxes extends JFrame{

    private final String[] styles = {"Regular Shades", "Folding Shades", "Roman Shades"};
    private final String[] size = {"25 Inches Wide", "27 Inches Wide","32 Inches Wide"};
    private JLabel banner;
    private JLabel label;
    private JPanel bannerPanel;
    private JPanel stylesPanel;
    private JPanel sizePanel;
    private JPanel container;
    private JPanel selectedPanel;
    private JTextField selected; 
    private JComboBox stylesList;
    private JComboBox sizeList;
    private double totalCharges = 50.00;
    private final double foldingCost = 10.00;
    private final double romanCost = 15.00;
    private final double twentySevenInCost = 2.00;
    private final double thirtyTwoInCost = 4.00;

public ComboBoxes()
{
    setTitle("Windos Shade Designer");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    buildBannerPanel();
    add(bannerPanel, BorderLayout.NORTH);
    stylesPanel();
    add(container, BorderLayout.CENTER);
    buttonPanel();
    add(selectedPanel, BorderLayout.SOUTH);
    setLocationRelativeTo(null);
    setSize(400, 200);
    setVisible(true);
}
private void buildBannerPanel()
{
    bannerPanel = new JPanel();
    bannerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    banner = new JLabel("Welcome to Window Shade Designer");
    bannerPanel.add(banner);
}

    private void stylesPanel()
    {
    container=new JPanel();
    stylesPanel = new JPanel();
    stylesList = new JComboBox (styles);
    JScrollPane stylesScrollPane = new JScrollPane(stylesList);
    stylesPanel.add(stylesScrollPane);
    sizePanel=new JPanel();
    sizeList = new JComboBox (size);
    JScrollPane sizeScrollPane = new JScrollPane(sizeList);
    sizeList.addActionListener( new ComboBoxListener());
    sizePanel.add(sizeScrollPane);
    container.add(stylesPanel);
    container.add(sizePanel);
    }
 private void buttonPanel()
    {
       selectedPanel = new JPanel();
        label = new JLabel("You selected: ");
        selected = new JTextField(10);
        selected.setEditable(false);
        selectedPanel.add(label);
        selectedPanel.add(selected);
    }

    private class ComboBoxListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            int  style =stylesList.getSelectedIndex();
            int size =  sizeList.getSelectedIndex();
             
            if (style==0){
                totalCharges = 50.0;
                if(size==1){
                     totalCharges+=twentySevenInCost;
                }else if(size==2){
                     totalCharges+=thirtyTwoInCost;
               }
            }
            if (style==1){
                totalCharges = 50.0;
                totalCharges+=foldingCost;
                
                if(size==1){
                     totalCharges+=twentySevenInCost;
                }else if(size==2){
                     totalCharges+=thirtyTwoInCost;
               }
            }
            else if(style==2){
                totalCharges = 50.0;
                totalCharges+=romanCost;
                if(size==1){
                    totalCharges+=twentySevenInCost;
                }else if(size==2){
                   totalCharges+=thirtyTwoInCost;
               }
            }
            
            String result=String.valueOf(totalCharges);
            selected.setText(result);
        }
}

    public static void main(String[] args) {
       new ComboBoxes();
    }
    
}
