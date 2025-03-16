package DoubleArrayEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mathScores = new int[2][3];
		//new int : 인스턴스
		
		
		for(int scores[] : mathScores) {
			for(int score : scores) {
				System.out.println("mathScore : "+score);
			}
		}
		
		mathScores[1][0] = 80;
		mathScores[1][2] = 99;
		
		System.out.println();
		
		for(int scores[] : mathScores) {
			for(int score : scores) {
				System.out.println("mathScore : "+score);
			}
		}
		
	}

}
