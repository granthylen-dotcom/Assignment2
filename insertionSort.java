public class insertionSort implements SortingAlgorithm{
    @Override
    public void sorty(int[] a) {
        int placeHolder;
        int dex;
        for(int i = 1; i < a.length; i++){
            placeHolder = a[i];
            dex = i - 1;
            while(dex >= 0 && placeHolder < a[dex]){
                a[dex + 1] = a[dex];
                dex--;
            }
            a[dex + 1] = placeHolder;
        }
    }
    public static void main(String[] args){

    }
}
