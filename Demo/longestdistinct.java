package Demo;

public class longestdistinct {
	static int longestSubstrDistinctChars(String S){
        // code here
        String s="";
        for(int i=0;i<s.length();i++){
            i++;
            for(int j=i+1;j<s.length();j++){
                
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(0);
                }else{
                    s=S.substring(S.charAt(i),S.charAt(j));
                    		
                        return s.length();
                    }
                }
                //return 0;
            }
		return s.length();
        
}
	public static void main(String[] args) {
		System.out.println(longestSubstrDistinctChars("geeksforgeeks"));
	}
}
