package Calculator;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frm extends JFrame {
    private JTextField txtFld;
    private JButton[] bttns;
    private String[] rdBttnsLbls = {
            "", "MC", "MR", "MS",
            "M+"
    };
    private String[] bttnLbls = {
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "*", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "="
    };


    private Font fnt = new Font("PxPlus IBM VGA8", Font.TRUETYPE_FONT, 20);
    private Color dfltClr = new Color(192,192,192);
    public Frm (){
        ImageIcon icon = new ImageIcon("icon.png");

        setTitle("ℭ𝔞𝔩𝔠𝔲𝔩𝔞𝔱𝔬𝔯");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(414, 375);
        setIconImage(icon.getImage());
        getContentPane().setBackground(dfltClr);
        setLayout(null);

        JPanel pnlI = new JPanel();
        pnlI.setBackground(dfltClr);
        pnlI.setBounds(0, 40, 414, 338);
        pnlI.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        pnlI.setLayout(null);

        JPanel pnlII = new JPanel();
        pnlII.setBounds(108, 150, 274, 170);
        pnlII.setLayout(new GridLayout(4, 5, 6, 6));

        JPanel pnlIII = new JPanel();
        pnlIII.setBounds(18, 103, 55, 218);
        pnlIII.setLayout(new GridLayout(5, 1, 0,6));

        JButton[] rdBttns = new JButton[5];
        rdBttns[0] = new JButton(" ");
        rdBttns[0].setBackground(dfltClr);
        rdBttns[0].setBorder(new BevelBorder(BevelBorder.LOWERED));
        pnlIII.add(rdBttns[0]);
        for (int i = 1; i < 5; i++) {
            rdBttns[i] = new JButton(rdBttnsLbls[i]);
            rdBttns[i].setBackground(dfltClr);
            rdBttns[i].setForeground(Color.RED);
            rdBttns[i].setBorder(new BevelBorder(BevelBorder.RAISED));
            //bttns[i].setFont(fnt);
            //bttns[i].addActionListener(this);
            pnlIII.add(rdBttns[i]);
        }

        bttns = new JButton[bttnLbls.length];
        for (int i = 0; i < bttnLbls.length; i++){
            bttns[i] = new JButton(bttnLbls[i]);
            bttns[i].setBackground(dfltClr);
            bttns[i].setForeground(Color.BLUE);
            bttns[i].setBorder(new BevelBorder(BevelBorder.RAISED));
            //bttns[i].setFont(fnt);
            //bttns[i].addActionListener(this);
            pnlII.add(bttns[i]);
        }

        txtFld = new JTextField();
        txtFld.setBounds(18, 18, 364, 36);
        txtFld.setFont(fnt);
        txtFld.setBorder(new BevelBorder(BevelBorder.LOWERED));

        pnlI.add(txtFld);
        add(pnlI);
        add(pnlII);
        add(pnlIII);

        setVisible(true);
    }
}