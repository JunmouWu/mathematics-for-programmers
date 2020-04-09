package 二进制java;
import java.math.BigInteger;

public class Lesson_2 {
	
	public static void main( String[] args ) {
		int num = 53;
		int m = 1;
		System.out.println( String.format( "数字%d的二进制向左移%d位是%d" , num, m, leftShift( num, m ) ) ); //测试向左移位
		System.out.println( String.format( "数字%d的二进制向右移%d位是%d" , num, m, rightShift( num, m ) ) ); //测试向右移位
		
		System.out.println();
		m = 3;
		System.out.println( String.format( "数字%d的二进制向左移%d位是%d" , num, m, leftShift( num, m ) ) ); //测试向左移位
		System.out.println( String.format( "数字%d的二进制向右移%d位是%d" , num, m, rightShift( num, m ) ) ); //测试向右移位
		
}
	
	/**向左移位
	 * num-等待移位的十进制数
	 * return int-移位后的的十进制数
	 * */
	public static int leftShift( int num, int m) {
		return num << m;
	}
	
	/**向左移位
	 * num-等待移位的十进制数
	 * return int-移位后的的十进制数
	 * */
	public static int rightShift( int num, int m) {
		return num >>> m;
		
		
	}
}
