
package view;
import controller.FrameActionListener;

public class MainForm extends javax.swing.JFrame {
    FrameActionListener frameActionListener = null;

    public MainForm() {
        frameActionListener = new FrameActionListener(this);
        initComponents();

    }


}
