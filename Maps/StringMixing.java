package Maps;

import java.util.HashMap;

/*Given two strings s1 and s2, we want to visualize how different the two strings are. We will only take into account the lowercase letters (a to z). First let us count the frequency of each lowercase letters in s1 and s2.

s1 = "A aaaa bb c"

s2 = "& aaa bbb c d"

s1 has 4 'a', 2 'b', 1 'c'

s2 has 3 'a', 3 'b', 1 'c', 1 'd'

So the maximum for 'a' in s1 and s2 is 4 from s1; the maximum for 'b' is 3 from s2. In the following we will not consider letters when the maximum of their occurrences is less than or equal to 1.

We can resume the differences between s1 and s2 in the following string: "1:aaaa/2:bbb" where 1 in 1:aaaa stands for string s1 and aaaa because the maximum for a is 4. In the same manner 2:bbb stands for string s2 and bbb because the maximum for b is 3.

The task is to produce a string in which each lowercase letters of s1 or s2 appears as many times as its maximum if this maximum is strictly greater than 1; these letters will be prefixed by the number of the string where they appear with their maximum value and :. If the maximum is in s1 as well as in s2 the prefix is =:.

In the result, substrings will be in decreasing order of their length and when they have the same length sorted alphabetically (more precisely sorted by codepoint); the different groups will be separated by '/'.

Hopefully other examples can make this clearer.

s1 = "my&friend&Paul has heavy hats! &"
s2 = "my friend John has many many friends &"
mix(s1, s2) --> "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &"
s2 = "my frie n d Joh n has ma n y ma n y frie n ds n&"
mix(s1, s2) --> "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1="Are the kids at home? aaaaa fffff"
s2="Yes they are here! aaaaa fffff"
mix(s1, s2) --> "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"
 */
public class StringMixing {
	public static void main(String[] args){
		test();
	}

	public static void test(){
		System.out.println(mix("Are the kids at home? aaaaa fffff", "Yes they are here! aaaaa fffff"));
	}

	public static String mix(String s1, String s2) {
		// your code
		HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hashMap2 = new HashMap<Character, Integer>();
		int len = Math.max(s1.length(), s2.length());
		for(int i=0;i<len;i++){
			if(i<s1.length()){
				char ch = s1.charAt(i);
				if(Character.isAlphabetic(ch)){
					if(hashMap1.containsKey(ch)){
						hashMap1.put(ch, hashMap1.get(ch) + 1);
					}
					else
						hashMap1.put(ch, 1);
				}
			}
			if(i<s2.length()){
				char ch = s2.charAt(i);
				if(Character.isAlphabetic(ch)){
					if(hashMap2.containsKey(ch))
						hashMap2.put(ch, hashMap2.get(ch) + 1);
					else
						hashMap2.put(ch, 1);
				}
			}
		}
		String result = "";
		for(Character key: hashMap1.keySet()){
			if(hashMap2.containsKey(key)){
				int val1 = hashMap1.get(key);
				int val2 = hashMap2.get(key);
				if(val1>val2){
					result+= "1:";
					for(int j=0;j<val1;j++)
						result += key;
					result+="/";
				}
				else if(val2>val1){
					result+= "2:";
					for(int j=0;j<val2;j++)
						result += key;
					result+="/";
				}
				else{
					if(val1 >1){
						result+= "=:";
						for(int j=0;j<val1;j++)
							result += key;
						result+="/";
					}
				}
			}
			else{
				int val = hashMap1.get(key);
				if(val>1){
					result+= "1:";
					for(int j=0;j<val;j++)
						result += key;
					result+="/";	
				}
			}
		}
		for(Character key : hashMap2.keySet()){
			if(result.indexOf(key)==-1){
				int val = hashMap2.get(key);
				if(val>1){
					result+= "2:";
					for(int j=0;j<val;j++)
						result += key;
					result+="/";

				}
			}
		}
		return result.substring(0, result.length()-1);
	}

}
/*Alternate solution that presents the string in a way in which characters are
 * sorted by the number of occurrences. Interesting approach of using a comparable
 * public class Mixing {

    public static String mix(String s1, String s2) {
        HashMap<Character,Count> map=new HashMap<>();
        for(char c:s1.toCharArray()){
            if(map.containsKey(c)){
                map.get(c).times1++;
            }
            else{
                Count count=new Count();
                count.c=c;
                count.times1++;
                map.put(c,count);
            }
        }
        for(char c:s2.toCharArray()){
            if(map.containsKey(c)){
                map.get(c).times2++;
            }
            else{
                Count count=new Count();
                count.c=c;
                count.times2++;
                map.put(c,count);
            }
        }
        List<Count> list=new ArrayList<Count>(map.values());
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for(Count c:list){
            if(c.getMax()>1&&c.c>='a'&&c.c<='z'){
                if(sb.length()!=0)
                    sb.append("/");
                sb.append(c.getMaxIndexString());
                sb.append(":");
                for(int i=0;i<c.getMax();i++){
                    sb.append(c.c);
                }
            }
        }
        return sb.toString();
    }
    private static class Count implements Comparable<Count>{
        char c;
        int times1=0;
        int times2=0;
        @Override
        public int compareTo(Count b){
            if(b.getMax()!=getMax())
                return b.getMax()-getMax();
            if(getMaxIndexString()!=b.getMaxIndexString()){
                return getMaxIndexString()-b.getMaxIndexString();
            }
            return c-b.c;
        }
        public int getMax(){
            return Math.max(times1,times2);
        }
        public int getMaxIndex(){
            return times1>times2?1:2;
        }
        public char getMaxIndexString(){
            return times1==times2?'=':times1>times2?'1':'2';
        }
    }
}
*/
