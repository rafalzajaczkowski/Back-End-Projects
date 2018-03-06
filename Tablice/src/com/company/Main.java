package com.company;

public class Main {

    public static void main(String[] args) {
        String[] friends = new String[10];
        friends[0] = "Aldonka";
        friends[1] = "Naomi";
        friends[2] = "Pamelka";

        System.out.println(friends[0]);
        System.out.println(friends [1]);
        System.out.println(friends.length);

        for (String name:friends){
            System.out.println(name);
        }
    }
}
