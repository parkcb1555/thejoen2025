package q558;
import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] num = new int[100];
        Scanner sc = new Scanner(System.in);
        int cnt=0;

        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
                num[cnt] = n;
                cnt++;
            
        }

        for(int i=cnt-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
}