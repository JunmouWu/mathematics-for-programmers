package ������java;
import java.math.BigInteger;

public class Lesson1_3 {
	

	 public static void main(String[] args) {

	      int a = 53;
	      int b = 35;

	      System.out.println(String.format("����%d(%s)������%d(%s)�İ�λ���򡯽����%d(%s)",
	            a, Lesson_1.decimalToBinary(a), b, Lesson_1.decimalToBinary(b), or(a, b), Lesson_1.decimalToBinary( or(a, b) ))); //��ȡʮ������53��35�İ�λ����     

	      System.out.println(String.format("����%d(%s)������%d(%s)�İ�λ���롯�����%d(%s)",
	            a, Lesson_1.decimalToBinary(a), b, Lesson_1.decimalToBinary(b), and(a, b), Lesson_1.decimalToBinary( and(a, b) )));  //��ȡʮ������53��35�İ�λ���롱     

	      System.out.println(String.format("����%d(%s)������%d(%s)�İ�λ����򡯽����%d(%s)",
	            a, Lesson_1.decimalToBinary(a), a, Lesson_1.decimalToBinary(a), xor(a, a), Lesson_1.decimalToBinary( xor(a, a) )));  //��ȡʮ������53��35�İ�λ�����     

	   } 


	
	/**
	 * �����ư�λ���������
	 * num1-��һ�����֣� num2-�ڶ�������
	 * return �����ư�λ"��"�Ľ��*/
	public static int or( int num1, int num2) {
		return ( num1 | num2 );
	}
	
	/**
	 * �����ư�λ���������
	 * num1-��һ�����֣� num2-�ڶ�������
	 * return �����ư�λ"��"�Ľ��*/
	public static int and( int num1, int num2 ) {
		return ( num1 & num2);
	}
	
	/**
	 * �����ư�λ����������
	 * num1-��һ�����֣� num2-�ڶ�������
	 * return �����ư�λ"���"�Ľ��*/
	public static int xor( int num1, int num2 ) {
		return ( num1 ^ num2 );
	}
}
