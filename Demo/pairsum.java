package Demo;

public class pairsum {
	public boolean canPair(int[] nums, int k) {
        // Code here
        boolean ret=false;
        for(int i=0;i<nums.length;i++)
        {
           // i++;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]/k==0){
                    ret=true;
                }
            }
        }
        return ret;
    }
	public static void main(String[] args) {
		pairsum ps=new  pairsum();
		int []arr = {9, 5, 7, 3};
	//	ps.canPair(arr, 0);
		
		System.out.println(ps.canPair(arr, 6));
	}
}

