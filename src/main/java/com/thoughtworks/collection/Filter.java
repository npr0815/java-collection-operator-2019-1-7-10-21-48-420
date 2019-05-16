package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : array) {
            if ((i % 2 == 0)) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : array) {
            if ((i % 3 == 0)) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> first = new ArrayList<Integer>();
        List<Integer> second = new ArrayList<Integer>();

        for (int i : firstList){
            first.add(i);
        }
        for (int i : secondList){
            second.add(i);
        }

        first.retainAll(second);

        return first;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(array);
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(set);

        return list;
    }
}