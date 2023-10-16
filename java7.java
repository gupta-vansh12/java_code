import java.util.*;

public class java7 {
    public static void printMyName(String name){
    System.out.println(name);
    return;
    }
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;

    }
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void printFactorial(int n){
        int factorial =1;
       for( int i=n; i>=1; i-- ) {
        factorial= factorial * i;
       }
       System.out.println(factorial);
       return;
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    
    printMyName(name);//call kia function ko
    int a=sc.nextInt();
    int b=sc.nextInt();

    int sum = calculateSum(a,b);
    System.out.println(sum);
    System.out.println("product of two no is:"+calculateProduct(a,b));
    int n=sc.nextInt();
    printFactorial(n);

   
}
}
