package Demo;

public class paranthesis {
	 static boolean ispar(String x)
	 {
		return x.contains("{") || x.contains("}")|| x.contains("[") || x.contains("]")||x.contains("[") ||x.contains("(") || x.contains(")");
		        
		        
		 
		       
	 }
	 public static void main(String[] args) {
		System.out.println(ispar(" [)}"));
	}
}
