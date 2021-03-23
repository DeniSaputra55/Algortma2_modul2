package Tugas_Pratikum2;
public class no1 {
    public static void main(String[] args){
        int matriks [][] = new int [3][2];
        matriks[0][0] = 34;
        matriks[0][1] = 56;
        matriks[1][0] = 45;
        matriks[1][1] = 36;
        matriks[2][0] = 51;
        matriks[2][1] = 32;
        for (int i=0; i<matriks.length; i++){
            for(int j=0; j<matriks[0].length; j++){
                System.out.print(+ matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
