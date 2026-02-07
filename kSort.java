public class kSort {
    public static void kSort(int [] a){
        int k = 10;
        int dex;
        int placeHolder;
        for(int i = k; i < a.length; i++){
            placeHolder = a[i];
            dex = i;
            while (dex >= k &&  placeHolder < a[dex - k]){
                a[dex] = a[dex-k];
                dex -= k;
            }
            a[dex] = placeHolder;
        }
    }
    public static void main(String[] args){

    }
}
