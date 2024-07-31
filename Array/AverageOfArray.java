//WAP to find average of an array
class  AverageOfArray
{
	public static void main(String[] args) 
	{
		int numbers []={10,20,30,40,50,60,70,80,90,100};
		int average,sum =0;
		for (int i =0;i < numbers.length ;i++ )
		{
			sum +=numbers[i];
		}
		average=sum/numbers.length;
		System.out.println("Average of an array :"+average);
	}
}
