//Concat two arrays into one
class ConcatTwoArray 
{
	public static void main(String[] args) 
	{
		int [] num1={1,2,3};//length 3
		int [] num2={4,5,6};//length 3
		int [] num3 =concatArray(num1,num2);//created method for merging the array
	//printing the merged array
			System.out.println("Merged Array ");
	for (int arr3: num3)
		{
			System.out.print(arr3);
		}
	}
	 static int[] concatArray(int arr1[],int arr2[]){
		int size=(arr1.length)+(arr2.length);
		//for merging two arrays we need another one array whos size should be addition of two arrays size
		int [] array =new int[size];
		//merging 1st array into new array 
		for (int i =0;i<arr1.length;i++ )
		{
			array[i]=arr1[i];
		}
		//merging 2nd array into 3rd array
		for (int i =0;i<arr2.length;i++ )
		{
			array[i+arr1.length]=arr2[i];
		}
		//printing the merged array
		//System.out.println("Merged Array ");
		//for (int arr3: array)
		//{
			//System.out.print(arr3);
		//}
		return array;
	}
}
