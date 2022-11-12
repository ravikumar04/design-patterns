package club.codetips.design.patterns.factory.example2.base.impl;

import club.codetips.design.patterns.factory.example2.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example2.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("bubbleSort")
public class BubbleSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement bubble sort algorithm
        System.out.println("Bubble sort invoked");
        Arrays.sort(elements);
    }

    @Override
    public SortingAlgoType getType() {
        return SortingAlgoType.BUBBLE_SORT;
    }
}
