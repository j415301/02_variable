//�⺻���� ���� �����غ���!

package com.vari.basic;

public class BasicVariable {
	
	public static void main(String[] args) {
		//���� �����ϱ� -> ���� ���� Ȯ���ϱ�
		//���� ���� ���: �ڷ��� ������;
		
		//true or false�� �����ϴ� ������� Ȯ���ϱ�
		boolean flag;
		//���� ��Ī ���� �� ���Ѿ��� �Ծ�
		//1. ��ҹ��� ������ �ǰ� ���� ������ ����
		//2. ����� ��� �Ұ�
		//3. ���ڷ� �����ϸ� �ȵ�
		//4. Ư�����ڴ� _�� $�� ���
		//5. ���� �ܾ� ������ �ۼ� �� ù ���ڴ� ������ �ҹ���, �� �ڷ� �̾����� �ܾ��� ù���ڴ� �빮�ڷ� �ۼ�->camelcase(��Ÿ��ǥ���)
		//6. ������ ���� �����͸� ������ �� �ֵ��� ���
		//7. ������ �ѱ��� �� �� ������, ����������!
		
		//���� ���� �� ���ǻ���
		//������ ���� �������� ������ �������� ������ �ȵ�!! ������ �ߺ� �Ұ�
		
		//������ �� �����ϱ�: ���� ������ '=' �̿�
		//               ������ = ������ ��
		int mathRecord;
		mathRecord = 100;
		System.out.println(mathRecord);
		
		mathRecord = 85;
		System.out.println(mathRecord);
		
		//����(����) �̿��� ���� �����Ϸ��� ��� �ؾ��ұ�?
		//����
		flag = true;
		flag = false;
		
		//������
		char gender;
		gender = '��'; //������ �����ʹ� ''���� ǥ��
		
		String email;
		email = "j415301@naver.com"; //���ڿ��� �����ʹ� ""�� ǥ��
				
		//�Ǽ���
		double height;
		height = 165.5;
		
		float weight;
		weight = 41.5f; //float �����ʹ� �ڿ� f�� �ٿ��� ��
		//��ǻ�Ϳ��� ������ ���� �ݵ�� ���� �ڷ����̾�� ��
		
		//������
		
		byte anum;
		short bnum;
		int cnum;
		long longNum;
		longNum = 100; //�ڵ�����ȯ�� ��
		longNum = 100000000000L; // ���� int�� ������ �Ѿ����Ƿ� �ڵ�����ȯ�� ���� ����. ���� longŸ������ �ڷḦ �Է������ �ϸ� �ڿ� 'L'�� �ٿ��� ��
		
		//*����
		//���ڿ����ͷ�: "���ڿ�"
		//���ڸ��ͷ�: '����'
		//�������ͷ�: ����
		//���� long: ����L(�빮�� -> ���� 1�� ���� �����ϱ� ����)
		//�Ǽ� float: ����.����f
		//�Ǽ� double : ����.����
		
		//���� ����� ���ÿ� �ʱ�ȭ: ���� ������ Ȯ���� ���ÿ� ���� �Է��ϴ� ��
		int a = 100;
		String name = "������";
		
		//���� ������ ����� ���ÿ� �ʱ�ȭ �ϱ�
		char alpha = 'a', beta = 'b', ceta = 'c';
		
		//���ڿ��� ���� �߰��н�
		//���ڿ�: Ŭ����(��ü)
		String nickname = "����";
		System.out.println(nickname);
		//-> String ����� ���ÿ� �ʱ�ȭ �� �� �ִ� �Ǵٸ� ���
		String nickname1=new String("����");
		System.out.println(nickname1);
		//���ڿ��� +������ ���� -> "����"+"����" -> "���¼���" (�� ���� ���ڿ��� ���ս�Ŵ)
		System.out.println("��"+"���½ð�");
		String msg = "������ "+"�ݿ���";
		System.out.println(msg);
		
		//������+������ -> ��� ����
		System.out.println(nickname+msg);
		msg = "�ڵ�";
		System.out.println(nickname+msg);
		
		//���ڿ�+���� -> ���ڿ��� �ϳ��� ������ ��� �ڷ����� ���ڿ��� �ٲ�� ��µ�
		System.out.println("�̰� �Ǵ�?"+19);
		System.out.println("�̰�?"+true);
		
		System.out.println(gender+email+height+weight); //gender�� ������, ���ڿ��� email�� ��� �ڷ����� ���ڿ��� �ٲ�
		System.out.println(height+gender+email+weight); //���ڿ��� email �ڿ� �ִ� weight�� ���ڿ��� �ٲ��, email �տ� �ִ� height�� �ٲ��� ����.
		
		System.out.println(gender+email+(height+weight)); //height+weight�� �켱 ������ �ο��� ���ϱ� ������ �� �� ��µ�
		
		//��� ���ڿ��� ����� �� �ִ� �� �ٸ� ���
		System.out.println(""+height+gender+email+weight);
		System.out.println(height+(weight+email)+gender);
		
		System.out.println(height+gender);//char�� double�� �ڵ� ����ȯ��
		
		
		//���: ������ �� ���� �������
		final String admin;
		admin="master";
		System.out.println(admin);
		//admin="notmaster"; //�̹� ���� �Ҵ�Ǿ��ٰ� �����޼����� ��
	}
	
//Q. ������Ʈ�� ���� �����ؼ� com.homework.main ��Ű���� ����� HomeworkŬ������ ����, ����, ����, �ּ�, Ű, �����Ը� ������ �����ϰ� ����غ�����!
//���������� ����ϰ�, ���ٿ� ��� �����͸� ����ϼ���!

}
