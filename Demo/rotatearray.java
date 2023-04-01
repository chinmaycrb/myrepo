package Demo;

public class rotatearray {
	int search(int A[], int l, int h, int key)
    {
		
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
		
//		for(int i=0;i<A.length;i ++) {
//			
//		}
		int i=A[key];
		return i;
   
    }
	public static void main(String[] args) {
		rotatearray rt=new rotatearray();
		
		int b[]= {1,2,3,4,5};
		System.out.println(rt.search(b, 0, 0, 2));
		
	}
}
