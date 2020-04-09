package ������java;
import java.math.BigInteger;

public class Lesson_1 {
	
	public static void main( String[] args ) {
		int a = 53;
		String b = "110101";
		System.out.println( String.format( "��ѧ%d�Ķ�������%s", a, decimalToBinary( a ))); //��ȡʮ������53�Ķ�������
		System.out.println( String.format( "��ѧ%s�Ķ�������%d", b, binaryToDecimal( b ))); //��ȡ��������110101��ʮ������
	}
	
	/*ʮ����ת���ɶ�����*/
	public static String decimalToBinary( int decimalSource ) {
		BigInteger bi = new BigInteger( String.valueOf( decimalSource ) ); //ת����BigInteger���ͣ�Ĭ����ʮ����
		return bi.toString( 2 ); //����2ָ������ת���ɶ�����
	}
	
	/*������ת����ʮ����*/
	public static int binaryToDecimal( String binarySource ) {
		BigInteger bi = new BigInteger( binarySource, 2 ); //ת����BigInteger����,����2ָ�����Ƕ�����
		return Integer.parseInt( bi.toString() ); //Ĭ��ת����ʮ����
	}
}


