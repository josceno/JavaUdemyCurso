package Javabase.exercicios.matrix;

import java.util.Scanner;

public class Matrix {
    public void creatingMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas linhas tera a matriz? ");
        int N = input.nextInt();
        int M = input.nextInt();

        int[][] matrix = new int[N][M];
        for(int i = 0; i<matrix.length;i++){
            for(int j =0; j<matrix[i].length;j++){
                matrix[i][j]  = input.nextInt();
            }
            
        }
        System.out.println();
        for (int i=0; i<matrix.length;i++ ){
           
            for(int j = 0; j<matrix[i].length;j++ ){
                if (j == i){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            
        }
        for (int i = 0; i<matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        int[][] matrix = new int[N][M];

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println();

        int ocorrencia = input.nextInt();
        verificarPosições(matrix, ocorrencia);
        input.close();
    }
    public static void verificarPosições(int[][] matrix, int ocorrencia){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                 if (matrix[i][j]== ocorrencia){
                    System.out.println("Position: "+i+","+j);
                    if(j>0)  System.out.println("Left: "+matrix[i][(j-1)]);
                    if(j<matrix[i].length-1) System.out.println("Right: "+matrix[i][(j+1)]);
                    if(i>0)  System.out.println("Up: "+matrix[i-1][(j)]);
                    if(i<matrix.length-1) System.out.println("Down: "+matrix[i+1][(j)]);

                 }
            }
        }

    }
}
