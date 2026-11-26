import java.awt.event.*;
import javax.swing.*;
//TODO: Get Checkboxes to show up properly!
public class Checklist extends JPanel
{

     public Checklist()
     {
          JPanel ChecklistPanel = new JPanel();
          ChecklistPanel.setLayout(new BoxLayout(ChecklistPanel, BoxLayout.PAGE_AXIS));
          //Header for the todo list.
          JLabel todo = new JLabel("TO DO list:");
          ChecklistPanel.add(todo);

          JButton newTask = new JButton("Add a new task!");
          ChecklistPanel.add(newTask);
          
          newTask.addActionListener((ActionEvent e) -> 
          {
               String userTask = JOptionPane.showInputDialog("What task would you like to add?",null);
               if (userTask != null)
               {
                    JCheckBox task = new JCheckBox(userTask);
                    ChecklistPanel.add(task);
                    System.out.println(userTask);
                    ChecklistPanel.revalidate();
                    ChecklistPanel.repaint();
               }
          });

          add(ChecklistPanel);
     }  
}