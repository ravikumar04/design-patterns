package club.codetips.design.patterns.factory.example2;

import club.codetips.design.patterns.factory.example2.base.SortingAlgoType;
import club.codetips.design.patterns.factory.example2.base.SortingAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;


@Component
public class SortingAlgoFactory4 {

    private static final Map<SortingAlgoType, SortingAlgorithm> REGISTRY = new EnumMap<>(SortingAlgoType.class);

    @Autowired
    protected SortingAlgoFactory4(List<SortingAlgorithm> sortingAlgorithms) {
        for(SortingAlgorithm sortingAlgorithm : sortingAlgorithms) {
            if(!REGISTRY.containsKey(sortingAlgorithm.getType())) {
                REGISTRY.put(sortingAlgorithm.getType(), sortingAlgorithm);
            }else {
                throw new IllegalArgumentException("Algorithm Type : " + sortingAlgorithm.getType() + "  is used multiple times");
            }
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
