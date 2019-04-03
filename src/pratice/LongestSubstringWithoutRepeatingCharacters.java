package pratice;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		/* Example 1:

		Input: "abcabcbb"
		Output: 3 
		Explanation: The answer is "abc", with the length of 3. 
		
		Example 2:
		Input: "bbbbb"
		Output: 1
		Explanation: The answer is "b", with the length of 1.
		
		Example 3:
		Input: "pwwkew"
		Output: 3
		Explanation: The answer is "wke", with the length of 3. */
		
		String str="abcabcbb";
		String str1="bbbbb";
		String str2="pwwkew";
		
		String a=str.substring(0, 3);
		String b=str1.substring(1,2);
		String c=str2.substring(2, 5);
		
		System.out.println(str.substring(0, 3)+" "+"with the length of "+a.length());
		System.out.println(str1.substring(1,2)+" "+"with the length of "+b.length());
		System.out.println(str2.substring(2, 5)+" "+"with the length of "+c.length());
	}

}
