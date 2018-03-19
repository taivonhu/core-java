package baitaptieptheo;

import java.util.Scanner;
class Asciicode{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a character:");
char c=sc.next().charAt(0);
int d=(int)c;
System.out.println("the Asciicode of"+c+"is:"+d);
}}