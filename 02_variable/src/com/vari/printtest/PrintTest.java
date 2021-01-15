package com.vari.printtest;

public class PrintTest {
	public static void main(String[] args) {
		//System.out.print�� System.out.println�� ����
		
		String name = "������";
		int age = 19;
		double height = 180.5;
		double weight = 65.5;
		char gender = 'M';
		
		//print�޼ҵ� Ȱ��
		System.out.print(name);
		System.out.print(age);
		System.out.print(height);
		System.out.print(weight);
		System.out.print(gender);
		
		//���� ģ �Ͱ� ����, ���� ���� �����ϰ� ���� ��
		System.out.println();
		
		//println�޼ҵ� Ȱ��
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(gender);
		
		//printf �̿��Ͽ� ����ϱ�
		//'�̸��� name�������Դϴ�.' ����ϱ�
		System.out.println("�̸��� "+name+"�Դϴ�.");
		System.out.printf("�̸��� %s�Դϴ�.", name);
		System.out.printf("�̸��� %s�Դϴ�.", 19);//19�� ���ڿ��� �ڵ�����ȯ
		//System.out.printf("�̸��� %d�Դϴ�.", name);//name�� String, d�� �������̹Ƿ� Ÿ���� ���� ����
		
		System.out.printf("�̸��� %s�̰�, ���̴� %d�Դϴ�", name, age);
		System.out.println();
		
		//printf �޼ҵ�� ���� ����, �Ҽ��� �ڸ��� ǥ���� ���� �� �� ����
		System.out.println("������ 19");
		System.out.println("���� 20");
		System.out.println("�忬�� 21");
		System.out.println();
		
		//printf�� �̿��� ����
		System.out.printf("%5s %d \n", "������", 19);
		System.out.printf("%5s %d \n", "����", 20);
		System.out.printf("%5s %d \n", "�忬��", 21);
		System.out.println();
		
		System.out.printf("%-5s %d \n", "������", 19);
		System.out.printf("%-5s %d \n", "����", 20);
		System.out.printf("%-5s %d \n", "�忬��", 21);
		System.out.println();
		
		//�Ҽ��� ǥ�ÿ� ���� ������ �� ����
		System.out.printf("%f\n", height);//�Ҽ��� �Ʒ� 6�ڸ����� ���
		System.out.printf("%.2f\n", height);//�Ҽ��� �Ʒ� 2�ڸ� ���� ���
		
		//Q. �����Ը� �Ҽ��� 3�ڸ����� ����غ��ÿ�.
		System.out.printf("%.3f\n", weight);
		
		//Q. ���� OOO�̰�, ���̴� OO�̰�, ������ O, Ű�� OOO.OO, �����Դ� OO.O�Դϴ�.
		System.out.printf("���� %s�̰�, ���̴� %d�̰�, ������ %c, Ű�� %.2f, �����Դ� %.1f�Դϴ�.\n", name, age, gender, height, weight);
		
		//Q. ���� OOO�̰�, ���̴� OO�̰�,
		//   ������ O, Ű�� OOO.OO, �����Դ� OO.O�Դϴ�.
		System.out.printf("���� %s�̰�, ���̴� %d�̰�,\n������ %c, Ű�� %.2f, �����Դ� %.1f�Դϴ�.\n", name, age, gender, height, weight);
		
		
		//escape���� ���� �˾ƺ���
		//���ڿ����� Ư������� �����ϴ� ����
		
		//\t tab
		String msg = "�ȳ��ϼ���";
		System.out.println(msg);
		msg = "�ȳ�\t�ϼ���";
		System.out.println(msg);
		msg = "�ȳ�\t\t�ϼ���";
		System.out.println(msg);
		
		//\n new line
		msg  = "������ ������ \n���ְ� �Ծ�����?";
		System.out.println(msg);
		
		//\" ū ����ǥ
		msg = "\"�� �� �ȹٷ� ��!\"��� ���ߴ�.";
		System.out.println(msg);
		
		//
		String path = "c:\\Users\\user1";
		
	}

}
