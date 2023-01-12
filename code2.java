package Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EQ2 {

	public static void main(String[] args) {
		int N;  
		Scanner sc=new Scanner(System.in);  
		N=sc.nextInt();  
		int[] a = new int[N];  
		for(int i=0; i<N; i++)  
		{  
		a[i]=sc.nextInt();  
		}  

		for (int i = 0; i < a.length; i++)   
		{  
		for (int j = i + 1; j < a.length; j++)   
		{  
		int tmp = 0;  
		if (a[i] > a[j])   
		{  
		tmp = a[i];  
		a[i] = a[j];  
		a[j] = tmp;  
		}  
		}  
		}  
		
		int m = a[0];
		int min = m;
		int count=0;
		for (int i=0; i<N;i++)
		{
				if (a[i] == m)
				{
					count++;
				}
				m=m+min;	
		}
		System.out.print("Count = "+count);
	}
}
