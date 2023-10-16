import java.util.*;

public class java15 {
    public static void main(String[] args){
       // StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb);
        

        // char at index 0
         // System.out.println(sb.charAt(0));
        
        //set char at index 0
        // sb.setCharAt(0 , 'p');
        // System.out.println(sb);

        // insert
        // sb.insert(2,'n');
        // System.out.println(sb);

        //delete
        // sb.delete(2,3);
        // System.out.println(sb);

        // sb.append(" "); //str=str+ " ";
        // sb.append("and money are friends");
        // System.out.println(sb);
        // System.out.println(sb.length());
    

        // reverse string
       
        StringBuilder pc = new StringBuilder("hello");
{
    for(int i=0; i<pc.length()/2; i++){
        int front =i;
        int back=pc.length() -1-i;
        char frontChar = pc.charAt(front);
        char backChar = pc.charAt(back);

        pc.setCharAt(front,backChar);
        pc.setCharAt(back,frontChar);
    }
    System.out.println(pc);
}

}
 
    
    
}
