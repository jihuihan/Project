package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithOperEx();
		//logicOper();
		bitOper();
	}
	
	//비트연산자
	//비트단위로 미세한 조작이 필요할 때 사용
	//하드웨어 제어, 이미지 프로세싱
	private static void bitOper() {
		byte b1=0b1101;
		byte b2=0b1111;
		
		System.out.println("b1"+Integer.toBinaryString(b1));
		System.out.println("b1"+Integer.toBinaryString(b2));
		int result= b1 & b2;//비트 논리 곱 :둘다 1이어야 1비트로 세팅
		System.out.println("b1&b2:"+Integer.toBinaryString(result));
		result=b1 |b2;
		System.out.println("b1|b2:"+Integer.toBinaryString(result));
		result=~b1;//비트 논리 부정 :1<->0
		System.out.println("~b1:"+Integer.toBinaryString(result));
	}
	//비교연산,논리연산
	//결과로boolean반환, 논리값으로 프로그램의 흐름제어->중요
	private static void logicOper() {
		int n1 =7;
		int n2=3;
		
		System.out.println("a와 b가 같은가?"+(n1==n2));
		System.out.println("a와 b가 같지않은가?"+(n1!=n2));
		
		//논리 연산
		//집합을 떠올리자
		
		int n3=5;
		
		boolean r1=n3>0;
		boolean r2=n3<10;
		boolean r1andr2=r1&&r2;
		System.out.println("n3가 0초과 10미만 영역에 있는가?"+r1andr2);
		
		r1=n3<=0;
		r2=n3>=10;
		boolean r1orr2=r1||r2;
		System.out.println("n3가 0이하거나 n3가 10이상의 영역?"+r1orr2);
		
		boolean rNot= n3>0&&n3<10;//여집합 영역
		System.out.println(rNot);
		
		
		
		
	}
	private static void arithOperEx() {
		int a =7;
		int b =3;
		
		//부호 연산자:+,-
		System.out.println(-a);//a*-1
		
		//사칙연산 +,-,*,/
		System.out.println(a+"/"+b+"="+(a/b));//정수 나눗셈의 몫
		System.out.println("a를 b로 나눈 나머지"+(a%b));//정수 나눗셈의 나머지
		
		//실제 나눗셈의 결과는?
		System.out.println((float)a/(float)b);//int->float형 변환
		System.out.println((float)a/b);//b는 flat로 형변환
		
		System.out.println("--------------------------------------");
		//증감 연산자++,--
		//위치에 따라 연산순서가 달라진다.
		a=7;
		System.out.println("a"+a);
		System.out.println("전위 증감연산:"+(++a));
		System.out.println("최종 a:"+a);
		
		a=7;
		System.out.println("a"+a);
		System.out.println("후위 증감연산:"+(a++));
		System.out.println("최종 a:"+a);
		
		//나눗셈 보충
		a=7;
		//System.out.println(a/0);//정수를 0으로 나누면 ArithmeticException
		System.err.println((float)a/0);//Infinity
		
		//Infinity가 포함된 연산식은 항상 infinity이다.
		//infinity의 체크
		System.out.println("7.0/0은 유한수인가?"+Double.isFinite(7.0/0));
		
		System.out.println("0.0/0.0?"+(0.0/0.0));//not a number
		//NaN가 포함된 연산식->NaN:연산 불가의 의미
		System.out.println("0.0/0.0 is NaN?"+Double.isNaN(0.0/0.0));
		System.out.println(0.0/0.0+10);
		
		
	}
}
