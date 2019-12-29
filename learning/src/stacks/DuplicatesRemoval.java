package stacks;

class DuplicatesRemoval {
	public static String removeDuplicates(String S) {
        int i = 0, n = S.length();
        char[] stack = new char[n];
        for (int j = 0; j < n; ++j)
            if (i > 0 && stack[i - 1] == S.charAt(j))
                --i;
            else
                stack[i++] = S.charAt(j);
        return new String(stack, 0, i);
    }
    
    public static void main(String args[]) {
    	String s = "abbaca";
    	
    	System.out.println(removeDuplicates(s));
    	
    }
}