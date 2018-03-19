package baitap;
import java.util.Scanner;
public class baitaoso20 {
      public static void main(String args[])
    {
        int dec_num, rem;
        String hexdec_num="";
        
        /* hexadecimal number digits */
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Nhập một số thập phân: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Số thập lục phân là: "+hexdec_num+"\n");    
	        {
	            rem = dec_num%16;
	            hexdec_num = hex[rem] + hexdec_num;
	            dec_num = dec_num/16;
	        }
	        System.out.print("Nhap một số thập phân : "+hexdec_num+"\n");       
	}

}
