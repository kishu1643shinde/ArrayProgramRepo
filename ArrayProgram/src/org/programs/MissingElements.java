package org.programs;
import java.util.*;
public class MissingElements {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Size Of Array: ");
		int size = xyz.nextInt();
		int []a=new int[size];//1 5 16 20 22
		System.out.println("Enter the value in Array: ");
		for(int i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			for(int j=a[i]+1;j<a[i+1];j++) {
				System.out.println(j);
			}
		}
	}

}
