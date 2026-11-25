import java.awt.event.*;
import javax.swing.*;
//TODO: Fix error that exits out of the entire program when the JOptionPane is closed.
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
               JCheckBox task = new JCheckBox(userTask);
               ChecklistPanel.add(task);
          });
          add(ChecklistPanel);
     }  
}