public class selectionSort implements SortingAlgorithm{
    @Override
    public void sorty(int[] a) {
        int minDex;
        int placeholder;
        for(int i = 0; i < a.length; i++){
            minDex = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[minDex]){
                    minDex = j;
                }
            }
            placeholder = a[i];
            a[i] = a[minDex];
            a[minDex] = placeholder;

        }
    }
    public static void main(String[] args){

    }
}
