//WAP to find duplicate elements from an array
class  DuplicateElementArray
{
	public static void main(String[] args) 
	{
		int [] numbers={1,2,3,4,2,5,3,6,1};
		for (int i=0;i<numbers.length ;i++ )
		{
			for (int j =i+1;j<numbers.length ;j++ )
			{
				if (numbers[i]==numbers[j])
				{
					System.out.print(numbers[i]+" ") ;
				}
			}
		}
	
	}
}
