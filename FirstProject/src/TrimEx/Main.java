package TrimEx;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trim은 양끝에 있는 공백만 제거
		
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "  45   67  ";
		System.out.println(tel1+tel2+tel3);
		System.out.println(tel1.trim()+tel2.trim()+tel3.trim());

	}

}
