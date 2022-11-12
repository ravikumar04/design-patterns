package club.codetips.design.patterns.factory.example3.base.impl;

import club.codetips.design.patterns.factory.example3.SortingAlgoFactory5;
import club.codetips.design.patterns.factory.example3.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example3.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("selection_sort")
public class SelectionSort implements SortingAlgorithm {

    public SelectionSort() {
        SortingAlgoFactory5.registerAlgo(SortingAlgoType.SELECTION_SORT,this);
    }

    public void sort(int[] elements) {
        //Implement selection sort algorithm
        System.out.println("Selection sort invoked");
        Arrays.sort(elements);
    }

}
