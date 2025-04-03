package org.programs;
import java.util.*;
class RecursiveApp
{ 
	void recursive(int a[],int start,int end) {
		if(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
		}
		else {
			return;
		}
		recursive(a,start+1,end-1);
	}
}
public class ArrayReversApp {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int size=xyz.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the Value in Array: ");
		for(int  i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		RecursiveApp r = new RecursiveApp();
		r.recursive(a,0,a.length-1);
//		int end=a.length-1;
//		for(int i=0;i<a.length/2;i++) {
//			int temp=a[i];
//			a[i]=a[end];
//			a[end]=temp;
//			end--;
//		}
		System.out.println("Display: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
