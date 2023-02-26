package club.codetips.design.patterns.strategy.example1.impl;

import club.codetips.design.patterns.strategy.example1.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("SELECTION_SORT_ALGO")
public class SelectionSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement selection sort algorithm
        System.out.println("Selection sort invoked");
        Arrays.sort(elements);
    }
}
