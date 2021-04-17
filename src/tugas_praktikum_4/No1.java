package tugas_praktikum_4;
public class No1 {
    public static void insertionSort(int[] A){
         for(int i = 1; i < A.length; i++){
             int key = A[i];
             int j = i - 1;
             while (((j >= 0)) && (A[j] > key)){
                 A[j + 1] = A[j];
                 j--;
         }
         A[j + 1] = key;
         }
     }
    public static void tampil(int data[]){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        System.out.println(" ***** TUGAS PRAKTIKUM 4***** " + "\n");
        System.out.println(" ***** No 1 Insertion Sort ***** " + "\n");
        int A[] = {25,7,9,13,3};
        No1.tampil(A);
        No1.insertionSort(A);
        No1.tampil(A);
    }
}

