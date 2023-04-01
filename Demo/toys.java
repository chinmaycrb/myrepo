package Demo;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class toys {
	 static int toyCount(int N, int K, int arr[])
	    {
	        // code here
		 Arrays.sort(arr);
	        int p = 0;
	        for(int i=0;i<arr.length;i++){
	            if(K >= arr[i]){
	               // K = K - arr[i];
	                p++;
	            }
	        }
	        return p;
	    }
	 public static void main(String[] args) {
		int a[]= {1, 12, 5, 111, 200, 1000, 10};
		System.out.println(toyCount(0, 50, a));
	}
}
