package Demo;

import java.util.Iterator;
import java.util.Stack;

public class mic {

	public static int minIndexChar(String str, String patt)
    {
        // Your code here
        
        Stack<Character>st=new Stack<>();
        
        for(int i=0;i<=str.length()-1;i++) {
        	st.add(str.charAt(i));
        }
        System.out.println(st);
   
    
        for(int i=0;i<=patt.length()-1;i++)
        {
        	 Iterator itr=st.iterator();
        	 while(itr.hasNext())
        	 {
        		 //String ss=(String) itr.next();
        		 Character ss= (Character) itr.next();
        		 if(patt.charAt(i)==ss) {
        			 return 1;
        		 }
        	 }
        }
		return 0;
		
        
    }
	public static void main(String[] args) {
		System.out.println(minIndexChar("hasjkhflaskdf", "sdlkjfshd"));
	}
}
