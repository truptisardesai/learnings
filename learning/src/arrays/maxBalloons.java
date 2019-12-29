package arrays;

/**
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

Example 1:



Input: text = "nlaebolko"
Output: 1
*/

class maxBalloons{
	public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b': ++b;
                        break;
                case 'a': ++a;
                        break;
                case 'l': ++l;
                        break;
                case 'o': ++o;
                        break;
                case 'n': ++n;
                        break;
            
            }
        }
        
        return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
    }
	
	public static void main(String args[]) {
    	String A = "nlaebolkot";
    	
    	int r = maxNumberOfBalloons(A);
    	System.out.println(r);
    	
    }
}