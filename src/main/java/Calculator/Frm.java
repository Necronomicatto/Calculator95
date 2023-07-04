package Calculator;

import javax.swing.*;
import java.awt.*;
public class Frm extends JFrame {
    private JTextField txtFld;
    private JButton[] bttns;
    private String[] bttnLbls = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
    };
    public Frm (){
        ImageIcon icon = new ImageIcon("icon.png");

        this.setVisible(true);
        this.setTitle("ℭ𝔞𝔩𝔠𝔲𝔩𝔞𝔱𝔬𝔯");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(414, 408);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(192,192,192 ));
    }
}
