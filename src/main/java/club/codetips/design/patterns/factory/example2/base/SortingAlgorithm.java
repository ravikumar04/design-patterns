package club.codetips.design.patterns.factory.example2.base;


public interface SortingAlgorithm {

    void sort(int[] elements);

    SortingAlgoType getType();
}
