import java.awt.*; import java.awt.event.*;
import javax.swing.*; import javax.swing.filechooser.*; import javax.swing.text.*;
import java.util.*; import java.io.File;
public class TextPanel extends JPanel
{   
private static Color color_of_text = (Color.black);
    //TODO: put the colorchooser in its own class, its too big for the window
    public TextPanel()
    {
        //Basic setup, like the text input field, and the label for the widget
        JLabel Header = new JLabel("Notepad");
        
        
        //Notepad, and text color
        JTextArea Notes = new JTextArea("Add text here!");
        Notes.setEditable(true);
        //!THE JSCROLLPANE DOESN'T SUPPORT TEXT COLOR!!!
        JScrollPane NotePad = new JScrollPane(Notes); 
        
        //JButtons for loading text, and setting color
        JButton Color = new JButton("Pick text color");
        JButton Load = new JButton("Load Text");
        
        //Adding all of the basic elements to the widget.
        add(Header);
        add(Color);
        add(Load); 
        add(NotePad);
        

        //? This handles the colored text. Currently, It's not functional, so I'm commenting it out for now to see if theres anything I can do about it.
        //? Make sure to take another look at this later too, I do still want to add this feature. 
        /*Handling text attributes
        NotePad.add(Notes);
        Style style = Notes.addStyle("Style", null);
        //! Null pointer exception -> StyleConstants.setForeground(style, null);
        StyledDocument document = Notes.getStyledDocument();
        Get custom font
        */
          
        //For loading text from files
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
            //This code block makes a new window, and show the colorpanel inside of it to let the user pick whatever they want...
            JFrame ColorWindow = new JFrame("Pick a color");
            ColorWindow.setUndecorated(false);
            ColorWindow.setResizable(false);
            
            //Creating and adding the elements.
            JLabel Title = new JLabel("Pick your color!");
            JColorChooser TextColor = new JColorChooser();
            ColorWindow.add(Title);
            ColorWindow.add(TextColor); 
            
            //Stores the new color for outside use!
            TextPanel.color_of_text = TextColor.getColor();

            //Final touches on the window
            ColorWindow.setLocation(300, 100);
            ColorWindow.pack();
            ColorWindow.setVisible(true);

            //*This code is supposed to set the texts color! (Commented out for now, will revisit later.) 
            //StyleConstants.setForeground(style, color_of_text);
            //try {document.insertString(document.getLength(), Notes.getText(), style);}
            //catch(BadLocationException f){}
        });     
        
        
        //Buttons + Colorpicker to set the text color
        //Adding to panel/ScrollPane, and handling other things.
 
        
        
   }
}
