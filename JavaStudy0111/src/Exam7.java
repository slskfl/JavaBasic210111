
public class Exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ssn = "123456-2234567";
		char gender = ssn.charAt(7);
		
		switch(gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}

	}

}
