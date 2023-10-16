import java.util.*;

public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
        int age=sc.nextInt();
         
        if(age>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible");
        }
        }
        {
        int a = sc.nextInt();
        if(a % 2 == 0)
        {
           System.out.println("even no");
        }
        else{
            System.out.println("odd no");
        }
        }
        {
            int x = sc.nextInt();
            int y= sc.nextInt();
            if(x>y){
                System.out.println("x is greater");

            }
            else if(y>x) {
                System.out.println("y is greater");

            }
            else{
                System.out.println("boyh are equal");
            }
        }
        {
            int button=sc.nextInt();
            if(button ==1){
             System.out.println("namaste");
            }
            else if(button==2){
                System.out.println("hello");
            }
            else if(button ==3){
            System.out.println("bonjour");
            }
            else{
                System.out.println("does not exsist");
            }
        }


    
}
}

