package software.ulpgc.kata7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Counter App");
            frame.setSize(800,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JLabel counterLabel = new JLabel("0", JLabel.CENTER);
            counterLabel.setFont(new Font("Arial", Font.PLAIN,40));

            JButton incrementButton = new JButton("+");
            JButton decrementButton = new JButton("-");

            incrementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int currentValue = Integer.parseInt(counterLabel.getText());
                    counterLabel.setText(String.valueOf(currentValue+1));
                }
            });

            decrementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int currentValue = Integer.parseInt(counterLabel.getText());
                    counterLabel.setText(String.valueOf(currentValue-1));
                }
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(1, 2));
            buttonPanel.add(incrementButton);
            buttonPanel.add(decrementButton);

            frame.add(counterLabel, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });
    }
}
