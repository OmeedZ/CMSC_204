public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		
		System.out.println(Fibonacci(1)+"and"+Fibonacci(2)+"and" +Fibonacci(3));
		System.out.println(Fibonacci(4)+"and"+Fibonacci(5)+"and" +Fibonacci(6));
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) {  //Omeed Zarrabian
		if(num<=0) {
			return 0;
		}
		
		else {
			return sumOfArray(arr,num-1)+arr[num-1];
		}
		
	}
	
	public static int Fibonacci(int n) {
		int[] a=new int[n+1];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<=n;i++) {
			a[i]=a[i-2]+a[i-1];
		}
		return a[n];
	}

}