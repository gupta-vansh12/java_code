import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.DoubleAccumulator;

public class java8 {
    public static int printAvrage(int a,int b ,int c){
        return (a+b+c)/3;
    }
    public static void printSum(int n){
        int sum=0;
        for(int i=1; i<=n; i+=2){
            
            sum=sum+i;
        }
        System.out.println("the sum of all odd no upto n is :"+sum);
        return ;
    }
    public static void printGreater(int a, int b){
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(b>a){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("boyh are equal");
        }
        return;
    }
    public static double printCircumfrence(int a){
        double circumfrence=2*3.14*a;
        return circumfrence;
    }
    public static void printVote(int v){
        if(v>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
    public static double printPower(int a,int b){
       if(b==0){
        return 1;
       }
       else{
        return a*printPower(a,b-1);
       }
    }
    
    

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt(); 
   
    System.out.println("The average of three no is:"+printAvrage(a,b,c));
    int n=sc.nextInt();
    printSum(n);
    printGreater(a,b);
    System.out.println("the circumfrence of circle:"+printCircumfrence(a));
    int v=sc.nextInt();
    printVote(v);
    int s=0;
    do{
        System.out.println(s+" ");
        s=s+1;
    }while(s<10);
    int countPositive=0;
    int countNegative=0;
    int countZeros=0;
    char choice;
    do
    {
    System.out.println("enter the number:");
    int num=sc.nextInt();
    if(num>0){
        countPositive++;
    }
    else if(num<0){
        countNegative++;
    }
    else{
        countZeros++;
    }
    System.out.println("do you want to continue y/n?");
    choice=sc.next().charAt(0);
}while(choice=='y' || choice=='y');

System.out.println("positive numbers:"+countPositive);
System.out.println("Negative numbers:"+countNegative);
System.out.println("zero numbers:" +countZeros);
System.out.println("the power a raise to b is:" +printPower(a,b));

}
}
