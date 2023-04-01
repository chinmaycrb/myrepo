package Demo;

public class arraypass {

	public static void strpass(String	str[])
	{
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i] + "");
	}
	}
	public static void main(String[] args) {
		arraypass ap=new arraypass();
	     String []s= {"I", "am", "ok"};
	     strpass(s);
	}
}
