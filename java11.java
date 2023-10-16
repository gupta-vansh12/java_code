import java.util.*;

public class java11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows and columns respectively");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] matrix= new int[rows][columns];
        System.out.println("enter the elements of rows and columns");
        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<columns; j++){
              matrix[i][j]=sc.nextInt();  
            }

        }
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the element to serach");
        int x=sc.nextInt();
        for(int i=0; i<rows; i++){
            for( int j=0; j<columns; j++){
             if(matrix[i][j]==x){
                System.out.println("the position is:"+i+","+j);
             }
            }
        }
        
    }
}