public class preformanceComparison {
    public void main(String[] args){
        SortingAlgorithm [] algorithms = {new bubbleSort(), new selectionSort(), new insertionSort(), new quickSort(), new mergeSort(), new shellSort()};
        String [] sortingName = {"bubble sort", "selection sort", "insertion sort", "quick sort", "merge sort", "shell sort"};
        Tester test;
        int [] sizes = {100,500,1000,2000,5000,10000,20000,75000,150000};
        for(int i = 0; i < algorithms.length; i++){
            test = new Tester(algorithms[i]);
            System.out.println("Soriting Alogrithm: " + sortingName[i]);
            for(int j = 0; j < sizes.length; j++){
                System.out.print("Sorting " + sizes[j] + "elements in x ms(avg): ");
                test.test(20,sizes[j]);
                System.out.println();
            }
        }
    }

}
