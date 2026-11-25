import java.awt.*; import java.awt.event.*;
import java.io.*; import javax.swing.*;

public class SketchPad extends JPanel
{
     //Panel for the drawing, color picker 
     //?Maybe add in some other tools?
     //TODO: Make the basic drawing application, and keep it inside of the JPanel
     public SketchPad()
     {
          setOpaque(false);
          addMouseMotionListener(new MouseMotionAdapter()
                    {
               @Override 
               public void mouseMoved(MouseEvent e)
               {
                    repaint();
               }
          });
     }
     //Handles the pencil
     //TODO: Add in a eraser too!
     @Override 
     protected void paintComponent(Graphics g)
     {
          //Brush size
          //?If i have time, do I wanna let the user change the brush size with a slider?
          @SuppressWarnings("unused")
          int radius = 10;
          super.paintComponent(g);
          int xpos = MouseInfo.getPointerInfo().getLocation().x - getLocationOnScreen().x;
          int ypos = MouseInfo.getPointerInfo().getLocation().x - getLocationOnScreen().x;
          g.setColor(Color.black);
     }
     
     
}