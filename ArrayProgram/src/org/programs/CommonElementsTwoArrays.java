package org.programs;
import java.util.*;
public class CommonElementsTwoArrays {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size=xyz.nextInt();
		int[] a=new int[size];
		int[] b=new int[size];
		System.out.println("Enter the Value in First Array: ");
		for(int  i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the Value in S Array: ");
		for(int  i=0;i<a.length;i++) {
			b[i]=xyz.nextInt();
		}
		boolean flag=false;
		int result=0;
		System.out.println("display Comman Elements: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}	
		}	
	}
}
