
public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 프로그래밍";
		int length = str1.length();
		System.out.println(length);
		
		String phone = "01012345678";
		length = phone.length();
		if(length==11) {
			System.out.println("핸드폰 자리수가 맞습니다.");
		}else {
			System.out.println("핸드폰 자리수가 틀립니다.");
		}

	}

}
