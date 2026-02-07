public class shellSort implements SortingAlgorithm{
    public void sorty(int[] a){
        int dex = 0;
        int placeHolder = 0;
        for(int gap = a.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < a.length; i++){
                placeHolder = a[i];
                dex = i;
                while(dex >= gap && placeHolder < a[dex - gap]){
                    a[dex] = a[dex-gap];
                    dex -= gap;
                }
                a[dex] = placeHolder;

            }
        }
    }
    public static void main(String[] args){

    }

}
