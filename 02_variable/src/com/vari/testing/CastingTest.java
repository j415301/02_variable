package com.vari.testing;

public class CastingTest {
	public static void main (String[] args) {
		//�ڷ�����ȯ �˾ƺ���
		//�ڵ�����ȯ�� �ڷ��� ũ�Ⱑ ���� �ڷ������� ū �ڷ������� ������ �� �� ����
		
		//byte bnum = 200;
		byte bnum = 100;
		System.out.println(bnum);//->100, �ڵ�����ȯ
		
		long lnum = 10000;//10000�� int�̹Ƿ� longŸ������ �ڵ�����ȯ�Ǿ� ������ ���� ����
		
		System.out.println(3.14+100);//3.14�� double, 100�� int�̹Ƿ� 100�� double�� �ڵ�����ȯ�Ǿ� �������� ��µ�
		
		String msg = "������ "+19+"��";//19�� String���� �ڵ�����ȯ �Ǿ� ����
		System.out.println(msg);
		
		//�ڵ�����ȯ(������)�� Ư����
		//�⺻������ ������꿡 ���� ���� int������ ó���� ��
		byte bnum1 = 100;
		byte bnum2 = 10;
		//byte result = bnum1 + bnum2;//byte�� ������ int������ ó���� �Ǿ� ������ ��
		byte result = (byte) (bnum1 + bnum2); //(byte) bnum1 + bnum2�� ���� �ʴ� ������ ���� �켱������ ���� bnum1�� byte�� �ٲ�� bnum2�� ��� int���� �ǹǷ� ������ ������
		
		int num1= 100;
		double dnum = 180.5;
		//int result1 = num1 + dnum; //dnum ������ double�� �Ǿ� int�� �ڷ����� ���Ե��� �ʾ� ������ ��
		int result1 = (int)(num1+dnum);//280
		result1 = num1 + (int)dnum;//280, �� �ڵ�� ���� ����� ����
		
		
		//ū �ڷ������� ���� �ڷ������� �����ϴ� ����? ���� ����ȯ
		//���� ���� �������� �ս��� �Ͼ
		
		double weight = 65.5;//8byte
		int weightInt;//4byte
		
		//������ ����ȯ ��� -> ����, ���ͷ� �տ�(����) (��ȯ�� �ڷ���)������|���ͷ�
		weightInt = (int)weight;//����: weightInt, ���ͷ�: weight
		System.out.println("��ȯ�� �� : "+weightInt);//65
		System.out.println("������ : "+weight);//65.5
		//���� ��ȯ�� ���ͷ��� ����. ������ ����ȯ�� �Ұ�����. -> (double)weightInt = weight �ȵ�!!!!!!!
		
		//������ �ս� �߻���Ȳ
		int num = 290;
		bnum = (byte)num;
		System.out.println("������ : "+num);//290
		System.out.println("��ȯ�� �� : "+bnum);//34
		
		//char���� ���� �ڷ��� ��ȯ
		//�����ڵ�: ���ڿ� ���ڸ� ���ν��ѳ��� �ڵ�
		char ch = 'A';//2byte
		int alpha = ch;//���� ����, char�� ���������� ����� ����
		System.out.println(alpha);//65
		System.out.println((char)alpha);//A
		//char ch2 = ch + 1; //1 ������ ch�� int�� �ٲ�Ƿ� char �ȿ� ������ �ȵǼ� ������ ��
		char ch2 = (char)(ch + 1);
		System.out.println(ch2);
		
	}

}
