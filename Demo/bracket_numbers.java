package Demo;

import java.util.ArrayList;
import java.util.Stack;

public class bracket_numbers {
	ArrayList<Integer> barcketNumbers(String S) {
        // code here
    
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int p=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                p=p+1;
                res.add(p);
                s.push(p);
            }
            if(S.charAt(i)==')'){
                res.add(s.pop());
            }
        }
        return res;
    }
	public static void main(String[] args) {
		bracket_numbers bn=new bracket_numbers();
		System.out.println(bn.barcketNumbers("(aa(bdc))p(dee)"));
		
	}
};

