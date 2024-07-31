class  ArrayDeclaration
{
public static void main(String[] args)
{
//Declaration of different type of Arrays
	int [] number;
	String  [] name; 
	char [] characters; 
	boolean [] array;
//Instantiating Arrays
	number=new int [4];
	name=new String [4];
	characters=new char[4];
	array =new boolean[4];
//Once array is instantiated with it's size,then it will assign with default values as per data type of array
//printing default values
//ex if array of int type then it will assign with 0 value by default,if double type then it will be 0.0 value
	System.out.println("Printing default values of int Array");
	for (int i=0;i<number.length ;i++ )
	{
	System.out.print(number[i]);
	}
	System.out.println();
//ex if array of String type then it will assign with null value by default,	
	System.out.println("Printing default values of String Array");
	for (int i=0;i<name.length ;i++ )
	{
	System.out.print(name[i]);
	}
	System.out.println();
//ex if array of Char type then it will assign with  '\u0000' (null character) for each element by default.  
	System.out.println("Printing default values of Char Array");
	for (int i=0;i<characters.length ;i++ )
	{
	System.out.print(characters[i]);
	}
	System.out.println();
//ex if array of boolean type then it will assign with  false for each element by default.  
	System.out.println("Printing default values of boolean Array");
	for (int i=0;i<array.length ;i++ )
	{
	System.out.print(array[i]);
	}
	System.out.println();
//Instantiating values  using index 
number[0]=10;
number[1]=20;
number[2]=30;
number[3]=40;
System.out.println("Printing int Array");
for (int i=0;i<number.length ;i++ )
	{
	System.out.print(number[i]);
	}
	System.out.println();
characters[0]='a';
characters[1]='b';
characters[2]='c';
characters[3]='d';
System.out.println("Printing Char Array");
for (int i=0;i<characters.length; i++ )
	{
	System.out.print(characters[i]);
	}

}
}




