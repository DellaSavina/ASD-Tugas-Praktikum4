package tugas_praktikum_4;
import java.util.Scanner;
public class No5 {
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
        System.out.println(" ***** No 5 Insertion Sort & Binarry13 ***** " + "\n");
        int A[] = {25,7,9,13,3};
        No5.tampil(A);
        No5.insertionSort(A);
        No5.tampil(A);
        int key;
        int IndeksAwal = 0;
        int IndeksAkhir = A.length-1;
        int ketemu = 0;
        int point = 0;
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan data yang akan dicari: ");
        key = scan.nextInt();
        
        System.out.println("isi data adalah: ");
        for (int i = 0; i <A.length; i++) {
            
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        
        while((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("indeks pointer: " + point);
                if (key == A[point]) {
                    ketemu = 1;
                    System.out.println("Data " +
                    key + " Telah ditemukan pada index ke " +point);
                }
                
                else if(key < A[point]){
                    System.out.println("Cari di kiri");
                    IndeksAkhir = point-1;
                }
                else {
                    IndeksAwal = point+1;
                    System.out.println("Cari di kanan");
                }
            }
        
       if (ketemu == 1)
           System.out.println("Kesimpulan: data ditemukan ");
       else
           System.out.println("Kesimpulan: data tidak ditemukan");
    }
    
}

     

