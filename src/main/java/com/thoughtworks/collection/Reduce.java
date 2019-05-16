package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = 0;

        for (int i : arrayList) {
            if (i > max)
                max = i;
        }

        return max;
    }

    public double getMinimum() {
        double min = 10;

        for (int i : arrayList) {
            if (i < min)
                min = i;
        }

        return min;
    }

    public double getAverage() {
        double avg = 0;

        for (int i : arrayList) {
            avg += i;
        }

        return avg / arrayList.size();
    }

    public double getOrderedMedian() {
        double median;

        if (arrayList.size() % 2 == 0) {
            median = (double) (arrayList.get(arrayList.size() / 2) + (double) arrayList.get(arrayList.size() / 2 - 1)) / 2.0;
        } else {
            median = arrayList.get(arrayList.size() / 2);
        }

        return median;
    }

    public int getFirstEven() {
        for (int i : arrayList) {
            if (i % 2 == 0)
                return i;
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        int flag = -1;
        for (int i : arrayList) {
            flag++;
            if (i % 2 == 0)
                break;
        }

        return flag;
    }

    public boolean isEqual(List<Integer> arrayList) {
        return Arrays.deepEquals(arrayList.toArray(), this.arrayList.toArray());
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double median;

        if (arrayList.size() % 2 == 0) {
            median = (double) (arrayList.get(arrayList.size() / 2) + (double) arrayList.get(arrayList.size() / 2 - 1)) / 2.0;
        } else {
            median = arrayList.get(arrayList.size() / 2);
        }

        return median;
    }

    public int getLastOdd() {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) % 2 != 0)
                return arrayList.get(i);
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (i % 2 != 0)
                return i;
        }
        return 0;
    }
}
