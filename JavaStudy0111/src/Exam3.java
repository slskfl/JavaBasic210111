
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ڹ� ���α׷���";
		int index = str1.indexOf("���α׷���");
		System.out.println(index);
		
		if(str1.indexOf("�ڹ�")!=-1) {
			System.out.println("���ڿ��� ã�ҽ��ϴ�.");
		}else {
			System.out.println("ã�� ���ڿ��� �����ϴ�.");
		}

	}

}
