package com.vari.dateover;

public class DataOverflow {
	
	public static void main (String[] args) {
		//������ �����÷ο� Ȯ���ϱ�
		
		byte bnum = 125;
		//bnum++ : bnum������ ���� 1 ������Ű�� ������
		//System.out.println(++bnum);//126
		//System.out.println(++bnum);//127
		//System.out.println(++bnum);//-128 -> byte�� 127���� �ۿ� ǥ���� �� �����Ƿ� -128�� ���ƿ� ()
		//System.out.println(++bnum);//-127
		
		//int bnum = 125;
		//bnum++ : bnum������ ���� 1 ������Ű�� ������
		System.out.println(++bnum);//126
		System.out.println(++bnum);//127
		System.out.println(++bnum);//128 -> �ڷ����� int�� �ٲٴ� ���� ���������� �� ����, why? ������ 127�� �ξ� �ʰ��ϱ� ����
		System.out.println(++bnum);//129
		
		for(int i=0; i<100; i++){
				System.out.println(++bnum); //bnum�� byte Ÿ������ �������� �� �������� �ȿ��� ���� �ݺ��Ǵ� ���� Ȯ���� �� ����
		}
		//SO! ���� �� �̻��� ���� ���� ���� ��������� ������ ���̹Ƿ� Ÿ���� �ٲ�����
		
	}

}
