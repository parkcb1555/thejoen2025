package CalanderEx;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.println(day+"일");
	
		int ampm = cal.get(Calendar.AM_PM);
		String strampm = null;
		if(ampm==Calendar.AM) {
			strampm = "오전";
		}else{
			strampm = "오후";
		}
		
		System.out.print(strampm+" ");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.print(hour+"시 ");
		System.out.print(min+"분 ");
		System.out.println(sec+"초 ");
		
	}

}
