package club.codetips.design.patterns.factory.example1;

import club.codetips.design.patterns.factory.example1.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example1.base.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SortingAlgoFactory1 {
    private final SortingAlgorithm bubbleSort;
    private final SortingAlgorithm selectionSort;
    private final SortingAlgorithm mergeSort;

    public SortingAlgoFactory1(@Qualifier("BUBBLE_SORT") SortingAlgorithm bubbleSort,
                               @Qualifier("SELECTION_SORT") SortingAlgorithm selectionSort,
                               @Qualifier("MERGE_SORT") SortingAlgorithm mergeSort) {
        this.bubbleSort = bubbleSort;
        this.selectionSort = selectionSort;
        this.mergeSort = mergeSort;
    }


    public SortingAlgorithm getSortingAlgo(SortingAlgoType algoType) {
        switch (algoType) {
            case BUBBLE_SORT:
                return bubbleSort;
            case MERGE_SORT:
                return mergeSort;
            case SELECTION_SORT:
                return selectionSort;
            default:
                throw new IllegalArgumentException("Algorithm Type : " + algoType +"  is not handled");
        }
    }
}
