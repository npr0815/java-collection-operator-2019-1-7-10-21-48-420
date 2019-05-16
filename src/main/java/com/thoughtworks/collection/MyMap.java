package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> list = new ArrayList<>();

        for (int i : array){
            list.add(i*3);
        }

        return list;
    }

    public List<String> mapLetter() {
        List<String> list = new ArrayList<>();

        for (int i : array){
            int num = i + 96;
            char c = (char)num;
            list.add(Character.toString(c));
        }

        return list;
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<>();

        for (int i : array){
            if (i < 27){
                int num = i + 96;
                char c = (char)num;
                list.add(Character.toString(c));
            } else if (i > 27 && i % 26 == 0){
                int n = i / 26 - 1 + 96;
                int num = i % 26 + 26 + 96;
                char c = (char)n;
                char ch = (char)num;
                list.add(""+c+ch);
            } else {
                int n = i / 26 + 96;
                int num = i % 26 + 96;
                char c = (char)n;
                char ch = (char)num;
                list.add(""+c+ch);
            }
        }

        return list;
    }

    public List<Integer> sortFromBig() {
        Collections.reverse(array);

        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);

        return array;
    }
}
