package org.programs;

import java.util.*;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size in Array: ");
		int size = xyz.nextInt();
		int a[] = new int[size];

		System.out.println("Enter the value in Array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();
		}
		//Arrays.sort(a);
		int count=1;
		int max=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+1==a[i+1]) {
				count++;
				if(max<count)
				{
					max=count;
				}
				continue;
			}else 
			{
			 count=1;	
			}
			
		}
		System.out.println("lengt"
				+ "h is: "+max);
		
		
//		int maxLength = 1; 
//		for (int i = 0; i < a.length; i++) {
//			int current = a[i];
//			int count = 1;
//			boolean found = true;
//
//			while (found) {
//				found = false;
//				for (int j = 0; j < a.length; j++) {
//					if (a[j] == current + 1) {
//						current = a[j];
//						count++;
//						found = true;
//						break;
//					}
//				}
//			}
//
//			if (count > maxLength) {
//				maxLength = count;
//			}
//		}
//		System.out.println("Length of the Longest Consecutive Sequence is: " + maxLength);
 
	 }
}
