package ArrayEx;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		System.out.println();
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println();
		
		for(int i : scores) {
			System.out.println(i);
		}
		
		int sum=0;
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		
		System.out.println("sum : "+sum);
		double avg = (double)sum/3;
		System.out.println("avg : "+avg);
	}
}
