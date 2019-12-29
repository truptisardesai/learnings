package arrays;

class reverseOnlyLetters {
	public static String reverseOnlyLetter(String S) {
	       String result="";
	        int l= S.length();
	        int i=l-1;
	        int start =l,end=l-1;
	        //for (int i=l-1;i>=0;i--)
	        while(i<=end && end>0 && i>-1){
	        	//System.out.println(S.charAt(i));

	            if((S.charAt(i)<='z' && S.charAt(i)>='a') ||
	              (S.charAt(i)<='Z' && S.charAt(i)>='A') ||
	              (S.charAt(i)<='9' && S.charAt(i)>='0')) {
	            	start--;
	            	i--;
	            }
	                
	            else{
	                result=result + reverse (S.substring(start,end+1)) + S.charAt(i);
	                end=start-2;
	                start=start-1;
	                i=end;
	            }
	            
	        }
	        result=result + reverse (S.substring(start,end+1));
	        return result;

	    }
    
    static String reverse(String str){
        String r="";
        for(int i=str.length()-1;i>=0;i--){
             r=r+str.charAt(i);
        }
        return r;
    }
    
   
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int lo = 0, hi = S.length() - 1;
        
        while (lo < hi) {
            while (lo < hi && !Character.isLetter(chars[lo])) {
                lo++;
            }
            while (lo < hi && !Character.isLetter(chars[hi])) {
                hi--;
            }
            swap(chars, lo, hi);
            lo++;
            hi--;
        }
        
        return String.valueOf(chars);
    }
    
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    
    public static void main(String args[]) {
    	String s = "ab-cd";
    	
    	String r = reverseOnlyLetter(s);
    	System.out.println(r);
    	
    }
}