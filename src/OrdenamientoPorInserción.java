public class OrdenamientoPorInserción {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
    }

    public static void insercion(int [] arr){
        int i, j, aux;
        int longitud = arr.length;

        for(i=1; i<=longitud-1; i++){
            j=i;
            aux = arr[j];
                while (j>0 && arr[j-1] > arr[j]) {
                    arr[j] = arr[j-1];
                    j = j-1;
                }
                arr[j]=aux
        }
    }
}