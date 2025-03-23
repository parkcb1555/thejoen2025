package DateEx;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		String strnow1 = now.toString();
		System.out.println(strnow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
		
	}

}
