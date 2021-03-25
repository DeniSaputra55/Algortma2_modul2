package Tugas_Pratikum2;
public class no3 {
    public static void main(String[] args){
        int[][] matriks_b = {
            {3, 4},
            {4, 5},
            {5, 6},
        };
        int[][] matriks_c = {
            {10, 11, 12},
            {12, 13, 14},
            
        };
        
        if (matriks_b[0].length == matriks_c.length){
            int[][] hasilKali = new int[matriks_b.length][matriks_c[0].length];
             for (int i=0; i<matriks_b.length; i++){
                 for (int j=0; j<matriks_b[0].length; j++){
                    for (int k=0; k<matriks_b[0].length; k++){
                        hasilKali[i][j] += matriks_b[i][k]*matriks_c[k][j];
                    }
                }
            }
            for (int[] x: hasilKali){
                for (int y: x){
                     System.out.print(y+" ");
                }
                System.out.println();
            }
        }    
        else{
            System.out.println("syarat; kolom matriks_b = baris matriks_c");
        }
    }
}    
           