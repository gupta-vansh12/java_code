import java.util.*;

public class java6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        //butterfly
        {
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
               int spaces=2*(n-i);
               for(int j=1; j<=spaces; j++)
               System.out.print(" ");
            
        
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
               int spaces=2*(n-i);
               for(int j=1; j<=spaces; j++)
               System.out.print(" ");
            
        
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        //solid rombhus
        {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
        //number pyramid
        {
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
    
        }
        //palendrms
        {
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=i; j>=1; j--){
                           System.out.print(j);
                    
                }
                for(int j=2; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    
        }
        //DIAMOND
        {
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                           System.out.print("*");
                    
                }
                for(int j=2; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n; i>=1; i--){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                           System.out.print("*");
                    
                }
                for(int j=2; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    
        }


    }
}    