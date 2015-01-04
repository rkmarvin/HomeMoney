package money.home;

import javax.swing.*;

/**
 * Created by marvin on 04.01.15.
 */
public class MoneyHome {
    private JPanel panel1;
    private JButton addAccountButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MoneyHome");
        frame.setContentPane(new MoneyHome().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
