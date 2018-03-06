package com.company;

import com.company.Valuable;

import java.util.List;

public class Sum {

    public static int sum(List<Valuable> list) {
       int sum = 0;

       for(Valuable o: list)
           sum+=o.getValue();
            return sum;
    }
}



