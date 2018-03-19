package baitap;

import java.util.Scanner;

public class baitapso27 {
public static void main(String args[])
    {
        String octal_num, hex_num;
        int decnum;
        Scanner in = new Scanner(System.in);
		
        System.out.print("Nhập số bát phân: ");
        octal_num = in.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("Số thập lục phân tương đương: "+ hex_num+"\n");
     }
}
