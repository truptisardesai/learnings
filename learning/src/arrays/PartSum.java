package arrays;
import java.util.Arrays;

class PartSum {
    public static boolean PartsEqualSum(int[] A) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum = sum + A[i];
        }
        int segment_sum =0;
        int flag=0; //,segment2_sum =0,segment3_sum =0;
        for (int i=0;i<A.length;i++){
            segment_sum = segment_sum+A[i];

        	if(segment_sum== sum/3){
                segment_sum=0;
                flag++;
            }
            
        }
        if(flag==3)// && segment_sum==sum/3)
            return true;
        else
        return false;
        
    }
    
    public static void main(String args[]) {
    	int[] s = new int[]{12,-4,16,-5,9,-3,3,8,0}; 
    	
    	boolean r = PartsEqualSum(s);
    	System.out.println(r);
    	
    }
}