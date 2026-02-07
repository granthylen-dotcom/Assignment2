import java.util.Random;
public class Tester {
    SortingAlgorithm sa;
    kSort k = new kSort();
    Random ran = new Random();
    public Tester(SortingAlgorithm sa){
        this.sa = sa;
    }
    public double singleTest(int size){
        int placeHolder;
        int [] a = new int[size];
        for(int i = 0; i < a.length; i++){
            placeHolder = ran.nextInt();
            a[i] = placeHolder;
        }
        k.kSort(a);
        long startTime = System.nanoTime();
        sa.sorty(a);
        long endTime = System.nanoTime();
        double runTime = (endTime - startTime)/1000000;
        return runTime;
    }
    public void test(int iterations, int size){
        double totalTime = 0;
        double result;
        for(int i = 0; i < iterations; i++){
            totalTime += singleTest(size);
        }
        result = totalTime/iterations;
        System.out.print(result);
    }
    public static void main(String[] args){

    }
}
