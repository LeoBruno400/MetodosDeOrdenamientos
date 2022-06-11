public class OrdenamientoPorInserción {
    public static void main(String[] args) {
        int[] arr = {89,45,68,90,29,34,17};
        insercion(arr);
        mostrarArreglo(arr);
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
                arr[j]=aux;
        }
    }

    public static void mostrarArreglo(int[] arr) {
        //Este modulo se encargar de mostrar por pantalla el arreglo
        int i, longitud;
        longitud = arr.length;
        System.out.println("\n");
        System.out.println("Los datos del arreglo son");
        for (i = 0; i < longitud; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}