/**
 *
 * @author arjend
 */
package layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartTest extends JFrame
    implements ActionListener {

    private JButton btn_face, btn_number;

    public StartTest(Start frame, String title){

        this.setLocationRelativeTo(null);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setBounds(0,0,screenSize.width, screenSize.height);
        this.setSize(170,250);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        btn_face = new JButton("Face recognition");
        window.add(btn_face);
        btn_face.addActionListener(this);

        btn_number = new JButton("Numbers test");
        window.add(btn_number);
        btn_face.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){
        final String command = event.getActionCommand();
    }
}

