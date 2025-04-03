package org.programs;
import java.util.*;
public class FrequencyEleArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size=xyz.nextInt();
		int[] a=new int[size];
		boolean[] b=new boolean[size];
		System.out.println("Enter the Value in Array: ");
		for(int  i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			if(a[i]!=-1) {
				count=1;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					    a[j]=-1;
					}
			}
			System.out.println(a[i]+"----> "+count);
			}
		}
		
//		System.out.println("Enter the element Find frequency: ");
//		int element=xyz.nextInt();
//		int count=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==element) {
//				count++;
//			}
//		}
//		System.out.println(element+"----> "+count);
	}

}
