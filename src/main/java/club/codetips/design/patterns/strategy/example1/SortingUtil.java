package club.codetips.design.patterns.strategy.example1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author ravikumar
 * @since 24/02/23
 */
@Component
@RequiredArgsConstructor
public class SortingUtil {

    private final SortingAlgoFactory sortingAlgoFactory;

    public void performSorting(int[] arr, SortingAlgoType sortingAlgoType){
        SortingAlgorithm sortingAlgorithm = sortingAlgoFactory.getSortingAlgo(sortingAlgoType);
        sortingAlgorithm.sort(arr);
    }

    public void performSorting(int[] arr){
        SortingAlgorithm sortingAlgorithm;
        if(arr.length < 10) {
            sortingAlgorithm = sortingAlgoFactory.getSortingAlgo(SortingAlgoType.BUBBLE_SORT_ALGO);
        }else if(arr.length < 1000) {
            sortingAlgorithm = sortingAlgoFactory.getSortingAlgo(SortingAlgoType.SELECTION_SORT_ALGO);
        }else {
            sortingAlgorithm = sortingAlgoFactory.getSortingAlgo(SortingAlgoType.MERGE_SORT_ALGO);
        }
        sortingAlgorithm.sort(arr);
    }
}
