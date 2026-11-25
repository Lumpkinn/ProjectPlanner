import javax.swing.*;

public class Checklist extends JPanel
{
     //TODO: Make a JTable, a JTextField, and a JCheckBox, so the user can make a little todo list.
     public Checklist()
     {
          //Header for the todo list.
          JLabel todo = new JLabel("TO DO list:");
          add(todo);

          JButton newTask = new JButton("Add a new task!");
          newTask.addActionListener((ActionEvent e) -> 
          {
               String (userTask) = JOptionPane.showInputDialog("What task would you like to add?",null);

               
          });

     }  
}