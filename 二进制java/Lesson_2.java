package ������java;
import java.math.BigInteger;

public class Lesson_2 {
	
	public static void main( String[] args ) {
		int num = 53;
		int m = 1;
		System.out.println( String.format( "����%d�Ķ�����������%dλ��%d" , num, m, leftShift( num, m ) ) ); //����������λ
		System.out.println( String.format( "����%d�Ķ�����������%dλ��%d" , num, m, rightShift( num, m ) ) ); //����������λ
		
		System.out.println();
		m = 3;
		System.out.println( String.format( "����%d�Ķ�����������%dλ��%d" , num, m, leftShift( num, m ) ) ); //����������λ
		System.out.println( String.format( "����%d�Ķ�����������%dλ��%d" , num, m, rightShift( num, m ) ) ); //����������λ
		
}
	
	/**������λ
	 * num-�ȴ���λ��ʮ������
	 * return int-��λ��ĵ�ʮ������
	 * */
	public static int leftShift( int num, int m) {
		return num << m;
	}
	
	/**������λ
	 * num-�ȴ���λ��ʮ������
	 * return int-��λ��ĵ�ʮ������
	 * */
	public static int rightShift( int num, int m) {
		return num >>> m;
		
		
	}
}
