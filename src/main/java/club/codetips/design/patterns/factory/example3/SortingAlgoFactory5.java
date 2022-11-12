package club.codetips.design.patterns.factory.example3;

import club.codetips.design.patterns.factory.example3.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example3.base.SortingAlgorithm;

import java.util.EnumMap;
import java.util.Map;


public class SortingAlgoFactory5 {

    private static final Map<SortingAlgoType, SortingAlgorithm> REGISTRY = new EnumMap<>(SortingAlgoType.class);

    private SortingAlgoFactory5() {
    }

    public static synchronized void registerAlgo(SortingAlgoType algoType, SortingAlgorithm sortingAlgorithm) {
        if (!REGISTRY.containsKey(algoType)) {
            REGISTRY.put(algoType, sortingAlgorithm);
        } else {
            throw new IllegalArgumentException("Algorithm Type : " + sortingAlgorithm + "  is used multiple times");
        }
    }

    public static SortingAlgorithm getSortingAlgo(SortingAlgoType algoType) {
        if (REGISTRY.containsKey(algoType)) {
            return REGISTRY.get(algoType);
        } else {
            throw new IllegalArgumentException("Algorithm Type : " + algoType + "  is not handled");
        }
    }
}
