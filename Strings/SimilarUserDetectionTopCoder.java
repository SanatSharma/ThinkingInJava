package Strings;
/*  	Each competitor on Topcoder must have a handle. Sometimes, different people may choose handles that look too similar to each other. For example, consider the handles "TOPCODER" and "T0PCODER". These two handles are different: the second character in the first handle is the letter 'O' (big oh), while the second character in the second handle is the digit '0' (zero). 





In this problem, all handles are nonempty strings. Each character in a handle must be a
letter ('a'-'z', 'A'-'Z') or a digit ('0'-'9'). We will consider two groups of characters
that look too similar to each other. The first group are the characters 'O' (big oh) 
and '0' (zero) mentioned above. The second group are the characters '1' (one), 'l' 
(lowercase ell), and 'I' (uppercase i). 

Strings S and T are called similar if we can change S into T by repeatedly replacing a 
character by another character from the same group. 

You are given the String[] handles. Return "Similar handles found" if there is at least
one pair of similar handles in handles. Otherwise, return "Similar handles not found".
Note that the quotes are for clarity only and that the return value is case sensitive.
 
Definition
    	
Class:	SimilarUserDetection
Method:	haveSimilar
Parameters:	String[]
Returns:	String
Method signature:	String haveSimilar(String[] handles)
(be sure your method is public)
    
 
Constraints
-	handles will contain between 2 and 50 elements, inclusive.
-	Each element in handles will contain between 1 and 50 characters, inclusive.
-	Each character in handles will be '0'-'9', 'a'-'z' or 'A'-'Z'.
 
Examples
0)	
    	
{"top", "coder", "TOPCODER", "TOPC0DER"}
Returns: "Similar handles found"
"TOPCODER" and "TOPC0DER" are similar.
1)	
    	
{"Topcoder", "topcoder", "t0pcoder", "topcOder"}
Returns: "Similar handles not found"
No two of these handles are similar. Note that case matters: the letter 'o' (lowercase
 oh) is not in the group with 'O' and '0'.
2)	
    	
{"same", "same", "same", "different"}
Returns: "Similar handles found"
Any two identical strings are similar.
3)	
    	
{"0123", "0I23", "0l23", "O123", "OI23", "Ol23"}
Returns: "Similar handles found"
These six handles are all similar to each other.
4)	
    	
{"i23", "123", "456", "789", "000", "o", "O"}
Returns: "Similar handles not found
*/
public class SimilarUserDetectionTopCoder {

	public static void main(String[] args) {
		System.out.println(haveSimilar(new String[]{"top", "coder", "TOPCODER", "TOPC0DER"}));
		System.out.println(haveSimilar(new String[]{"Topcoder", "topcoder", "t0pcoder", "topcOder"}));
		System.out.println(haveSimilar(new String[]{"same", "same", "same", "different"}));
			
	}

	public static String haveSimilar(String[] handles){
		for(int i=0;i<handles.length;i++){
			if(handles[i].indexOf("O")!=-1){
				
				for(int j=0;j<handles.length;j++){
				
					if(j!=i){
						if(handles[j].equals(handles[i]) || handles[j].indexOf("0")!=-1){
							System.out.println("Goes first");
							return "Similar handles found";
						}
					}
				}
			}
			if(handles[i].indexOf("1")!=-1){
				
				for(int j=0;j<handles.length;j++){
				
					if(j!=i){
						if(handles[j].equals(handles[i]) || handles[j].indexOf("l")!=-1 || handles[j].indexOf("I")!=-1){
							return "Similar handles found";
						}
					}
				}
			}
			
			if(handles[i].indexOf("l")!=-1){
				
				for(int j=0;j<handles.length;j++){
				
					if(j!=i){
						if(handles[j].equals(handles[i]) || handles[j].indexOf("I")!=-1 || handles[j].indexOf("1")!=-1){
							return "Similar handles found";
						}
					}
				}
			}
			
			if(handles[i].indexOf("s")!=-1 || handles[i].indexOf("S")!=-1){
				
				for(int j=0;j<handles.length;j++){
				
					if(j!=i){
						if(handles[j].equals(handles[i]) || handles[j].indexOf("t")!=-1 || handles[j].indexOf("T")!=-1) {
							return "Similar handles found";
						}
					}
				}
			}
		}
		return "NO similar matches";
	}
}
