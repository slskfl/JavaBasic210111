
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("라이언");
		String str2 = "라이언";
		 
		if(str1 == str2) {
			System.out.println("같은 String 객체를 참조합니다.");
		}else {
			System.out.println("다른 String 객체를 참조합니다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가집니다.");
		}else {
			System.out.println("다른 문자열을 가집니다.");
		}

	}

}
