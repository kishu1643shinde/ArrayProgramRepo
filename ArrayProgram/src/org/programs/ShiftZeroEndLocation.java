package org.programs;
import java.util.*;
public class ShiftZeroEndLocation {
    public static void main(String[] args) {
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("Enter the size of array: ");
	  int size = xyz.nextInt();
	  int a[] = new int[size];
	  System.out.println("Enter the value in  array: ");
	  for(int i=0;i<a.length;i++)
	  {
		  a[i]=xyz.nextInt(); 
	  }
	  int j=0;
	  for(int i=0;i<a.length;i++)
	  {
		 if(a[i]!=0) {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 j++;
		 }
	  }
	  System.out.println("display:");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println(a[i]);
	  }
	}

}
