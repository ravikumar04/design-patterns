package club.codetips.design.patterns.strategy.example1.impl;

import club.codetips.design.patterns.strategy.example1.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("BUBBLE_SORT_ALGO")
public class BubbleSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement bubble sort algorithm
        System.out.println("Bubble sort invoked");
        Arrays.sort(elements);
    }
}
