//WAP to find sum of even and odd numbers from an array
class  SumOfEvenOdd
{
	public static void main(String[] args) 
	{
		int [] numbers={1,2,3,4,5,6,7,8,9,10};
		int even=0,odd=0;
		for (int i =0;i<numbers.length ;i++ )
		{
			if (numbers[i]%2==0)
			{
				even+=numbers[i];
			}
			else
			{
				odd+=numbers[i];
			}
		}
			System.out.println("Sum of even numbers :"+even);
				System.out.println("Sum of odd numbers :"+odd);
	}
}
