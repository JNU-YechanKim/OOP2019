import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("�Է�: ");
		x = sc.nextInt();
		
		if (x == 0) {
			System.out.println("0�Դϴ�.");
		} else {
			if (( x & (1 << 31) ) == 0) {
				System.out.println("����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		}
		
//		1 << 31;
//		000000000000000000000  .. 101
//	&	1000000000000000000000 .. 000
//	====================================
//		00000000000000000000000000000
//		
//		11111111111111111111   .. 001
//	&	1000000000000000000000 .. 000
//	===================================
//		10000000000000000000000000000
	}
}
