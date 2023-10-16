import java.util.*;

public class java13 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // string declaration
        String name="vansh";
        String fulname="vansh gupta";
        String sentence=" my name is vansh gupta";
        String naam =sc.nextLine();
        System.out.println("your name is:"+naam);
        // concatenation(jodna chijo)
        String firstname= "Vansh";
        String lastname="Gupta";
        String fullname=firstname+" "+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        // charAt
        for(int i=0; i<fullname.length(); i++){
          System.out.println(fullname.charAt(i));  
        }
        //compare
        // s1>s2 : +ve value
        //s2>s1: negative value
        //s1=s2: zero
        if(name.compareTo(fulname)==0){
        System.out.println("Strings are equal");
        }
        else if(name.compareTo(fulname)>0){
            System.out.println("string name is bigger");
        }
        else{
            System.out.println("string fulname is bigger");
        }
        //substring
       
        String naaam = sentence.substring(12,17);
        System.out.println(naaam);
        // strings are immutable

    }
    
}
