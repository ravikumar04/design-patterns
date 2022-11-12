package club.codetips.design.patterns.factory.example1.base.impl;

import club.codetips.design.patterns.factory.example1.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("SELECTION_SORT")
public class SelectionSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement selection sort algorithm
        System.out.println("Selection sort invoked");
        Arrays.sort(elements);
    }
}
