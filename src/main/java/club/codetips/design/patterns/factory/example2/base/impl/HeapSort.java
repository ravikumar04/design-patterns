package club.codetips.design.patterns.factory.example2.base.impl;

import club.codetips.design.patterns.factory.example2.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example2.base.SortingAlgorithm;
import org.springframework.stereotype.Component;


@Component("heapSort")
public class HeapSort implements SortingAlgorithm {

    @Override
    public void sort(int[] elements) {
        // implement the heap sort
    }

    @Override
    public SortingAlgoType getType() {
        return SortingAlgoType.HEAP_SORT;
    }
}
