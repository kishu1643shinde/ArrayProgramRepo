package org.programs;
import java.util.*;
public class FindSecondMax {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = xyz.nextInt();
		int []a=new int[size];
		System.out.println("Enter the Value In array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();//1 2 4 3 5 
		}
		int max1=0,max2=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			if(a[i]<max1 && a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println("Second Max Is: "+max2);
	}

}
