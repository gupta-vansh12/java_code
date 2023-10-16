import java.util.*;

public class java4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        {
        for(int i=0; i<10; i++){
            System.out.println("hello world");
        }
        for(int x=0; x<11; x++){
            System.out.print(x );
        }
        int g=0;
        while(g<11){
            System.out.println(g);
            g=g+1;
        }
        int s=0;
        do{
            System.out.println(s);
            s=s+1;
        }while(s<11);
        //dowhile loop print the no for atleast once
    }
    int n =sc.nextInt();
{
    int sum  =0;
    for(int i=0; i<n; i++){
        sum=sum +i;
    }
    System.out.println(sum);
}
{
    for(int i=0; i<11; i++){
      System.out.println(i*n);  
    }
}
}    
}
