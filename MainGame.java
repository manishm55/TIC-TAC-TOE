

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manish
 */
public class TICTACTOE extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TICTACTOE() {
        initComponents();

    }

    public void check() {
        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (a.equals("*") && b.equals("*") && c.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (d.equals("*") && e.equals("*") && f.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (g.equals("*") && h.equals("*") && i.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (a.equals("*") && d.equals("*") && g.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (b.equals("*") && e.equals("*") && h.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (c.equals("*") && f.equals("*") && i.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (a.equals("*") && e.equals("*") && i.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (c.equals("*") && e.equals("*") && g.equals("*")) {
            m.setText("Player 1 wins");
            y.setVisible(true);
            ms.setText(Integer.parseInt(ms.getText()) + 1 + "");
        } else if (a.equals("0") && b.equals("0") && c.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (d.equals("0") && e.equals("0") && f.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (g.equals("0") && h.equals("0") && i.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (a.equals("0") && d.equals("0") && g.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (b.equals("0") && e.equals("0") && h.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (c.equals("0") && f.equals("0") && i.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (a.equals("0") && e.equals("0") && i.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (c.equals("0") && e.equals("0") && g.equals("0")) {
            m.setText("Computer(M.Y) wins");
            y.setVisible(true);
            cs.setText(Integer.parseInt(cs.getText()) + 1 + "");
        } else if (!(a.equals("") || b.equals("") || c.equals("") || d.equals("") || e.equals("") || f.equals("") || g.equals("") || h.equals("") || i.equals(""))) {
            m.setText("Match Draw");
            y.setVisible(true);
        }

    }

    public void t1() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (a.equals("*") && i.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (a.equals("*") && e.equals("")) {
            t5.setText("0");
        } else if (a.equals("0") && b.equals("0") && c.equals("")) {
            t3.setText("0");
        } 
        else if (a.equals("*") && f.equals("*") && b.equals("")) {
            t2.setText("0");
        } 
        else if (c.equals("0") && b.equals("0") && a.equals("")) {
            t1.setText("0");
        } else if (d.equals("0") && e.equals("0") && f.equals("")) {
            t6.setText("0");
        } else if (f.equals("0") && e.equals("0") && d.equals("")) {
            t4.setText("0");
        } else if (g.equals("0") && h.equals("0") && i.equals("")) {
            t9.setText("0");
        } else if (h.equals("0") && i.equals("0") && g.equals("")) {
            t7.setText("0");
        } else if (a.equals("0") && d.equals("0") && g.equals("")) {
            t7.setText("0");
        } else if (d.equals("0") && g.equals("0") && a.equals("")) {
            t1.setText("0");
        } else if (b.equals("0") && e.equals("0") && h.equals("")) {
            t8.setText("0");
        } else if (e.equals("0") && h.equals("0") && b.equals("")) {
            t2.setText("0");
        } else if (c.equals("0") && f.equals("0") && i.equals("")) {
            t9.setText("0");
        } else if (f.equals("0") && i.equals("0") && c.equals("")) {
            t3.setText("0");
        } else if (a.equals("0") && e.equals("0") && i.equals("")) {
            t9.setText("0");
        } else if (e.equals("0") && i.equals("0") && a.equals("")) {
            t1.setText("0");
        } else if (c.equals("0") && e.equals("0") && g.equals("")) {
            t7.setText("0");
        } else if (g.equals("0") && e.equals("0") && c.equals("")) {
            t3.setText("0");
        } else if (a.equals("0") && c.equals("0") && b.equals("")) {
            t2.setText("0");
        } else if (d.equals("0") && f.equals("0") && e.equals("")) {
            t5.setText("0");
        } else if (g.equals("0") && i.equals("0") && h.equals("")) {
            t8.setText("0");
        } else if (g.equals("0") && c.equals("0") && e.equals("")) {
            t5.setText("0");
        } else if (a.equals("0") && i.equals("0") && e.equals("")) {
            t5.setText("0");
        } else if (a.equals("0") && g.equals("0") && d.equals("")) {
            t4.setText("0");
        } else if (b.equals("0") && h.equals("0") && e.equals("")) {
            t5.setText("0");
        } else if (c.equals("0") && i.equals("0") && f.equals("")) {
            t6.setText("0");
        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {
            t3.setText("0");
        } else if (c.equals("*") && b.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (d.equals("*") && e.equals("*") && f.equals("")) {
            t6.setText("0");
        } else if (f.equals("*") && e.equals("*") && d.equals("")) {
            t4.setText("0");
        } else if (g.equals("*") && h.equals("*") && i.equals("")) {
            t9.setText("0");
        } else if (h.equals("*") && i.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (a.equals("*") && d.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (d.equals("*") && g.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (b.equals("*") && e.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (e.equals("*") && h.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (c.equals("*") && f.equals("*") && i.equals("")) {
            t9.setText("0");
        } else if (f.equals("*") && i.equals("*") && c.equals("")) {
            t3.setText("0");
        } else if (a.equals("*") && e.equals("*") && i.equals("")) {
            t9.setText("0");
        } else if (e.equals("*") && i.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (c.equals("*") && e.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (g.equals("*") && e.equals("*") && c.equals("")) {
            t3.setText("0");
        } else if (a.equals("*") && c.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (d.equals("*") && f.equals("*") && e.equals("")) {
            t5.setText("0");
        } else if (g.equals("*") && i.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (g.equals("*") && c.equals("*") && e.equals("")) {
            t5.setText("0");
        } else if (a.equals("*") && i.equals("*") && e.equals("")) {
            t5.setText("0");
        } else if (a.equals("*") && g.equals("*") && d.equals("")) {
            t4.setText("0");
        } else if (b.equals("*") && h.equals("*") && e.equals("")) {
            t5.setText("0");
        } else if (c.equals("*") && i.equals("*") && f.equals("")) {
            t6.setText("0");
        } else if (a.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (a.equals("*") && c.equals("")) {
            t3.setText("0");
        } else if (a.equals("*") && i.equals("")) {
            t9.setText("0");
        } else if (a.equals("*") && e.equals("")) {
            t5.setText("0");
        } else if (a.equals("*") && f.equals("")) {
            t6.setText("0");
        } else if (a.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (a.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (a.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t2() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (b.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (b.equals("*") && f.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (b.equals("*") && e.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (b.equals("*") && i.equals("*") && c.equals("")) {
            t3.setText("0");
        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (b.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (b.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (b.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (b.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (b.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (b.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (b.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (b.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t3() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (a.equals("*") && i.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (c.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (c.equals("*") && a.equals("")) {
            t1.setText("0");

        } else if (c.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (c.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (c.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (c.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (c.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (c.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t4() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (d.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (d.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (d.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (d.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (d.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (d.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (d.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (d.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (d.equals("*") && a.equals("")) {
            t1.setText("0");
        }

    }

    public void t5() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (e.equals("*") && i.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (e.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (e.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (e.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && a.equals("")) {
            t1.setText("0");

        } else if (e.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (e.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (e.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (e.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t6() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (b.equals("*") && f.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (a.equals("*") && f.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (f.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (f.equals("*") && a.equals("")) {
            t1.setText("0");

        } else if (f.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (f.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (f.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t7() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (g.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (g.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (g.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (g.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (g.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (g.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (g.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (g.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (g.equals("*") && h.equals("")) {

            t8.setText("0");
        } else if (g.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t8() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        } else //
        //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (h.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (h.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (h.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (h.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (h.equals("*") && a.equals("")) {
            t1.setText("0");
        } else if (h.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    public void t9() {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();

        if (i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && b.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("0") && b.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("0") && e.equals("0") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("0") && e.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("0") && h.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("0") && i.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("0") && d.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("0") && g.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("0") && e.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("0") && h.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("0") && f.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("0") && i.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && e.equals("0") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("0") && i.equals("0") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("0") && e.equals("0") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("0") && e.equals("0") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("0") && c.equals("0") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("0") && f.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("0") && i.equals("0") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("0") && c.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && i.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("0") && g.equals("0") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("0") && h.equals("0") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("0") && i.equals("0") && f.equals("")) {

            t6.setText("0");

        }//
        //
        //
        else if (a.equals("*") && i.equals("*") && b.equals("")) {

            t2.setText("0");

        } else //
        if (a.equals("*") && b.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (c.equals("*") && b.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (d.equals("*") && e.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (f.equals("*") && e.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (g.equals("*") && h.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (h.equals("*") && i.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (a.equals("*") && d.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (d.equals("*") && g.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (b.equals("*") && e.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (e.equals("*") && h.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (c.equals("*") && f.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (f.equals("*") && i.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && e.equals("*") && i.equals("")) {

            t9.setText("0");

        } else if (e.equals("*") && i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (c.equals("*") && e.equals("*") && g.equals("")) {

            t7.setText("0");

        } else if (g.equals("*") && e.equals("*") && c.equals("")) {

            t3.setText("0");

        } else if (a.equals("*") && c.equals("*") && b.equals("")) {

            t2.setText("0");

        } else if (d.equals("*") && f.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (g.equals("*") && i.equals("*") && h.equals("")) {

            t8.setText("0");

        } else if (g.equals("*") && c.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && i.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (a.equals("*") && g.equals("*") && d.equals("")) {

            t4.setText("0");

        } else if (b.equals("*") && h.equals("*") && e.equals("")) {

            t5.setText("0");

        } else if (c.equals("*") && i.equals("*") && f.equals("")) {

            t6.setText("0");

        } else if (i.equals("*") && g.equals("")) {
            t7.setText("0");
        } else if (i.equals("*") && c.equals("")) {
            t3.setText("0");

        } else if (i.equals("*") && a.equals("")) {

            t1.setText("0");

        } else if (i.equals("*") && e.equals("")) {
            t5.setText("0");

        } else if (i.equals("*") && f.equals("")) {
            t6.setText("0");

        } else if (i.equals("*") && b.equals("")) {
            t2.setText("0");
        } else if (i.equals("*") && h.equals("")) {
            t8.setText("0");
        } else if (i.equals("*") && d.equals("")) {
            t4.setText("0");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        y = new javax.swing.JDialog();
        m = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cs = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();

        y.setLocation(new java.awt.Point(280, 250));
        y.setMinimumSize(new java.awt.Dimension(717, 417));

        m.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        m.setForeground(new java.awt.Color(255, 102, 102));
        m.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 8, true));

        jButton1.setText("PLAY AGAIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yLayout = new javax.swing.GroupLayout(y.getContentPane());
        y.getContentPane().setLayout(yLayout);
        yLayout.setHorizontalGroup(
            yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(yLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        yLayout.setVerticalGroup(
            yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setEditable(false);
        t1.setBackground(new java.awt.Color(0, 0, 0));
        t1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 143, 99));

        t2.setEditable(false);
        t2.setBackground(new java.awt.Color(0, 0, 0));
        t2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 143, 99));

        t3.setEditable(false);
        t3.setBackground(new java.awt.Color(0, 0, 0));
        t3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 143, 99));

        t4.setEditable(false);
        t4.setBackground(new java.awt.Color(0, 0, 0));
        t4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 143, 99));

        t5.setEditable(false);
        t5.setBackground(new java.awt.Color(0, 0, 0));
        t5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
        });
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 143, 99));

        t6.setEditable(false);
        t6.setBackground(new java.awt.Color(0, 0, 0));
        t6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t6MouseClicked(evt);
            }
        });
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 143, 99));

        t7.setEditable(false);
        t7.setBackground(new java.awt.Color(0, 0, 0));
        t7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t7.setForeground(new java.awt.Color(255, 255, 255));
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t7MouseClicked(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 143, 99));

        t8.setEditable(false);
        t8.setBackground(new java.awt.Color(0, 0, 0));
        t8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t8.setForeground(new java.awt.Color(255, 255, 255));
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t8MouseClicked(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 143, 99));

        t9.setEditable(false);
        t9.setBackground(new java.awt.Color(0, 0, 0));
        t9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        t9.setForeground(new java.awt.Color(255, 255, 255));
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t9MouseClicked(evt);
            }
        });
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 143, 99));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 521, 81));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Score.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 159, 28));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Computer's Score.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 183, 28));

        cs.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cs.setText("0");
        cs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 71, 47));

        ms.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        ms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ms.setText("0");
        ms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 71, 47));

        pack();
    }// </editor-fold>                        

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TDO add your handling code here:
        if (t1.getText().equals("")) {
            t1.setText("*");

            t1();
            check();

        }

    }                               

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        System.exit(0);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        y.dispose();
    }                                        

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:

        if (t2.getText().equals("")) {
            t2.setText("*");

            t2();
            check();
        }
    }                               

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t3.getText().equals("")) {
            t3.setText("*");

            t3();
            check();
        }
    }                               

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t4.getText().equals("")) {
            t4.setText("*");

            t4();
            check();
        }
    }                               

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t5.getText().equals("")) {
            t5.setText("*");

            t5();
            check();
        }
    }                               

    private void t6MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t6.getText().equals("")) {
            t6.setText("*");

            t6();
            check();
        }
    }                               

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t7.getText().equals("")) {

            t7.setText("*");

            t7();
            check();
        }
    }                               

    private void t8MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t8.getText().equals("")) {
            t8.setText("*");

            t8();
            check();
        }
    }                               

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {                                
        // TODO add your handling code here:
        if (t9.getText().equals("")) {
            t9.setText("*");

            t9();
            check();
        }
    }                               

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel cs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel m;
    private javax.swing.JLabel ms;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JDialog y;
    // End of variables declaration                   
}
