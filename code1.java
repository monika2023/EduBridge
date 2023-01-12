package Java;
import java.util.*;
import java.util.stream.IntStream;

public class FA {

	static int sortFA(Integer[] arr, int n)
	{
		int me = -1;
		for (int i = 0; i < n; i++)
		{
			me = Math.max(me, arr[i]);
		}
		int f[] = new int[me + 1];
		for (int i = 0; i < n; i++)
		{
			f[arr[i]]++;
		}
		int count = 0;
		for (int i = 0; i <= me; i++)
		{
			if (f[i] > 0) 
			{
				int temp = 100000 - i;
				arr[count] = 100000 * f[i] + temp;
				count++;
			}
		}
			return count;
	}

	static void printArr(Integer[] arr, int count)
	{
		for (int i = 0; i < count; i++)
		{
			int fc = arr[i] / 100000;
			int temp = 100000 - (arr[i] % 100000);
			for (int j = 0; j < fc; j++) 
			{
				System.out.print(temp + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		int T;
		int N;  
		Scanner sc=new Scanner(System.in);  
		T=sc.nextInt();  
		for (int x =1 ; x<=T ; x++) 
		{
		N=sc.nextInt();  
		int [] a = new int[10];  
		for(int i=0; i<N; i++)  
		{  
		a[i]=sc.nextInt();  
		}  
			Integer[] arr = IntStream.of( a ).boxed().toArray( Integer[]::new );
		int count = sortFA(arr, N);
		Arrays.sort(arr, Collections.reverseOrder());
		printArr(arr, count);
		System.out.print("\n");
		}
	}
}
