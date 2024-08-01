class CountNumberDivisableByThree 
{
	public static void main(String[] args) 
	{
		int [] numbers={7,5,12,13,11,4,16,18,9,3};
		int count=0;
		for (int i=0;i<numbers.length ;i++ )
		{
			if (numbers[i]%3==0)
			{
				count++;
			}
		}
		System.out.println("Number divisable by 3 :"+count);
	}
}
