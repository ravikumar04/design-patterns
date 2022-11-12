package club.codetips.design.patterns.factory.example1;

import club.codetips.design.patterns.factory.example1.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example1.base.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;


@Component
public class SortingAlgoFactory3 {

    private static final Map<SortingAlgoType, SortingAlgorithm> REGISTRY = new EnumMap<>(SortingAlgoType.class);

    @Autowired
    protected SortingAlgoFactory3(Map<String, SortingAlgorithm> sortingAlgorithmMap) {
        for (Map.Entry<String, SortingAlgorithm> algorithmEntry : sortingAlgorithmMap.entrySet()) {
            REGISTRY.put(SortingAlgoType.valueOf(algorithmEntry.getKey()), algorithmEntry.getValue());
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
