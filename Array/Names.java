//Question WAP to store 5 names and print at one line using for and for each loop
class Names 
{
	public static void main(String[] args) 
	{
		String names []=new String [5];
		names[0]="HTML";
		names[1]="CSS";
		names[2]="Javascript";
		names[3]="Core Java";
		names[4]="J2EE";
		System.out.println("Printing names using for loop");
		for (int i =0;i <names.length ;i++ )
		{
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.println("Printing names using for Each loop");
		for (String name : names )
		{
			System.out.print(name+" ");
		}
	}
}
