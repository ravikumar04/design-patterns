package club.codetips.design.patterns.strategy.example1.impl;

import club.codetips.design.patterns.strategy.example1.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("MERGE_SORT_ALGO")
public class MergeSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement merge sort algorithm
        System.out.println("Merge sort invoked");
        Arrays.sort(elements);
    }
}
