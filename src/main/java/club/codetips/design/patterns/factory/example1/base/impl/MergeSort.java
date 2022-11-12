package club.codetips.design.patterns.factory.example1.base.impl;

import club.codetips.design.patterns.factory.example1.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("MERGE_SORT")
public class MergeSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement merge sort algorithm
        System.out.println("Merge sort invoked");
        Arrays.sort(elements);
    }
}
