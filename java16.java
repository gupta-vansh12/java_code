import java.util.*;

public class java16 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n =sc.nextInt();
    int pos = sc.nextInt();
    int  bitMask = 1<<pos;

    if((bitMask & n)==0){
        System.out.println("bit was zero");

    }
    else{
        System.out.println("bit was one");
    }



    }dbjisguoguo
    
}
