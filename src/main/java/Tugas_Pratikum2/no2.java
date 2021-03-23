package Tugas_Pratikum2;
public class no2 {
    public static void main(String[] args) {
        int[][] matriks_b ={
            {14,16},
            {16,18},
            {18,20},
        };
        int[][] matriks_c ={
            {4,6},
            {6,8},
            {8,10},
        };
        int[][] hasilTambah = new int[matriks_b.length][matriks_b[0].length];
        if (matriks_b.length == matriks_c.length && matriks_b[0].length == matriks_c[0].length){
            for (int i=0; i<matriks_b.length; i++){
                for (int j=0; j<matriks_b[0].length; j++){
                hasilTambah[i][j] = matriks_b[i][j] - matriks_c[i][j];
                System.out.print(hasilTambah[i][j]+" ");
                }
             System.out.println();
             }
        }
        else{
            System.out.print("\n baris dan kolom matriks tidak sama");
        }
    }
}    
