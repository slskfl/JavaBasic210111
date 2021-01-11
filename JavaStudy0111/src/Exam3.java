
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "자바 프로그래밍";
		int index = str1.indexOf("프로그래밍");
		System.out.println(index);
		
		if(str1.indexOf("자바")!=-1) {
			System.out.println("문자열을 찾았습니다.");
		}else {
			System.out.println("찾는 문자열이 없습니다.");
		}

	}

}
