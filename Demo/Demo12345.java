package Demo;

public class Demo12345 {

	Demo12345()
	   {
	         System.out.println("In the class A() constructor");
	   }
	   static
	   {
	           System.out.println("In the static block");
	   }
	   {
	            System.out.println("In the non-static block");
	   } 

	      public static void main(String args[])
	     {
	    	  Demo12345 a=new Demo12345();
	     }

}

