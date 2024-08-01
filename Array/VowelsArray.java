//WAP to print vowels from an array
class VowelsArray 
{
	public static void main(String[] args) 
	{
		char ch []={'a','b','c','e','i','o','u','q','s','A','E','I','O','U','W','X'};
		for (int i =0;i<ch.length;i++  )
		{
	if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	{
		System.out.print(ch[i]+ " ");
	}
	else if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
	{
		System.out.print(ch[i]+ " ");
	}
		}

	}
}
