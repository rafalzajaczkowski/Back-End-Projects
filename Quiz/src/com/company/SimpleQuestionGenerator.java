package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleQuestionGenerator implements QuestionGenerator {

    @Override
    public List<Question> generate() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Czy Polska leży w Europie?",true));
        questions.add(new Question("Czy Dania jest w U.S.A?",false));
        questions.add(new Question("Czy kot ma długi ogon?",true));
        questions.add(new Question("Czy eukaliptus to samochód?",false));
        questions.add(new Question("Czy java to motocykl?",false));
        return questions;
    }
}


