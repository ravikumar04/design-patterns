package club.codetips.design.patterns.factory.example3.base.impl;

import club.codetips.design.patterns.factory.example3.SortingAlgoFactory5;
import club.codetips.design.patterns.factory.example3.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example3.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("merge_sort")
public class MergeSort implements SortingAlgorithm {

    public MergeSort() {
        SortingAlgoFactory5.registerAlgo(SortingAlgoType.MERGE_SORT, this);
    }

    public void sort(int[] elements) {
        //Implement merge sort algorithm
        System.out.println("Merge sort invoked");
        Arrays.sort(elements);
    }

}
