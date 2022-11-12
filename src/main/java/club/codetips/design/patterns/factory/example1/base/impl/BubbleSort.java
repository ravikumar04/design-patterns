package club.codetips.design.patterns.factory.example1.base.impl;

import club.codetips.design.patterns.factory.example1.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("BUBBLE_SORT")
public class BubbleSort implements SortingAlgorithm {

    public void sort(int[] elements) {
        //Implement bubble sort algorithm
        System.out.println("Bubble sort invoked");
        Arrays.sort(elements);
    }
}
