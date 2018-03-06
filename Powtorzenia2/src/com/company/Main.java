package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {

    // KROK1: pojawianie na przemian X i 0  setText("X") setText("0")
    // KROK2: Pokazanie czy wygraliśmy, koniec gry
    // KROK3: Gra z komputerem
    // KROK4: Menu i możliwość nowej gry
    // DO 5 Krzyżyków gra

    private int counter = 0;
    private List<JButton> buttons = new ArrayList<>();

    // 0 1 2
    // 3 4 5
    // 6 7 8

    public Main() {
        setTitle("Kółko i Krzyżyk");
        setSize(500, 500);
        GridLayout gridLayout = new GridLayout(3, 3);
        setLayout(gridLayout);
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("");
            button.addActionListener(this);
            buttons.add(button);
            add(button);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        // write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clikedButton = (JButton) e.getSource();
        if (counter % 2 == 0) {
            clikedButton.setText("X");
        } else {
            clikedButton.setText("0");
        }
        counter++;
        clikedButton.setEnabled(false);
        clikedButton.setBackground(Color.GREEN);
        System.out.println(isWinner());

        if(isWinner()){
            JOptionPane.showMessageDialog(null, "Wygrałeś ");       }
    }
    // 0 1 2
    // 3 4 5
    // 6 7 8
    private boolean isWinner() {
        return (isWinner(0, 1, 2) ||
                isWinner(3, 4, 5) ||
                isWinner(6, 7, 8) ||
                isWinner(0, 3, 6) ||
                isWinner(1, 4, 7) ||
                isWinner(2, 5,8)  ||
                isWinner(0, 4,8) ||
                isWinner(6, 4, 2)
       );


}

    private void isWinner(Color red) {
        isWinner(Color.GREEN);
    }

    private boolean isWinner(int i, int j, int k) {
        return buttons.get(i).getText().equals(buttons.get(j).getText()) &&
                buttons.get(j).getText().equals(buttons.get(k).getText())
                && !buttons.get(i).getText().equals("");
    }
}