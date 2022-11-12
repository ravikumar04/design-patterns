package club.codetips.design.patterns.factory.example2.base.impl;

import club.codetips.design.patterns.factory.example2.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example2.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("mergeSort")
public class MergeSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement merge sort algorithm
        System.out.println("Merge sort invoked");
        Arrays.sort(elements);
    }

    @Override
    public SortingAlgoType getType() {
        return SortingAlgoType.MERGE_SORT;
    }
}
