public class bubbleSort implements SortingAlgorithm{
    @Override
    public void sorty(int [] a) {
        int placeholder = 0;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] >  a[j + 1]){
                    placeholder = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = placeholder;
                }
            }
        }
    }
    public static void main(String[] args){

    }
}

