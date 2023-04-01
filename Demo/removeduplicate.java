package Demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate {
	public String removeDups(String S) {
        // code here
        //char[] s2=S.toCharArray();
        
		  Set<Character> str = new LinkedHashSet<>();
	        for(int i=0; i<S.length(); i++){
	            str.add(S.charAt(i));
	        }
	        String ss="";
	        for(char st:str)
	            ss+=st;
	        return ss;
	}
	public static void main(String[] args) {
		removeduplicate e=new removeduplicate();
	System.out.println(	e.removeDups("zvvz"));
	}
}

