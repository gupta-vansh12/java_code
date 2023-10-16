import java .util.*;

import javax.sound.sampled.SourceDataLine;

public class java9 {
    public static int printGcd(int a, int b){
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
       return gcd; 

    }
    public static void printFib(int n){
        int a=0, b=1, sum;
        for (int i=1; i<=n; i++){
           System.out.print(a +" ");
           sum=a+b;
           a=b;
           b=sum; 
        }
        return;


    }
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the first no.:");
    int a=sc.nextInt();
    System.out.println("enter the second no.:");
    int b=sc.nextInt();
    System.out.println("GCD of two numbers is:"+printGcd(a,b));
    System.out.println("enter the length of series:");
    int n=sc.nextInt();
    System.out.println("the desired fibonacci series is:");
    printFib(n);
    
    
}
}
