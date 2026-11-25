import java.awt.*;
 import javax.swing.*;
public class PlanningPanel extends JWindow
{       
     //TODO: Set up a basic window for the GUI.
     final private Dimension WindowSize = Toolkit.getDefaultToolkit().getScreenSize();


     public PlanningPanel()
     {
          
          //Basic setup for the window, like the size, background, and it's title.
          //setSize(450, WindowSize.width);
          setAlwaysOnTop(true);
          //! Issue with layout manager! setLayout(new BoxLayout(rootPane, BoxLayout.PAGE_AXIS));
          //TODO: Use an ImageIcon (https://docs.oracle.com/javase/8/docs/api/javax/swing/ImageIcon.html) to add in a scrolling background (Think something like wii fits background, white, with a grey grid moving diagonally.)
          //setBackground();
          //?maybe add a custom icon?? 
          JLabel Title = new JLabel("Project Planner");
          add(Title);
          
          //adding each of the custom panels.
          Checklist todolist = new Checklist();
          SketchPad sketches = new SketchPad();
          TextPanel notes = new TextPanel();
          add(notes);
          //add(sketches);
          //add(todolist);          
     }
     
     //TODO: Make custom frames that'll allow for users to make checklists, make simple sketch mockups for ideas, type out basic ideas, and store everything in a custom file 
     public static void main(String[] args) 
     {
          PlanningPanel test = new PlanningPanel(); 
          test.setVisible(true);
     }


}
