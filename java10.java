import java.util.*;

public class java10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array:");
            int size=sc.nextInt();
            System.out.println("enter the elements of array:");
            int numbers[]= new int[size];
        
       // int marks[]={97,98,99};
       // int[] marks= new int[3];
       // int marks[]=new int[3];
       // marks[0]= 97;
       // marks[1]=98;
       // marks[2]=99;
       // System.out.println(marks[0]);
       // System.out.println(marks[1]);
       // System.out.println(marks[2]);
       
       for(int i=0; i<size; i++){
        numbers[i]=sc.nextInt();
       }
     

       System.out.println("enter the value to search:");
       int x= sc.nextInt();

       for(int i=0; i<numbers.length; i++){
        if (numbers[i]==x){
      //  System.out.println(marks[i]);
      System.out.println("x found at index:"+ i);

       }}
    }
    
}
