//WAP to sort the array in assendig order
class  AssendingArray
{
	public static void main(String[] args) 
	{
		int [] number={4,7,1,6,3,5,2,8,10};
				 int temp;       
		for (int i=0;i<number.length ;i++ )
		{
			for (int j=i+1;j<number.length ;j++ )
			{

				if (number[i]>number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
			System.out.print("[ ");
		for (int numbers : number )
		{
			System.out.print(numbers);
		}
					System.out.print(" ]");
	}
}
