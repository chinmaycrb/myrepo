package Demo;

import java.util.ArrayList;

import java.util.Collections;

public class leaders {
	static ArrayList<Integer> leaders(int arr[], int n){
        int right=Integer.MIN_VALUE;
        ArrayList<Integer>il=new ArrayList<>();
        for (int i=arr.length-1;i>=0;i--) {
        	if(arr[i]>right) {
        		il.add(arr[i]);
        		right=arr[i];
        		
        	}
        	
        }
       
    	Collections.reverse(il);
		return il;
    
    }
	public static void main(String[] args) {
		int a[]={16,17,5,4,3,5,2};
		System.out.println(leaders(a, 5));
}
}
