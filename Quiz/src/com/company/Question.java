package com.company;

// 1) KLASY QUESTION
// 2) Wyświetlić liczbe punktów
// *) Zaprojektować żeby w przyszłość zmiana kodu na odczyt pliku była niebolesna.

// Pytanie
public class Question {

    // co zawiera pytanie?
    private String content;

    private boolean yesIsCorrect;

    public Question(String content, boolean yesIsCorrect) {
        this.content = content;
        this.yesIsCorrect = yesIsCorrect;
    }

    public boolean isYesIsCorrect() {
        return yesIsCorrect;
    }

    public void setYesIsCorrect(boolean yesIsCorrect) {
        this.yesIsCorrect = yesIsCorrect;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

