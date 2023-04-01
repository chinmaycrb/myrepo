package Demo;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class sumpair {
	long first, second;  
    public sumpair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
    
@Override
	public String toString() {
		return "sumpair [first=" + first + ", second=" + second + "]";
	}

public static void main(String[] args) {
	long a[]= {1, 2, 4, 5, 7};
	long b[]= {2,1,3};
	int x=4;
	ArrayList<sumpair>al=new ArrayList<>();
	for(int i=0; i<a.length; i++)
    {
        for(int j=0; j<b.length; j++)
        {
            if(a[i]+b[j] == x)
            {
                al.add(new sumpair(a[i], a[j]));
            }
        }
    }
	sumpair[] arr = new sumpair[al.size()];
    al.toArray(arr);
    arr.toString();
    System.out.println(arr);
}
}
