//WAP to copy one array into another
class CopyArray 
{
	public static void main(String[] args) 
	{
		int [] array1={1,2,3,4,5};
		int [] array2=new int[array1.length];
		System.out.println("Printing before copying array1");
		for (int array :array1 )
		{
			System.out.print(array);
		}
System.out.println();
		System.out.println("Printing before copying array2");
			for (int array :array2 )
		{
			System.out.print(array);
		}
System.out.println();
	for (int i =0;i<array1.length ;i++ )
		{
			array2[i]=array1[i];
		}
System.out.println("Printing after copying array1");
for (int array :array1 )
		{
			System.out.print(array);
		}
		System.out.println();
		System.out.println("Printing before copying array1 into array2");
			for (int array :array2 )
		{
			System.out.print(array);
		}
	}
}
