package Tugas_Pratikum2;
public class no3 {
    public static void main(String[] args){
        int[][] matriks_b = {
            {2,4,6},
            {5,7,8},
        };
        int[][] matriks_c = {
            {10,12},
            {12,13},
            {13,14},
        };
        
        int baris_b = matriks_b.length;
        int kolom_b = matriks_b[0].length;
        int baris_c = matriks_c.length;
        int kolom_c = matriks_c[0].length;
        int[][] hasilKali = new int[baris_b][kolom_b];
        for (int i=0; i<baris_b; i++){
            for (int j=0; j<kolom_c; j++){
                for (int k=0; k<kolom_b; k++){
                    hasilKali[i][j] = hasilKali[i][j] +(matriks_b[i][j]*matriks_c[k][j]);
                }
            }
        }
        for (int[] x: hasilKali){
            for (int y: x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }
    }
}    
               