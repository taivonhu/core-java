package baitap;

import java.util.Scanner;
public class baitapso22 {
	
	 public static void main(String[] args) 
	 {
	  Scanner sc = new Scanner(System.in);
	  long sonhiphan, sothapphan = 0, j = 1, remainder;
	  System.out.print("Nhap mot so nhi phan: ");
	sonhiphan = sc.nextLong();

	  while (sonhiphan != 0) 
	  {
	   remainder =sonhiphan % 10;
	   sothapphan =  sothapphan  + remainder * j;
	   j = j * 2;
	   sonhiphan = sonhiphan / 10;
	  }
	  System.out.println("Số thập phân: " + sothapphan);
	 }
	}