/**
 *
 * @author arjend
 */
package memory;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StartTest extends JFrame 
    implements ActionListener {

    private JButton add_person_button;
    private CreatePersonGui createperson;

    public static void main(String[] args) {
        StartTest frame = new StartTest();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        add_person_button = new JButton("Add Person");
        window.add(add_person_button);
        add_person_button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        this.createperson  = new CreatePersonGui(this, "Add Person");
        this.createperson.setVisible(true);
    }
}
