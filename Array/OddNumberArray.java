//WAP to print odd numbers from an array
class OddNumberArray 
{
	public static void main(String[] args) 
	{
		int numbers []={1,2,3,4,5,6,7,8,9};
		for (int i =0;i <numbers.length ;i++ )
		{
			if (numbers[i]%2!=0)
			{
				System.out.println(numbers[i]);
			}
		}

	}
}
