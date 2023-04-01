package Demo;


class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int temp=0;
        for(int i=0;i<=n;i++)
        {
            temp=temp+i;
            
        }
        System.out.println(temp);
        int temp2=0;
        for(int j=0;j<=array.length-1;j++)
        {
            temp2=temp2+array[j];
        }
       System.out.println(temp2);
       
       int missingno=temp-temp2;
       System.out.println("missing no is :"+missingno);
	return missingno;
    }
    public static void main(String[] args) {
		int a[]= {1,2,3,5};
		Solution sl=new Solution();
		sl.MissingNumber(a, 5);
			
				}
}