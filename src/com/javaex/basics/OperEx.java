package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithOperEx();
	}
	private static void arithOperEx() {
		int a =7;
		int b =3;
		
		//��ȣ ������:+,-
		System.out.println(-a);//a*-1
		
		//��Ģ���� +,-,*,/
		System.out.println(a+"/"+b+"="+(a/b));//���� �������� ��
		System.out.println("a�� b�� ���� ������"+(a%b));//���� �������� ������
		
		//���� �������� �����?
		System.out.println((float)a/(float)b);//int->float�� ��ȯ
		System.out.println((float)a/b);//b�� flat�� ����ȯ
		
		System.out.println("--------------------------------------");
		//���� ������++,--
		//��ġ�� ���� ��������� �޶�����.
		a=7;
		System.out.println("a"+a);
		System.out.println("���� ��������:"+(++a));
		System.out.println("���� a:"+a);
		
		a=7;
		System.out.println("a"+a);
		System.out.println("���� ��������:"+(a++));
		System.out.println("���� a:"+a);
		
		//������ ����
		a=7;
		//System.out.println(a/0);//������ 0���� ������ ArithmeticException
		System.err.println((float)a/0);//Infinity
		
		//Infinity�� ���Ե� ������� �׻� infinity�̴�.
		//infinity�� üũ
		System.out.println("7.0/0�� ���Ѽ��ΰ�?"+Double.isFinite(7.0/0));
		
		System.out.println("0.0/0.0?"+(0.0/0.0));//not a number
		//NaN�� ���Ե� �����->NaN:���� �Ұ��� �ǹ�
		System.out.println("0.0/0.0 is NaN?"+Double.isNaN(0.0/0.0));
		System.out.println(0.0/0.0+10);
		
	}
}
