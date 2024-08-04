//Print the numbers from 1 to n using for-loop, while-loop and do-while-loop
class Loops 
{
	public static void main(String[] args) 
	{
		int n=100;
		int number=1;
		int num=1;
		for (int i=0;i<=n ;i++ )
		{
			System.out.print( i);
		}
		System.out.println("Printing using while loop ");
		while (number<=100)
		{
					System.out.println(number);
					number++;
		}
				System.out.println("Printing using do while loop ");
				do
				{
System.out.println(num);
num++;
				}
				while (num<=n);
	}
}
