package StacksQueues;
import java.util.Stack;
public class BracketGrouping {

/*In English and programming, groups can be made using symbols such as "()" and "{}" that
 change meaning. However, these groups must be closed in the correct order to maintain
  correct syntax.

Your job in this kata will be to make a program that checks a string for correct grouping.
 For instance, the following groups are done correctly:

({})
[[]()]
[{()}]
The next are done incorrectly

{(})
([]
[])
A correct string cannot close groups in the wrong order, open a group but fail to close it,
 or close a group before it is opened.

Your function will take an input string that may contain any of the symbols "()" "{}" or 
"[]" to create groups.

It should return True if the string is empty or otherwise grouped correctly, or False if
it is grouped incorrectly.*/
	public static void main(String[] args) {
		tests();
	}
	
	public static void tests(){
		check(balancedParenthensies("({})"), true);
		check(balancedParenthensies("[[]()]"), true);
		check(balancedParenthensies("[{()}]"), true);
		check(balancedParenthensies("{(})"), false);
		check(balancedParenthensies("([]"), false);
		check(balancedParenthensies("(){}[]"), true);

	}
	private static void check(boolean a, boolean b) {
		// TODO Auto-generated method stub
		if(a==b)
			System.out.println("Passed test");
		else
			System.out.println("Failed test");
	
	}

	public static boolean balancedParenthensies(String s) {
		
		if(s.length()%2!=0){
			return false;
		}
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == '{' ||ch =='[' || ch =='(')
        		stack.push(ch);
        	else{
        		if(stack.isEmpty())
        			return false;
        		switch(ch){
        		case '}': if(stack.pop()!= '{'){ return false;}
        		break;
        		case ']': if(stack.pop()!= '['){ return false;}
        		break;
        		case ')': if(stack.pop()!= '('){ return false;}
        		break;
        		default : break;
        		}
        	}
        }
        
        return stack.isEmpty();
    }


}
