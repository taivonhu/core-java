package baitap;

public class baitapso17 {

	public baitapso17() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =100010;
		int b=110010;
		int r,i=0;
		int x=0,y=0;
		while(a>0)
		{
		r=a%10;
		x=x+r*(int)(Math.pow(2,i));
		a=a/10;
		i++;
		}
		i=0;
		r=0;;
		while(b>0)
		{
		r=b%10;
		y=y+r*(int)(Math.pow(2,i));
		b=b/10;
		i++;
		}

		int res=x+y;

		r=0;
		i=0;
		while(res>0)
		{
		int z=res%2;
		r=r+z*(int)Math.pow(10,i);
		res=res/2; 
		i++;
		}
		System.out.println("addition of two binary number=="+r);
	}

}
