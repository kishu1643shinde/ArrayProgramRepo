package org.programs;
import java.util.*;
public class FindMajorityElement {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the value in array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		Arrays.sort(a);
		int  count=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}else
			{
				System.out.println(a[i]+"--->"+count);
				count=1;
			}
			
		}
		System.out.println(a[a.length-1]+"--->"+count);
	}

}
