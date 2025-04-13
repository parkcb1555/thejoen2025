package q560;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numarr[] = new int[10];
		int min = 1000;
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			numarr[i] = num;
			if(num<min) {
				min = num;
			}
		}
		int min2 = 1000;
		for(int i=0;i<10;i++) {
			if(numarr[i]<min2) {
				min2 = numarr[i];
			}
		}
		
		System.out.println(min);
		System.out.println(min2);
		sc.close();
	}

}
