import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		double inch, meter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a value for inch: ");
		inch = sc.nextInt();
		meter = inch * 0.0254;
		System.out.println(inch + " Inches = " + meter + " Meter");
	}
}