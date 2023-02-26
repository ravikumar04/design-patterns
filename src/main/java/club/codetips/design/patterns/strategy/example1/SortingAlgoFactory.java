package club.codetips.design.patterns.strategy.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;


@Component
public class SortingAlgoFactory {

    private static final Map<SortingAlgoType, SortingAlgorithm> REGISTRY = new EnumMap<>(SortingAlgoType.class);

    protected SortingAlgoFactory(@Qualifier("BUBBLE_SORT_ALGO") SortingAlgorithm bubbleSort,
                                 @Qualifier("SELECTION_SORT_ALGO") SortingAlgorithm selectionSort,
                                 @Qualifier("MERGE_SORT_ALGO") SortingAlgorithm mergeSort) {
        REGISTRY.put(SortingAlgoType.BUBBLE_SORT_ALGO, bubbleSort);
        REGISTRY.put(SortingAlgoType.MERGE_SORT_ALGO, mergeSort);
        REGISTRY.put(SortingAlgoType.SELECTION_SORT_ALGO, selectionSort);
    }


    public SortingAlgorithm getSortingAlgo(SortingAlgoType algoType) {
        if (REGISTRY.containsKey(algoType)) {
            return REGISTRY.get(algoType);
        } else {
            throw new IllegalArgumentException("Algorithm Type : " + algoType + "  is not handled");
        }
    }
}
