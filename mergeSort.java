public class mergeSort implements SortingAlgorithm {
    @Override
    public void sorty(int [] a){
        sort(a,0,a.length-1);
    }
    public void sort(int [] a, int l, int r){
        if(l < r){
            int m = l + ((r-l)/2);
            sort(a,l,m);
            sort(a,m + 1,r);
            merge(a,l,r,m);
        }

    }
    public void merge(int [] a, int l, int r, int m){
        int sizeL = m - l + 1;
        int sizeR = r - m;
        int [] halfL = new int [sizeL];
        int [] halfR = new int [sizeR];
        for(int i = 0; i < sizeL; i++){
            halfL[i] = a[i + l];
        }
        for(int i = 0; i < sizeR; i++){
            halfR[i] = a[i + m + 1];
        }
        int dexL = 0;
        int dexR = 0;
        int counter = l;
        while(dexR < sizeR && dexL <sizeL){
            if(halfR[dexR] >= halfL[dexL]){
                a[counter] = halfL[dexL];
                dexL++;
            }
            else{
                a[counter] = halfR[dexR];
                dexR++;
            }
            counter++;
        }
        while(dexR < sizeR){
            a[counter] = halfR[dexR];
            dexR++;
            counter++;
        }
        while(dexL < sizeL){
            a[counter] = halfL[dexL];
            dexL++;
            counter++;
        }


    }
    public static void main(String[] args){

    }


}
