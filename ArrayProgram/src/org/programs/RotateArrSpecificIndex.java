package org.programs;
import java.util.*;
public class RotateArrSpecificIndex {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
		int size = xyz.nextInt();
		int []a=new int[size];
		System.out.println("Enter the value in Array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the Index: ");
		int index=xyz.nextInt();
		
		for(int i=0;i<index;i++) {
			int temp=a[0];
			//i++;
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
			//index--;
		}
		System.out.println("Display: ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
