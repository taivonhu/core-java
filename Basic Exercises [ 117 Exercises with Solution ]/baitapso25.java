package baitap;

import java.util.Scanner;

public class baitapso25 {
 
public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     long octal_num, decimal_num = 0;
     int i = 0;
     System.out.print("Nhập số bát phân: ");
    octal_num = in.nextLong();
    while (octal_num != 0) 
     {
      decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
      octal_num = octal_num / 10;
     }
    System.out.print("Số thập phân tương dương: " + decimal_num+"\n");
   }
}