public class quickSort implements SortingAlgorithm{
    @Override
    public void sorty(int[] a) {
        quickSort(a,a.length-1,0);
    }
    public void quickSort(int [] at, int high, int low){
        if(low < high){
            int a = partition(at,high,low);
            quickSort(at, high, a+1);
            quickSort(at, a-1,low);
        }

    }
    public int partition(int [] a, int high, int low){
        int pivot = a[high];
        int placeHolder;
        int dex = low - 1;
        for(int i = low; i < high; i++){
            if(a[i] < pivot){
                dex++;
                placeHolder = a[dex];
                a[dex] = a[i];
                a[i] = placeHolder;
            }
        }
        placeHolder = a[dex + 1];
        a[dex + 1] = pivot;
        a[high] = placeHolder;
        return dex + 1;
    }
    public static void main(String[] args){

    }
}
