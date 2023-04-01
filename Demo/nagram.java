package Demo;

import java.util.Arrays;

public class nagram {
	 public static boolean isAnagram(String a,String b)
	    {
	        
	       char c[]=a.toCharArray();
	       char d[]=b.toCharArray();
	       
	       Arrays.sort(d);
	       Arrays.sort(c);
	       
	      
	      return Arrays.equals(c, d) ;
	    }
	 public static void main(String[] args) {
		 
		String s="geeksforgeeks";
		String g="forgeeksgeeks";
		
		nagram n=new nagram();
		System.out.println(isAnagram(s, g));
		
		
	}
}
