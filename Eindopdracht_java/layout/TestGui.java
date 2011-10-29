/**
 *
 * @author arjend
 */
package layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestGui extends JFrame
    implements ActionListener {

    public TestGui(Start frame, String title){
        this.setLocationRelativeTo(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(0,0,screenSize.width, screenSize.height);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
