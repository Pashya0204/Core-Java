class ArrayDeclaration2 
{
	public static void main(String[] args) 
	{
	//one line declaration and instantiation
	double [] numbers={10,20,30,40,50};
	//Printing the array using for loop
	for (int i=0;i<numbers.length;i++ )
	{
		System.out.println(numbers[i]);
	}

	//Printing the array using forEach loop
	System.out.println("ForEach loop");
	for (double number : numbers )
	{
	System.out.println(number);
	}
		System.out.println("Hello World!");
	}
}
