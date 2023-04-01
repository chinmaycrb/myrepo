package Demo;

public class oneement {
	int findOnce(int arr[], int n)
    {
		
	        // Complete this function
	        int ans=0;
	        for(int i=0;i<arr.length;i++){
	            ans^=arr[i];
	        }
	        return ans;
    }  
    
	public static void main(String[] args) {
		oneement on=new oneement();
		int c[]= {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		System.out.println(on.findOnce(c, 4));
	}
}
