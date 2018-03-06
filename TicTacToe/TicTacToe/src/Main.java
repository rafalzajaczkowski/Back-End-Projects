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
    private List<Fields> fields = new ArrayList<>();

    // 0 1 2
    // 3 4 5
    // 6 7 8

    public Main() {
        setFields();
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
        if ( isWinner()) {
            Fields fields = getWinnerFields();
            buttons.get(fields.getX()).setBackground(Color.GREEN);
            buttons.get(fields.getX()).setOpaque(true);
            buttons.get(fields.getY()).setBackground(Color.GREEN);
            buttons.get(fields.getY()).setOpaque(true);
            buttons.get(fields.getZ()).setBackground(Color.GREEN);
            buttons.get(fields.getZ()).setOpaque(true);
            System.out.println("KONIEC GRY");
            setAllDisable();
            JOptionPane.showMessageDialog(null, "Koniec gry!");

        }

    }
    // 0 1 2
    // 3 4 5
    // 6 7 8


    private void setFields(){
        fields.add(new Fields(0,1,2));
        fields.add(new Fields(3,4,5));
        fields.add(new Fields(6,7,8));
        fields.add(new Fields(0,3,6));
        fields.add(new Fields(1,4,7));
        fields.add(new Fields(2,5,8));
        fields.add(new Fields(0,4,8));
        fields.add(new Fields(6,4,2));
    }

    private void setAllDisable(){
        for (JButton button: buttons){
            button.setEnabled(false);
        }
    }

    private boolean isWinner() {
        for (Fields field:fields){
            if ( isWinner(field.getX(),field.getY(),field.getZ())){
                return true;
            }
        }
        return false;
    }

    public Fields getWinnerFields(){
        for (Fields field:fields){
            if ( isWinner(field.getX(),field.getY(),field.getZ())){
                return field;
            }
        }
        return null;
    }


    private boolean isWinner(int i, int j, int k) {
        return buttons.get(i).getText().equals(buttons.get(j).getText()) &&
                buttons.get(j).getText().equals(buttons.get(k).getText())
                && !buttons.get(i).getText().equals("");
    }
}
