package Test4;

public class Test4 {
	public static String findLongestCommonSequence(String str1, String str2) {
	    int len1 = str1.length();
	    int len2 = str2.length();
	    int[][] dp = new int[len1+1][len2+1];
	    int maxLen = 0, maxEnd = 0;
	    
	   
	    for (int i = 1; i <= len1; i++) {
	        for (int j = 1; j <= len2; j++) {
	            if (str1.charAt(i-1) == str2.charAt(j-1)) {
	                dp[i][j] = dp[i-1][j-1] + 1;
	                if (dp[i][j] > maxLen) {
	                    maxLen = dp[i][j];
	                    maxEnd = i; 
	                }
	            }
	        }
	    }
	    
	   
	    StringBuilder sb = new StringBuilder();
	    while (maxLen > 0) {
	        sb.insert(0, str1.charAt(maxEnd-1));
	        maxEnd--;
	        maxLen--;
	    }
	    return sb.toString();
	}

}
