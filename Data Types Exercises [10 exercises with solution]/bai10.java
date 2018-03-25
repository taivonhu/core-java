import java.util.Scanner;

public class bai10 {

	public static void main(String[] args) {
		int num, n1, n2, n3, n4, n5, n6;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input six non-negative number digits: ");
		num = sc.nextInt();
		n6 = num % 10;
		n5 = num / 10 % 10;
		n4 = num / 100 % 10;
		n3 = num / 1000 % 10;
		n2 = num / 10000 % 10;
		n1 = num / 100000 % 10;
		System.out.println(n1 + "|" + n2 + "|" + n3 + "|" + n4 + "|" + n5 + "|" + n6);
	}

}