/**
 *
 * @author arjend
 */
package memory;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreatePersonGui extends JDialog
    implements ActionListener {

    private JTextField id, date_of_birth;
    private JComboBox gender;
    private JLabel lbl_id, lbl_date_of_birth, lbl_gender;
    private JButton btn_submit, btn_cancel;
    private Person person;
    private StartTest frame;
    private boolean cancelled;
    private boolean success;

    public CreatePersonGui(StartTest frame, String title){
        super(frame, title);
        this.setLocationRelativeTo(null);
        this.setSize(200,300);
        this.success = false;

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        lbl_id = new JLabel("Proefpersoonnummer: ");
        window.add(lbl_id);

        id= new JTextField(10);
        window.add(id);

        lbl_date_of_birth = new JLabel("Date of birth: ");
        window.add(lbl_date_of_birth);

        date_of_birth= new JTextField(8);
        window.add(date_of_birth);

        lbl_gender = new JLabel("Gender: ");
        window.add(lbl_gender);

        gender = new JComboBox();
        gender.addItem("Male");
        gender.addItem("Female");
        window.add(gender);


        btn_submit = new JButton("Submit");
        window.add(btn_submit);
        btn_submit.addActionListener(this);

        btn_cancel = new JButton("Cancel");
        window.add(btn_cancel);
        btn_cancel.addActionListener(this);

    }

    /**
     * Handles clicks on the standard buttons.
     *
     * @param event  the event.
     */
    public void actionPerformed(final ActionEvent event) {
        final String command = event.getActionCommand();
        System.out.println(command);
        // if (command.equals("helpButton")) {
        //     // display help information
        // }
        if (command.equals("Submit")) {
            this.person = new Person("123", "dateOfBirth", 'M');
            System.out.println(this.person.getDateOfBirth());
            //createTestPerson("123", "sadf", 'M');
            this.cancelled = false;
            setVisible(false);
        }
        else if (command.equals("Cancel")) {
            this.cancelled = true;
            setVisible(false);
        }
    }

    /**
     * Returns a flag that indicates whether or not the dialog has been
     * cancelled.
     *
     * @return boolean.
     */
    public boolean isCancelled() {
        return this.cancelled;
    }

}
