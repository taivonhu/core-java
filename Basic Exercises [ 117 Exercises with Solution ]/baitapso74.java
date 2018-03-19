package baitaptieptheo;

import java.util.Scanner;

public class baitapso74 {

public static Scanner scan = new Scanner(System.in);

public static void main(String[] ars) {

//System.out.println("enter numb er of elements\");"

int n = scan.nextInt();
if (n < 2) {
System.out.println("array must be longer than one element");
}
else {
int arr[] = new int[n];
System.out.println("enter elements");
for (int i = 0; i < n; i++) {
arr[i] = scan.nextInt();
}
System.out.println("");
System.out.println(arr[0] == 10 || arr[arr.length - 1] == 10);
}
}
}