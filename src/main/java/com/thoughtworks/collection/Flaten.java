package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        int len = 0, index = 0;
        for (Integer[] i : array){
            len += i.length;
        }
        Integer[] arr = new Integer[len];

        for (Integer[] i : array) {
            for (int j : i) {
                arr[index++] = j;
            }
        }

        List<Integer> list = Arrays.asList(arr);

        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        int len = 0, index = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer[] i : array){
            len += i.length;
        }
        Integer[] arr = new Integer[len];

        for (Integer[] i : array) {
            for (int j : i) {
                arr[index++] = j;
            }
        }

        for (int i : arr){
            if (!list.contains(i)){
                list.add(i);
            }
        }

        return list;
    }
}
