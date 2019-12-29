package arrays;

class climbingStairs {
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    
    public int climbStairsMemoized(int n) {
        if(n < 0)
            return 0;
        if(n == 1)
            return 1;
            
        int[] store = new int[n];
        
        store[0] = 1;
        store[1] = 2;
        
        for(int i = 2; i < n; ++i)
            store[i] = store[i-1] + store[i-2];
            
        return store[n-1];
    }
    
    public int climbStairMemoisedAndEfficient(int n) {
        // base cases
    if(n <= 0) return 0;
    if(n == 1) return 1;
    if(n == 2) return 2;
    
    int prev_step = 2;
    int prev_prev_step = 1;
    int all_ways = 0;
    
    for(int i=2; i<n; i++){
    	all_ways = prev_step + prev_prev_step;
    	prev_prev_step = prev_step;
        prev_step = all_ways;
    }
    return all_ways;
    }
    
    public static void main(String args[]) {

    	
    	int r1 = climbStairs(44);
    	System.out.println(r1);
    	
    }
}