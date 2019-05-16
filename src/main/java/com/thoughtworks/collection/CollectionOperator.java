package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                list.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        } else {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());

        firstList.retainAll(secondList);

        return firstList;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = new ArrayList<Integer>();
        List<Integer> secondList = new ArrayList<Integer>();

        for (int i : firstArray){
            firstList.add(i);
        }
        for (int i : secondArray){
            secondList.add(i);
        }

        secondList.removeAll(firstList);
        firstList.addAll(secondList);

        return firstList;
    }
}
