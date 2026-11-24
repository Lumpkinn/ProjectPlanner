import java.awt.*;
 import javax.swing.*;
public class PlanningPanel extends JWindow
{       
     //TODO: Set up a basic window for the GUI.
     private Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();


     public PlanningPanel()
     {
          setSize(250, WindowSize.width);
          //TODO: Use an ImageIcon (https://docs.oracle.com/javase/8/docs/api/javax/swing/ImageIcon.html) to add in a scrolling background (Think something like wii fits background, white, with a grey grid moving diagonally.)
          //setBackground();
          //?maybe add a custom icon?? 
          JLabel Title = new JLabel("hello");
          add(Title);
     }
     
     //TODO: Make custom frames that'll allow for users to make checklists, make simple sketch mockups for ideas, type out basic ideas, and store everything in a custom file 
     public static void main(String[] args) 
     {
          System.out.println("Hello world");   
     }


}
