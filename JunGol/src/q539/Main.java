package q539;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        double avg=0.0;

        while(true){
            int n= sc.nextInt();
            
            sum+=n;
            count++;
            if(n>=100){
                break;
            }
            
        }

        System.out.println(sum);
        System.out.printf("%.1f",(double)sum/(double)count);
    }
}