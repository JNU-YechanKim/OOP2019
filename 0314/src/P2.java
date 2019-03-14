import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2, x3, y3, x4, y4;
		
		System.out.print("(x1, y1) 입력: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		
		System.out.print("(x2, y2) 입력: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		System.out.print("(x3, y3) 입력: ");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		
		x4 = x1 ^ x2 ^ x3;
		y4 = y1 ^ y2 ^ y3;
		
		System.out.println("(x4, y4)는 (" + x4 + "," + y4 + ")입니다.");
	}
}
