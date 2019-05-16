package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder < rightBorder){
            for(int i=leftBorder; i<=rightBorder; i++){
                if(i % 2 == 0){
                    sum += i;
                }
            }
        }else{
            for(int i=rightBorder; i<=leftBorder; i++){
                if(i % 2 == 0){
                    sum += i;
                }
            }
        }

        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder < rightBorder){
            for(int i=leftBorder; i<=rightBorder; i++){
                if(i % 2 != 0){
                    sum += i;
                }
            }
        }else{
            for(int i=rightBorder; i<=leftBorder; i++){
                if(i % 2 != 0){
                    sum += i;
                }
            }
        }

        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (Integer i : arrayList){
            sum += 3 * i + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i) % 2 != 0){
                arrayList.set(i, 3 * arrayList.get(i) + 2);
            }
        }

        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;

        for (int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i) % 2 != 0){
                sum += 3 * arrayList.get(i) + 5;
            }
        }
        return sum;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        Integer[] arr = new Integer[arrayList.size()-1];

        for (int i=0; i<arr.length; i++){
            arr[i] = (arrayList.get(i) + arrayList.get(i+1)) * 3;
        }
        List<Integer> list = Arrays.asList(arr);

        return list;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double median;
        List<Integer> list = new ArrayList<Integer>();

        for (int i : arrayList){
            if (i % 2 == 0){
                list.add(i);
            }
        }

        if (list.size() % 2 == 0){
            median = (list.get(list.size()/2) + list.get(list.size()/2-1)) / 2;
        }else {
            median = list.get(list.size()/2);
        }

        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double avg = 0;
        int flag = 0;

        for (int i : arrayList){
            if (i % 2 == 0){
                avg += i;
                flag++;
            }
        }

        avg /= flag;

        return avg;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        for (int i : arrayList){
            if (i%2==0 && i == specialElment){
                return true;
            }
        }

        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        for (int i=0; i<arrayList.size(); i++){
            if (arrayList.get(i) % 2 == 0){
                set.add(arrayList.get(i));
            }
        }

        list.addAll(set);

        return list;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<Integer>(arrayList.size());
        List<Integer> listEven = new ArrayList<Integer>(arrayList.size());
        List<Integer> listOdd = new ArrayList<Integer>(arrayList.size());

        for (int i : arrayList){
            if (i % 2 == 0){
                listEven.add(i);
            }else {
                listOdd.add(i);
            }
        }
        Collections.sort(listEven);
        Collections.reverse(listOdd);

        list.addAll(listEven);
        list.addAll(listOdd);

        return list;
    }


}
