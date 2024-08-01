//WAP to remove duplicates from an array
class  RemoveDuplicateElements
{
	public static void main(String[] args) 
	{
		int [] number={4,3,2,1,6,7,8,3,2,1,7,8,3};
		for (int i =0;i<number.length ;i++ )
		{
			for (int j=i+1;j<number.length ;j++ )
			{
				if (number[i]==number[j])
				{
					number[i]=0;
				}
			}
		}
		for (int k=0;k<number.length ;k++ )
		{
			if (number[k]!=0)
			{
				System.out.print(number[k]+" ");
			}
		}

	}
}
