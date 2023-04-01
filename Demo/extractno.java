package Demo;

public class extractno {
	long ExtractNumber(String S){
        //code here
		String[] a=S.split(" ");
		long l = 0;
		for(String s:a)
		{
			System.out.println(s);
			
			if (s!=("9"))
			{
				l=Long.parseLong(s);
				System.out.println("====================");
				System.out.println(l);
			}
			
    }
		return l;

		
		
	}
	public static void main(String[] args) {
		extractno en=new extractno();
		en.ExtractNumber("This is alpha 5057 and 97");
			
	}
}


