//WAP to find compare elements in an array and return true if array are identical
class EqualArray 
{
	public static void main(String[] args) 
	{
		int [] num1={1,2,3,4,5};
		int [] num2={1,2,3,4,5};
boolean equal=equalArray(num1,num2);
	if (equal != true)
	{
System.out.println("The arrays are not identical");
	}else
		System.out.println("The arrays are identical");
	}
	static boolean equalArray(int [] arr1,int[]arr2){
		//if both array size is not same then we can not comapre so return false
		if (arr1.length != arr2.length)
		{
			return false;
		}
		//checking arrays elements are identical or not if not then return true
		for (int i=0;i<arr1.length ;i++ )
		{
			if (arr1[i]!=arr2[i])
			{
				return false;
			}
		}
		//if above both con
		return true;
	}
}
