// WAP to find second maximum element from an array 
//We can use this logic only when there is no duplicate elements.
//If dupicate present this logic will give wrong numbers
class SecondMaximumElement 
{
	public static void main(String[] args) 
	{
		int [] num={1,9,6,5,3,2,4,8,7};
		int max,secondmax,secondmini;
		//1st sort array in assending order
		for (int i=0;i<num.length ;i++ )
		{
			for (int j=i+1;j<num.length ;j++ )
			{
				if (num[i]>num[j])
				{
					max=num[i];
					num[i]=num[j];
					num[j]=max;
				}
			}
		}
		for (int k=0;k<num.length ;k++ )
		{
			System.out.print(num[k]);
		}
		//if we sort array in assending order ,then we can find secind maxximun element by using array's length-2 
secondmax=num[num.length-2];
System.out.println("Second Maximum :"+secondmax);
	//if we want find secondminimum then we can use this formula arrayName[1]
	secondmini=num[1];
System.out.println("Second Manimum :"+secondmini);
	
	}

}
