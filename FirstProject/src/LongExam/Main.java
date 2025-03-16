package LongExam;

import java.util.*;

public class Main {
	
	//열거 타입
	enum Week{
		MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY
	};
	
	public static void main(String[] args) {
		Week today = null;
		
		//내부적으로 싱글톤 패턴으로 제작되어있음
		//싱글톤(Singleton) 패턴은 특정 클래스의 인스턴스가 오직 하나만 생성되도록 보장하는 디자인 패턴
		// 프로그램 전체에서 동일한 자원을 공유
		Calendar cal = Calendar.getInstance();
		
		int iWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(iWeek);
		
		switch (iWeek) {
			case 1: {
				today = Week.SUNDAY;
				break;
			}
			case 2: {
				today = Week.MONDAY;
				break;
			}
			case 3: {
				today = Week.TUESDAY;
				break;
			}
			case 4: {
				today = Week.WEDNESDAY;
				break;
			}
			case 5: {
				today = Week.THURDAY;
				break;
			}
			case 6: {
				today = Week.FRIDAY;
				break;
			}
			case 7: {
				today = Week.SATURDAY;
				break;
			}
			
		}
		
		
		System.out.println("today : "+today);
		
		
		if(today == Week.SUNDAY) {
			System.out.println("휴일");
		}else {
			System.out.println("공부날");
		}
	}
}
