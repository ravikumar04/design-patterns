package club.codetips.design.patterns.factory.example1;

import club.codetips.design.patterns.factory.example1.base.SortingAlgoType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ravikumar
 * @since 10/11/22
 */
@SpringBootTest
class SortingAlgoFactory3Test {

    @Test
    void testBubbleSort(){
        final SortingAlgoType algoType = SortingAlgoType.BUBBLE_SORT;
        final int[] elements = new int[] {3,2,1,9};
        SortingAlgoFactory3.getSortingAlgo(algoType).sort(elements);
        Assertions.assertTrue(isSorted(elements));
    }

    private boolean isSorted(int[] elements) {
        int elementCount = elements.length;
        if(elementCount > 1) {
            for (int i = 1; i < elementCount; i++) {
                if (elements[i - 1] > elements[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    void testSelectionSort(){
        final SortingAlgoType algoType = SortingAlgoType.SELECTION_SORT;
        final int[] elements = new int[] {3,2,1,9};
        SortingAlgoFactory3.getSortingAlgo(algoType).sort(elements);
        Assertions.assertTrue(isSorted(elements));
    }

    @Test
    void testMergeSort(){
        final SortingAlgoType algoType = SortingAlgoType.MERGE_SORT;
        final int[] elements = new int[] {3,2,1,9};
        SortingAlgoFactory3.getSortingAlgo(algoType).sort(elements);
        Assertions.assertTrue(isSorted(elements));
    }
}
