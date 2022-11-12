package club.codetips.design.patterns.factory.example2.base.impl;

import club.codetips.design.patterns.factory.example2.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example2.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("selectionSort")
public class SelectionSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement selection sort algorithm
        System.out.println("Selection sort invoked");
        Arrays.sort(elements);
    }

    @Override
    public SortingAlgoType getType() {
        return SortingAlgoType.SELECTION_SORT;
    }
}
