package com.vari.printtest;

import java.util.Scanner;//import ��ġ ���!!!
//1. java.util.Scanner�� import ��

public class InputTest {
	//Ű���忡�� �Է��� �� ��������
	
	public static void main(String[] args) {
		//Ű���忡�� �Է��� �� RAM�� �����ϱ�
		//: �ڹٿ��� �����ϴ� Scanner Ŭ���� �̿�
		//Scanner Ŭ������ java.util��Ű���� ���� ����
		
		//2. Ŭ������ ����Ϸ��� �ݵ��!!!!!!!! new �����ڸ� �̿��ؼ� ����
		//����: new Ŭ������() -> ex. new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		//Scanner: ������ �ڷ���, sc: ����

		//3. Scanner�� �����ϴ� ���(�żҵ�)�� �̿��ؼ� Ű������ �Է°��� �����´�.
		//���: nextInt(), nextDouble(), next(), nextLint() ��
		//	1. nextInt(): int Ÿ���� ���� �������� ���
		//	2. nextDouble(): double Ÿ���� ���� ������ ���
		//	3. next(): ���ڿ��� '���� ��������' �������� ���, ���� �տ� ���ڿ��� ������
		//	4. nextLine(): ���ڿ��� '���� ��������' �������� ���, ���� ���� ���ڿ��� ������
		
		System.out.print("����� ���̴�? ");//����ڿ��� ���̸� �Է¹ޱ� ���� ����
		int age = sc.nextInt();
		System.out.println("�Է°� : "+age);//���� �Է� ���� ��
		//����(ex. 19)�� �Է����� �� -> �� �۵���
		//�Ǽ�(ex. 19.1�� �Է����� �� -> runtime error(���� Exception~) why? int �ڷ����� �Ǽ��� �Է��߱� ����
		System.out.print("����� Ű��? ");
		double height = sc.nextDouble();//�Ǽ� �Է� ���� ��
		System.out.println("�Է°�: "+height);
		
		//���ڿ� �Է¹ޱ�
		System.out.print("����� �ּ� ");
		String name = sc.next();
		sc.nextLine();//buffer�� ����ִ� �ڵ�
		System.out.println("next(): "+name);
		System.out.print("����� �ּ� ");
		name=sc.nextLine();
		System.out.println("nextLine(): "+name);
		
		//����, �Ǽ�, ����(next())�� �Է¹ް� nextLine()�� �Է¹��� ��� �ݵ�� *buffer*�� ������ ��
		//System.out.println("����� ���̴�? ");
		//int age1 = sc.nextInt();
		//System.out.println("����� �ּҴ�? ");
		//String addr = sc.nextLine();
		//System.out.println("����: "+age1+", �ּ�: "+addr);
		//�� ��쿡 ���̸� �Է��ϰ� ���͸� ġ�� �ٷ� ������ ��¹�(����:,�ּ�:)�� �Ѿ�� ���� �� �� �ִµ� �̰��� ���̸� �Է¹��� �� buffer�� �����ִ� \n�� ���� '����� �ּҴ�?'�� �̾����� ��¹��� �׳� �Ѿ����
		//�̸� �����ϱ� ���� ���������ϴ� �ڵ尡 �ٷ� sc.nextLine()
		
		System.out.println("����� ���̴�? ");
		int age1 = sc.nextInt();
		sc.nextLine();
		System.out.println("����� �ּҴ�? ");
		String addr = sc.nextLine();
		System.out.println("����: "+age1+", �ּ�: "+addr);
		//sc.nextLine()�ڵ带 nextLine�żҵ� ��� ���� �־������ �Ʊ�� ���� ������ �߻����� ������ Ȯ���� �� ����
		
		
		
	}	

}
