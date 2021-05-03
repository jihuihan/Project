package com.javaex.basics;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithOperEx();
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
