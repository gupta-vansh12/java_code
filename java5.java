import java.util.*;

public class java5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int m= sc.nextInt();
        {
        for(int i =1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
        {
        for(int i=1; i<=n; i++){
            for(int j =1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
              System.out.print(j+" ");  
            }
            System.out.println();
        }
    }
    {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    int number =1;
    {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
              System.out.print(number);  
              number++;
            }
            System.out.println();
        }
    }
    {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 ==0){
              System.out.print("1");  
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
    }   
}
