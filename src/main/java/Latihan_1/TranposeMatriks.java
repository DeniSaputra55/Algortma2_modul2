package Latihan_1;
import java.util.Scanner;
public class TranposeMatriks {
    public static void main(String[] args){
    int i, j, m, n;
    int matriks[][] = new int[10][10];
    int transpose[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan jumlah baris matriks: ");
    m = scan.nextInt();
    System.out.print("Masukan jumlah kolom matriks: ");
    n = scan.nextInt();
    System.out.print("Masukan elemen matriks: ");
    for(i = 0; i < m; i++){
      for(j =0; j <m; j++){
       matriks[i][j] = scan.nextInt();
      }
     }
     for(i =0; i < m; i++){
       for(j =0; j <m; j++){
          transpose[j][i] = matriks[i][j];
       }  
     }
    System.out.println("Hasil tranpose matriks: ");
    for(i =0; i< n; i++){
      for(j =0; j< m; j++){
        System.out.print(transpose[i][j] + "\t");
       }
       System.out.println();
     }
   }
}    