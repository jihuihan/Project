package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithOperEx();
		//logicOper();
		bitOper();
	}
	
	//��Ʈ������
	//��Ʈ������ �̼��� ������ �ʿ��� �� ���
	//�ϵ���� ����, �̹��� ���μ���
	private static void bitOper() {
		byte b1=0b1101;
		byte b2=0b1111;
		
		System.out.println("b1"+Integer.toBinaryString(b1));
		System.out.println("b1"+Integer.toBinaryString(b2));
		int result= b1 & b2;//��Ʈ �� �� :�Ѵ� 1�̾�� 1��Ʈ�� ����
		System.out.println("b1&b2:"+Integer.toBinaryString(result));
		result=b1 |b2;
		System.out.println("b1|b2:"+Integer.toBinaryString(result));
		result=~b1;//��Ʈ �� ���� :1<->0
		System.out.println("~b1:"+Integer.toBinaryString(result));
	}
	//�񱳿���,������
	//�����boolean��ȯ, �������� ���α׷��� �帧����->�߿�
	private static void logicOper() {
		int n1 =7;
		int n2=3;
		
		System.out.println("a�� b�� ������?"+(n1==n2));
		System.out.println("a�� b�� ����������?"+(n1!=n2));
		
		//�� ����
		//������ ���ø���
		
		int n3=5;
		
		boolean r1=n3>0;
		boolean r2=n3<10;
		boolean r1andr2=r1&&r2;
		System.out.println("n3�� 0�ʰ� 10�̸� ������ �ִ°�?"+r1andr2);
		
		r1=n3<=0;
		r2=n3>=10;
		boolean r1orr2=r1||r2;
		System.out.println("n3�� 0���ϰų� n3�� 10�̻��� ����?"+r1orr2);
		
		boolean rNot= n3>0&&n3<10;//������ ����
		System.out.println(rNot);
		
		
		
		
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
