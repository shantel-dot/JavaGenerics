package com.tts;

import java.util.ArrayList;

public class JavaLambdas {
    public void arrayStuff() {


        ArrayList<String> students = new ArrayList<>();
        students.add("Shantel");
        students.add("Betty");
        students.add("Journey");

        students.forEach(idx -> {     //System.out.println(student));
            if (idx.substring(0,3).equals("S")) {
                System.out.println(idx);
            }

        });
    }
}