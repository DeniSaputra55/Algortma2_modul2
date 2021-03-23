package Tugas_Pratikum2;
public class no4 {
    public static void main(String [] args){
        int[][] matriks_b = {
            {2, 1, -5},
            {3, 4, 2},
        };
        int[][] transpose = new int[5][5];
        for (int i=0; i<matriks_b.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                transpose[j][i] = matriks_b[i][j];
                
            }
        }
        for (int i=0; i<matriks_b[0].length; i++){
            for(int j=0; j<matriks_b[0].length; j++){
                System.out.print(transpose[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}    