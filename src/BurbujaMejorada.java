public class BurbujaMejorada {
    public static void main(String[] args) {
        int[] arr = { 89, 45, 68, 90, 29, 34, 17 };
        burbujaMejorada(arr);
        mostrarArreglo(arr);
    }

    public static void burbujaMejorada(int[] arr) {
        boolean ordenado = false;
        int i = 0, j;
        int n = arr.length - 1;

        while (i<n-1 && !ordenado) {
            ordenado = true;
            for (j = 0; j < n-i-2; j++) {
                if(arr[j] > arr[j+1]){
                    ordenado = false;
                    swap(arr, j, j+1);
                }
            }
            i++;
        }
    }

    public static void swap(int[] arr, int j, int i) {
        int aux;
        aux = arr[j];
        arr [j] = arr[j+1];
        arr [j+1] = aux;
    }

    public static void mostrarArreglo(int[] arr) {
        // Este modulo se encargar de mostrar por pantalla el arreglo
        int i, longitud;
        longitud = arr.length;
        for (i = 0; i < longitud; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
