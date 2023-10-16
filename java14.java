import java.util.*;

public class java14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=0;
        
        for(int i=0; i<n; i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=b+1;
            
        }
    }
    
}
