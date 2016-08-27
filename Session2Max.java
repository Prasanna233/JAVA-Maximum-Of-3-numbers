import java.util.Scanner;


public class Session2Max {
	
	public static void main(String args[])
	{
		int a,b,c;
		
		System.out.println("Enter Three Integer numbers");
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		

		if(a>b && a>c)
		{
			System.out.println("a is biggest");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("b is biggest");
			
		}
		else
		{
			System.out.println("c is biggest");
			
			
		}
	}

}
