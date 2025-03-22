package FinalEx;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Earth.EARTH_SURFACE_AREA);
		
		
		//static 없음
		/*
		 *  //static 없으면 new()로 불러와야함
		 * Earth earth = new Earth();
		 * System.out.println(earth.EARTH_SURFACE_AREA);
		 * */
		
		//final 없음
		/*	//final 있으면 대입 연산자 불가능. 생성자를 통해서 초기화는 가능
		 * Earth.EARTH_SURFACE_AREA = 6500
		 *
		 */
		
	}

}


class Earth{
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
}