import java.util.*;

public class java12 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter rows and columns for matrix one respectively");
    int row1=sc.nextInt();
    int col1=sc.nextInt();
    int[][] matrix1 = new int[row1][col1];
    System.out.println("enter the elements for matrix one");
    for(int i=0; i<row1; i++){
        for(int j=0; j<col1; j++){
            matrix1[i][j]=sc.nextInt();
        }
    }
    System.out.println("the matrix formed:");
    for(int i=0; i<row1; i++){
        for(int j=0; j<col1; j++){
            System.out.print(matrix1[i][j] +" ");
        }
        System.out.println();
    }
    System.out.println("enter rows and columns for matrix two respectively");
    int row2=sc.nextInt();
    int col2=sc.nextInt();
    int[][] matrix2 = new int[row1][col1];
    System.out.println("enter the elements for matrix one");
    for(int i=0; i<row2; i++){
        for(int j=0; j<col2; j++){
            matrix2[i][j]=sc.nextInt();
        }
    }
    System.out.println("the matrix formed:");
    for(int i=0; i<row2; i++){
        for(int j=0; j<col2; j++){
            System.out.print(matrix2[i][j] +" ");
        }
        System.out.println();
    }
    if(col1!=row2){
        System.out.println("mutiplication of these matrix is not possible");

    }
    else{
        
        System.out.println("product of two matrix is:");
        int[][] matrix3=new int[row1][col2];
        for(int i=0; i<row1; i++){
            for(int j=0; j< col2; j++){
                
                for(int k=0; k<row2; k++){
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(matrix3[i][j]+" ");

            }
            System.out.println();
        }

    }

}

    }
    

