package club.codetips.design.patterns.factory.example1;

import club.codetips.design.patterns.factory.example1.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example1.base.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;


@Component
public class SortingAlgoFactory2 {

    private static final Map<SortingAlgoType, SortingAlgorithm> REGISTRY = new EnumMap<>(SortingAlgoType.class);

    protected SortingAlgoFactory2(@Qualifier("BUBBLE_SORT") SortingAlgorithm bubbleSort,
                               @Qualifier("SELECTION_SORT") SortingAlgorithm selectionSort,
                               @Qualifier("MERGE_SORT") SortingAlgorithm mergeSort) {
        REGISTRY.put(SortingAlgoType.BUBBLE_SORT, bubbleSort);
        REGISTRY.put(SortingAlgoType.MERGE_SORT, mergeSort);
        REGISTRY.put(SortingAlgoType.SELECTION_SORT, selectionSort);
    }


    public static SortingAlgorithm getSortingAlgo(SortingAlgoType algoType) {
        if (REGISTRY.containsKey(algoType)) {
            return REGISTRY.get(algoType);
        } else {
            throw new IllegalArgumentException("Algorithm Type : " + algoType + "  is not handled");
        }
    }
}
