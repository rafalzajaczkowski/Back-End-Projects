package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame implements ActionListener {
    //List<String> strings = List.of("foo", "bar", "baz");


    private JButton yesButton;
    private JButton noButton;
    private JLabel questionLabel;
    private List<Question> questions = new ArrayList<>();
    private QuestionGenerator questionGenerator;

    public Main() {
        setDefaultFrameView();
        addComponentsToFrame();
    }

    public void setQuestionGenerator (QuestionGenerator questionGenerator){
        this.questionGenerator = questionGenerator;
        this.questions = questionGenerator.generate();
    }

    public Main(QuestionGenerator questionGenerator){
        setQuestionGenerator(questionGenerator);
        setDefaultFrameView();
        addComponentsToFrame();
    }

    private void setDefaultFrameView() {
        setTitle("Milionerzy");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
    }

    private void addComponentsToFrame() {
        yesButton = new JButton("TAK");
        yesButton.addActionListener(this);
        questionLabel = new JLabel(questions.get(0).getContent(), SwingConstants.CENTER);
        questionLabel.setForeground(Color.blue);
        noButton = new JButton("NIE");
        noButton.addActionListener(this);
        add(questionLabel);
        add(yesButton);
        add(noButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main m = new Main(new SimpleQuestionGenerator()); // ActionLister = m
                //  Main m2 = new Main(); //ActionListener = m2
            }
        });
    }

    private int counter = 0;
    private int numberOfPoints = 0;


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clikedButton = (JButton) e.getSource(); // polimorfizm JButton jest takze Objectem
        counter++;
        if (counter == questions.size()) {
            yesButton.setEnabled(false);
            noButton.setEnabled(false);
        } else {
            questionLabel.setText(questions.get(counter).getContent());
        }
    }
}





