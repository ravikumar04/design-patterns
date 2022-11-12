package club.codetips.design.patterns.factory.example3.base.impl;

import club.codetips.design.patterns.factory.example3.SortingAlgoFactory5;
import club.codetips.design.patterns.factory.example3.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example3.base.SortingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component("bubble_sort")
public class BubbleSort implements SortingAlgorithm {

    public BubbleSort() {
        SortingAlgoFactory5.registerAlgo(SortingAlgoType.BUBBLE_SORT,this);
    }

    public void sort(int[] elements) {
        //Implement bubble sort algorithm
        System.out.println("Bubble sort invoked");
        Arrays.sort(elements);
    }

}
