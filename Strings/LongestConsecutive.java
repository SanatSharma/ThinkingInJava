package Strings;

public class LongestConsecutive {

	public static void main(String[] args){
		test();
	}

	private static void testing(String actual, String expected) {
		if(actual.equals(expected))
			System.out.println("Test passed");
		else
			System.out.println("Test failed");
	}
	public static void test() {
		System.out.println("longestConsec Fixed Tests");
		testing(LongestConsecutive.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
		testing(LongestConsecutive.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
		testing(LongestConsecutive.longestConsec(new String[] {}, 3), "");
		testing(LongestConsecutive.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
		testing(LongestConsecutive.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
		testing(LongestConsecutive.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
		testing(LongestConsecutive.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
		testing(LongestConsecutive.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
		testing(LongestConsecutive.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");
	}


	public static String longestConsec(String[] strarr, int k) {
		String max = "";

		for(int i = 0;i<= strarr.length-k;i++){
			int c = 0;
			String temp = "";
			while(c<k){
				temp += strarr[i+c];
				c++;
			}
			if(temp.length() > max.length())
				max = temp;
		} 
		return max; 
	}
}
