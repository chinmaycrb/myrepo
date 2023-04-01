package Demo;

import java.util.ArrayList;

public class Compute {
public String isSubset( long a1[], long a2[], long n, long m) {
        
	 ArrayList<Long>al=new ArrayList<>();
     for(long i:a1)
     {
         al.add(i);
     }
     for(long j:a2)
     {
         if(al.contains(j))
         {
             al.remove(j);
         }
         else
         {
             return "No";
         }
     }
     return "Yes";
 }

public static void main(String[] args) {
	Compute cmt=new Compute();
	long a[]= {11, 3, 7};
	long b[]= {11, 3, 7, 1,0};
	System.out.println(cmt.isSubset(a, b, 0, 0));
}
}

