package Demo;

public class exttract_digits {
public static void main(String[] args) {
	

	String s="hi my by kay 8787 90909";
	String b="";
 for(int i=0;i<s.length();i++)
 {
	 if(Character.isDigit(s.charAt(i)))
	 {
	
b+="    "+ s.charAt(i) ;

	 }
	 
 }
System.out.println(b.split("/"));
 s=b;
// s=s.trim();
 String p="   opopopo   ";
 p=p.trim();
 System.out.println(p);
System.out.println(s);
}
}

