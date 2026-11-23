import java.awt.event.ActionListener;

import javax.swing.*;

public class TextPanel extends JPanel
{
     //All the widgets for the Panel
     
     //Basic setup, like the text input field, and the header for the file.
     private JLabel Header = new JLabel("Notepad");
     private JScrollPane NotePad = new JScrollPane();
     //Notepad, and text color
     private JTextPane Notes = new JTextArea("Add your ideas here!");
     private JColorChooser TextColor = new JColorChooser();
     
     public TextPanel()
     {    
          //JButtons for loading text, and setting color
          JButton Color = new JButton("Pick text color");
          JButton Load = new JButton("Load Text");
          
          //Get custom font
          Notes.setLineWrap(true);
          
          //For Loading text
          Load.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    final JFileChooser Filepick = new JFileChooser();
                    //!Make sure that this works, and only allows the user to select .txt files!
                    JFileChooser.FILE_FILTER_CHANGED_PROPERTY = "txt";
               }
          });


          //For custom text color
          Color.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    System.out.println("Change color.");
               }
          });     
          //Buttons + Colorpicker to set the text color

          //Adding to panel/ScrollPane, and handling other things.
          NotePad.add(Notes);
          add(Header); add(Color); add(TextColor); add(Load); add(NotePad);
     }


}