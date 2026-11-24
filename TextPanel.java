import java.awt.*; import java.awt.event.*;
import javax.swing.*; import javax.swing.filechooser.*; import javax.swing.text.*;
import java.util.*; import java.io.File;
public class TextPanel extends JPanel
{
     //All the widgets for the Panel
     
     //Basic setup, like the text input field, and the header for the file.
     @SuppressWarnings("FieldMayBeFinal")
     private JLabel Header = new JLabel("Notepad");
     private JScrollPane NotePad = new JScrollPane();
     //Notepad, and text color
     private JTextPane Notes = new JTextPane();
     private JColorChooser TextColor = new JColorChooser();
     
     public TextPanel()
     {    
        //JButtons for loading text, and setting color
        JButton Color = new JButton("Pick text color");
        JButton Load = new JButton("Load Text");

        //Handling text attirbutes
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Style style = Notes.addStyle("Style", null );
        StyleConstants.setCharacterAttributes(attributes, true);
        StyledDocument document = Notes.getStyledDocument();
        //Get custom font
          
          
        //For Loading text from files
        Load.addActionListener((ActionEvent e) -> 
        {
            JFileChooser Filepick = new JFileChooser();
            Filepick.addChoosableFileFilter(new FileNameExtensionFilter("Text Files","txt"));
            Filepick.showOpenDialog(null);
            File file = Filepick.getSelectedFile();
            try (Scanner reader = new Scanner(file))
            {
                String data = "";
                while (reader.hasNextLine())
                {
                    data.concat(reader.nextLine());
                }
                Notes.setText(data);
            }
             
            catch(Exception exception)
            { 
                System.out.println("An Error has occurred.");
            }
          });


        //For custom text color
        Color.addActionListener((ActionEvent e) -> 
        {
            System.out.println("Change color.");
            Color color_of_text = TextColor.getColor();
            StyleConstants.setForeground(style, color_of_text);
            try {document.insertString(document.getLength(), Notes.getText(), style);}
            catch(BadLocationException f){}
        });     
        
        
        //Buttons + Colorpicker to set the text color
        //Adding to panel/ScrollPane, and handling other things.
 
        NotePad.add(Notes);
        add(Header); add(Color); add(TextColor); add(Load); add(NotePad);
   }
}
