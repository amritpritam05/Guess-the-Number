import java.util.Random;
import java.util.Scanner;

class Guess
{
	public Guess(int x,int y,int i)
	{
		
		if(y==x)
			{
			System.out.println("Congratulations you won this game in"+" "+i+" "+"chance");
				System.exit(i);
			}
		else if(y>x)
		{
			System.out.println("The computer number is greater");
		}
		else 
		{
			System.out.println("The computer number is smaller");
		}
	}
}

public class Challege_Accepted {

	public static void main(String[] args) {
		
		Random r=new Random();
		int r1=r.nextInt(100);
		Guess su[]=new Guess[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("You have only Eight guesses");
		for(int i=1;i<=8;i++)
		{	
				int a=8-i;
				System.out.println();
				System.out.println("Enter the number For "+i+ " "+"guess and your"+" "+a+" "+" guess remaining");
				int num=sc.nextInt();
				su[i]= new Guess(num,r1,i);			
		}
		System.out.println("Opps!! you lose this game");
		System.out.println("The Computer Number is:"+r1);	
	}
}
