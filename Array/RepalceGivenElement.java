//WAP to repalce given element in array
class RepalceGivenElement 
{
	public static void main(String[] args) 
	{
		int [] num={1,2,3,4,5};
		//replace 5 with 10
		int index=0;
		for (int i=0;i<num.length ;i++ )
		{
			if (num[i]==5)
			{
				num[i]=10;
			}
		}

	System.out.print(num[4]);
		System.out.println("Hello World!");
	}
}
