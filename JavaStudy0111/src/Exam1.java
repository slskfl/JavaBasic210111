
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("���̾�");
		String str2 = "���̾�";
		 
		if(str1 == str2) {
			System.out.println("���� String ��ü�� �����մϴ�.");
		}else {
			System.out.println("�ٸ� String ��ü�� �����մϴ�.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ��� �����ϴ�.");
		}else {
			System.out.println("�ٸ� ���ڿ��� �����ϴ�.");
		}

	}

}
