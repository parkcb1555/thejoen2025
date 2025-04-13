package q1303;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int cnt=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {		
//				System.out.print((m*i)+(j+1)+" ");
				if(cnt/10 < 1) {
					System.out.print(" ");
				}
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
		
		sc.close();
	}

}
