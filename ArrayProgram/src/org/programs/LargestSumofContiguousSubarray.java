package org.programs;
import java.util.*;
public class LargestSumofContiguousSubarray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size Of Array : ");
		int size = xyz.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the Value in array: ");
		for(int i=0;i<a.length;i++) {
			a[i] = xyz.nextInt();
		}
		int max=a[0];
		int sum=a[0];
//		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			
			if(sum+a[i]>a[i]) {
				sum=sum+a[i];
			}
			else {
				sum=a[i];
			}
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println("Max Sum is: "+max);
	}

}
