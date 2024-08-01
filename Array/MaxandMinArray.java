//WAP to find the maximum and minimun values from an array
class  MaxandMinArray
{
	public static void main(String[] args) 
	{
		int [] numbers ={100,500,65,98,34,84,55};
		int max=0,min=numbers[0];
		for (int i =0;i<numbers.length ;i++ )
		{
			if (numbers[i]>max)
			{
				max=numbers[i];
			}
			if (numbers[i]<min)
			{
				min=numbers[i];
			}
		}
		System.out.println("Maximum value from an Array :"+max);
		System.out.println("Minimum value from an Array :"+min);
	}
}
