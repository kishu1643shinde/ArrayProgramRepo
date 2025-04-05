package org.programs;
import java.util.*;
public class CheckPalindromeArray {
	 static void recur(int a[],int start,int end) {
		if(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
		}else {
			return;
		}
		recur(a,start+1,end-1);
	}
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size=xyz.nextInt();
		int[] a=new int[size];
		int[] orgArr=new int[size];
		System.out.println("Enter the Value in Array: ");
		for(int  i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
			orgArr[i]=a[i];
		}
		
		CheckPalindromeArray.recur(a,0,a.length-1);
		System.out.println("Display Revers Array: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		boolean flag=false;
		for(int i=0;i<a.length/2;i++) {
			 if(a[i]==orgArr[i]) {
				flag=true;
				break;
			 }
			}
		
		if(flag) {
			System.out.println("Array is Palindrome...");
		}else {
			System.out.println("Array Not Palindrome....");
		}	
	}
}
