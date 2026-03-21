interface SortStrategy {
    void sort(int[] array);
    String name();
}

class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // TODO: Implement bubble sort
    }

    @Override
    public String name() {
        return "BubbleSort";
    }
}

class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] array) {
        // TODO: Implement selection sort
    }

    @Override
    public String name() {
        return "SelectionSort";
    }
}

class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        // TODO: Change the strategy
    }

    public String getStrategyName() {
        // TODO: Return the current strategy's name
        return "";
    }

    public void sort(int[] array) {
        // TODO: Delegate to the strategy
    }
}
