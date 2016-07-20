package Strings;

public class DNA_Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check("TTTT", makeComplement("AAAA"));
		check("TACG", makeComplement("ATGC"));
		check("TATA", makeComplement("ATAT"));
		check("GCCA", makeComplement("CGGT"));
	}
	
	private static void check(String a, String b) {
		// TODO Auto-generated method stub
		if(a.equals(b))
			System.out.println("Passed test");
		else
			System.out.println("Failed test");
	
	}
	public static String makeComplement(String dna) {
		String s = "";
		for(int i = 0;i< dna.length();i++){
			char ch = dna.charAt(i);
			switch(ch){
			case 'A' : s = s + 'T';
			break;
			case 'T' : s = s + "A";
			break;
			case 'C' : s = s + "G";
			break;
			case 'G' : s = s + "C";
			break;
			default: break;
			}
		}
		return s;
	}
}

