package money.home;

import com.sun.istack.internal.NotNull;
import money.dao.Accounts;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by marvin on 04.01.15.
 */
public class MoneyHome {
    private JPanel basePanel;
    private JButton addAccountButton;
    private JList accountDetailList;
    private JList accountsList;

    public MoneyHome() {
        addAccountButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                Accounts account = new Accounts("Test", new Random().nextFloat());
                accountsList.
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MoneyHome");
        frame.setContentPane(new MoneyHome().basePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
